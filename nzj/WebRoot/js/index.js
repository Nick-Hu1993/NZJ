$(function(){
/*--------雇主页面-------------*/	
	
	//查看合同
	$('.close-btn').click(function(){
		$('.model-con').animate({'right':'-3000px'},300);
	});
	$(document).on('click','.lookpact',function(){
		$('.model-con').animate({'right':'0'},600);
	});
	$(document).on('click','.btnj',function(){
		$(this).toggleClass('on');
		if($(this).hasClass('on')){
			$(this).html("收起");
			$(this).parents('.pact-list').find('.pact-info').slideDown(300);
		}else{
			$(this).parents('.pact-list').find('.pact-info').slideUp(300);
				$(this).html("展开");
		}
	});
	
	//删除标签
	$(document).on('click','.delete-note',function(){
		$(this).parent().remove();
	});
				
	//修改标签
				
	$(document).on('click','.edit-note',function(){
		var txt = $(this).parents('.note-txt').text();
		var edit = "<input type='text' value='"+txt+"'  class='edit-input'>";
		$(this).parent().html(edit+'<i class="edit-note"></i>');
	})
	$(document).on('blur','.edit-input',function(){
		var newtxt = $(this).val(); 
		$(this).parents('.note-txt').html(newtxt+'<i class="edit-note"></i>'); 
	});
	

/*--------阿姨页面------------*/

//查看简历--基本信息
$(document).on('click','.edit-basic-btn',function(){
	$(this).parents(".aunt-basic-info").find('.oper-info-btn').slideDown(300);
	$(this).parents(".aunt-basic-info").find('.td-tit .red').show();
	
	var txt = $(this).parents(".aunt-basic-info").find('.td-input');
	var myArr = [];
	for(var i=0; i<txt.length; i++){
		myArr.push(txt.eq(i).text());	
	}
		for(var j=0; j<myArr.length; j++){
		txt.eq(j).html("<input type='text' id='au-"+txt.eq(j).attr('name')+"' name='"+txt.eq(j).attr('name')+"' value='"+myArr[j]+"' />");
	}
		
	/*点击取消按钮*/
	$('.off-info-btn').click(function(){
		$(this).parent('.oper-info-btn').slideUp(300);
		$(this).parents(".aunt-basic-info").find('.td-tit .red').hide();
		
		for(var v=0; v<myArr.length; v++){
			$(this).parents(".aunt-basic-info").find('.td-input').eq(v).html(myArr[v])
		}
	});		
});



//查看阿姨简历--技能专长

$(document).on('click','.edit-skill-btn',function(){
	
	$(this).parents(".aunt-skill-info").find('.oper-info-btn').slideDown(300);
	$(this).parents(".aunt-skill-info").find('.td-select').fadeIn(300);
	$(this).parents(".aunt-skill-info").find('.td-list span').addClass('on');
	
	//点击删除按钮
	$(document).on('click','.td-list span i',function(){
		$(this).parents('.td-list span').remove();
	});
});
/*点击添加按钮*/
$(document).on('click','.add-skill-btn',function(){
	var txt = $(this).parents('.td-select').find('select option:selected').val();
	var val = $(this).parents('.td-select').find('select option:selected').attr('name');
	$(this).parents('tr').find('.td-list').append("<span name='"+val+"'  class='on off'>"+txt+"<i>×</i></span>")
});


/*点击保存按钮*/
/*$(document).on('click','.keep-skill-btn',function(){
	$(this).parent('.oper-info-btn').slideUp(300);
	$(this).parents(".aunt-skill-info").find('.td-select').fadeOut(300);
	$(this).parents(".aunt-skill-info").find('.td-list span').removeClass('off');
	$(this).parents(".aunt-skill-info").find('.td-list span').removeClass('on');
});*/
/*点击取消按钮*/
$(document).on('click','.off-info-btn',function(){
	$(this).parent('.oper-info-btn').slideUp(300);
	$(this).parents(".aunt-skill-info").find('.td-select').fadeOut(300);
	$(this).parents(".aunt-skill-info").find('.td-list span').removeClass('on');
	$(this).parents(".aunt-skill-info").find('.td-list span.off').remove();
	
});

//查看阿姨简历--紧急联系人

$(document).on('click','.add-contact-btn',function(){
	$(this).parents('.aunt-contact-info').find('.oper-info-btn').slideDown(300);
	var tr = $("<tr>");
	tr.append("<td class='td-tit'>姓名</td>"+
			"<td class='td-input'><input type=text class='cnam' /></td>"+
			"<td class='td-tit'>关系</td>"+
			"<td class='td-input'><input type=text class='relation' /></td>"+
			"<td class='td-tit'>工作状况</td>"+
			"<td class='td-input'><input type=text class='workstatus' /></td>"+
			"<td class='td-tit'>联系电话</td>"+
			"<td class='td-input'><input type=text class='cphone' /></td>"+
			"<td style='padding: 0; text-align: center;'><a href='javascript:;' class='delete-contact-btn iconfont icon-shanchu2'></a></td>");
	$(this).parents('.aunt-contact-info').find('.aunt-contact-con tbody').append(tr);
	
});
/*删除按钮*/
$(document).on('click','.delete-contact-btn',function(){
	$(this).parents("tr").remove();
});

/*点击保存按钮*/
/*$(document).on('click','.keep-contact-btn',function(){
	var input = $(this).parents(".aunt-contact-con").find('input');
		if(input.val() == ''){
			alert("请完善信息再保存");
		}else{
			$(this).parents(".aunt-contact-con").find('input').parents('tr').remove();
			var tr = $("<tr>");
			tr.append("<td class='td-tit'>姓名</td>"+
				"<td class='td-input'>"+input.eq(0).val()+"</td>"+
				"<td class='td-tit'>关系</td>"+
				"<td class='td-input'>"+input.eq(1).val()+"</td>"+
				"<td class='td-tit'>工作状况</td>"+
				"<td class='td-input'>"+input.eq(2).val()+"</td>"+
				"<td class='td-tit'>联系电话</td>"+
				"<td class='td-input'>"+input.eq(3).val()+"</td>"+
				"<td style='padding: 0; text-align: center;'><a href='javascript:;' class='delete-contact-btn iconfont icon-shanchu2'></a></td>");
			$(this).parent('.oper-info-btn').slideUp(300);
		}
	$(this).parents('.aunt-contact-info').find('.aunt-contact-con tbody').append(tr);
});*/

/*点击取消按钮*/
$(document).on('click','.off-info-btn',function(){
	$(this).parent('.oper-info-btn').slideUp(300);
	$(this).parents(".aunt-contact-con").find('input').parents('tr').remove();
});





//查看阿姨简历--工作经历
$(document).on('click','.add-work-btn',function(){
	$(this).parents(".aunt-work-info").find('.oper-info-btn').slideDown(300);
	var table =$("<table>");
	table.append("<tbody><tr>"+
			"<td class='td-tit'>起止时间</td><td class='works' style='padding-left:3px;'><input type='text' class='time' style='width:200px;'/></td>"+
			"<td rowspan='2' class='td-btn'><a href='javascript:;' class='delete-work-btn iconfont icon-shanchu2'></a></td></tr>"+
			"<tr><td class='td-tit'>主要工作</td>"+
			"<td class='works work-con' style='padding-left:3px;'><textarea class='worker' cols='100' rows='3' style='resize:none;' ></textarea></td></tr></tbody>");
			$('.aunt-work-con .table-con').append(table);		
			
});

/*点击删除按钮*/
$(document).on('click','.delete-work-btn',function(){
	$(this).parents('table').remove();
	
});

/*点击保存按钮*/
$(document).on('click','.keep-work-btn',function(){
	var input = $(this).parents(".aunt-work-con").find('input');
	var text = $(this).parents(".aunt-work-con").find('textarea');
	if(input.val() == '' || text.val() == ''){
		alert('请完善信息再保存');
	}else{
		$(this).parents(".aunt-work-info").find('textarea').parents('table').remove();
		var table =$("<table>");
		table.append("<tbody><tr>"+
				"<td class='td-tit'>起止时间</td><td class='works' style='padding-left:3px;'>"+input.val()+"</td>"+
				"<td rowspan='2' class='td-btn'><a href='javascript:;' class='delete-work-btn iconfont icon-shanchu2'></a></td></tr>"+
				"<tr><td class='td-tit'>主要工作</td>"+
				"<td class='works work-con' style='padding-left:3px;'>"+text.val()+"</td></tr></tbody>");
				$('.aunt-work-con .table-con').append(table);
		$(this).parent('.oper-info-btn').slideUp(300);
	}
	
});

/*点击取消按钮*/
$(document).on('click','.off-info-btn',function(){
	$(this).parent('.oper-info-btn').slideUp(300);
	$(this).parents(".aunt-work-info").find('textarea').parents('table').remove();
});
	
				
});

//员工登录时，权限控制左侧菜单栏
function liclick(self){   
	var index = $(self).data('index');
    if(getCookie('permission') == 2) {
		$.ajax({
			type: "post",
			url:  "getStaffAuthorityById",
			data: {
					id: index
				},
			async: false,
			cache: false,
			success: function(data) {
				if(data.code == 1) {
				} else if(data.code == 0) {
					$(self).children("a").attr('href', 'javascript:void(0);')
						alert('权限不足,无法访问!');	
				} else {
					alert(data.msg);
				}
			},
			error: function(data) {
				alert("网络异常");
			}
		});
	}			
};




function changeTime(ts) { //时间戳转时间函数
	//	var timestamp = new Date(parseInt(ts) * 1000).toLocaleString().replace(/年|月/g, "-").substr(0, 8);
	var date = new Date(parseInt(ts) * 1000);
	var seperator1 = "-";
	var seperator2 = ":";
	var month = date.getMonth() + 1;
	var strDate = date.getDate();
	var getHours = date.getHours(); //时
	var getMinutes = date.getMinutes(); //分
	var getSeconds = date.getSeconds(); //秒
	if(month >= 1 && month <= 9) {
		month = "0" + month;
	}
	if(strDate >= 0 && strDate <= 9) {
		strDate = "0" + strDate;
	}

	if(getHours >= 1 && getHours <= 9) {
		getHours = "0" + getHours;
	}
	if(getMinutes >= 1 && getMinutes <= 9) {
		getMinutes = "0" + getMinutes;
	}
	if(getSeconds >= 1 && getSeconds <= 9) {
		getSeconds = "0" + getSeconds;
	}
	var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate +
		" " + getHours + seperator2 + getMinutes +
		seperator2 + getSeconds;
	//		$('#eTime').val(currentdate.substr(0,10));
	return currentdate.substr(0, 10);

}