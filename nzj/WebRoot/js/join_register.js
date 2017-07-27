//$(function() {
//	//一级菜单
//	$.ajax({
//		type: "post",
//		url: mainUrl + "getChildByParent",
//		dataType: "json",
//		async: false,
//		cache: false,
//		data: {
//			'parent': getCookie('sessionId'),
//			'start': 0,
//			'limit': 15
//		},
//		success: function(data) {
//			if(data.code == 1) {
//				var List = '';
//				List += "<li class='listTitle'>加盟商列表</li>"
//				for(var i = 0; i < data.data.UserlList.length; i++) {
//					List += '<li class="has-sub">'
//					List += '<a href="javascript:void(0);"><span>' + data.data.UserlList[i].id.company + '</span><label>' + data.data.UserlList[i].id.id + '</label><i class="fa fa-caret-right fa-fw pull-right"></i></a>'
//					List += '<ul class="sub-menu">'
//					List += '</ul>'
//					List += '</li>'
//				}
//				$('#joinList').html(List);
//				//								alert(data.data.UserlList.length);
//			} else if(data.code == -999) {
//				if(confirm("用户登录已失效，是否重新登录？")) {
//					window.parent.location.href = "login.html";
//				}
//			} else {
//				alert(data.msg);
//			}
//
//		},
//		error: function(jqXHR) {
//			alert("网络异常");
//		}
//	});
//	//二级菜单
//	$(".has-sub>a").click(function() {
//		$(this).parent().siblings().find(".sub-menu").slideUp();
//		$(this).parent().find(".sub-menu").slideToggle();
//		$.ajax({
//			type: "post",
//			url: mainUrl + "getChildByParent",
//			dataType: "json",
//			async: false,
//			cache: false,
//			data: {
//				'parent': $(this).find("label").html(),
//				'start': 0,
//				'limit': 15
//			},
//			success: function(data) {
//				if(data.code == 1) {
//					var List = '';
//					//				List += "<li class='listTitle'>加盟商列表</li>"
//					for(var i = 0; i < data.data.UserlList.length; i++) {
//						List += '<li class="has-sub-erji">'
//						List += '<a href="javascript:void(0);"><span>' + data.data.UserlList[i].id.company + '</span><label>' + data.data.UserlList[i].id.id + '</label><i class="fa fa-caret-right fa-fw pull-right"></i></a>'
//						List += '<ul class="sub-menu-sanji">'
//						List += '</ul>'
//						List += '</li>'
//					}
//					$('.sub-menu').html(List);
//					//								alert(data.data.UserlList.length);
//				} else if(data.code == -999) {
//					if(confirm("用户登录已失效，是否重新登录？")) {
//						window.parent.location.href = "login.html";
//					}
//				} else {
//					alert(data.msg);
//				}
//
//			},
//			error: function(jqXHR) {
//				alert("网络异常");
//			}
//		});
//		//三级菜单
//		$(".has-sub-erji>a").click(function() {
//			$(this).parent().siblings().find(".sub-menu-sanji").slideUp();
//			$(this).parent().find(".sub-menu-sanji").slideToggle();
//			$.ajax({
//				type: "post",
//				url: mainUrl + "getChildByParent",
//				dataType: "json",
//				async: false,
//				cache: false,
//				data: {
//					'parent': $(this).find("label").html(),
//					'start': 0,
//					'limit': 15
//				},
//				success: function(data) {
//					if(data.code == 1) {
//						if(data.data.UserlList.length == 0) {
//							$(".has-sub-erji>a>i").hide();
//						} else {
//							var List = '';
//							for(var i = 0; i < data.data.UserlList.length; i++) {
////								joinInfo(JSON.stringify(data.data.UserlList[i].id));
////								alert(JSON.stringify(data.data.UserlList[i].id));
//                              abc = data.data.UserlList[i].id;
//								List += '<li class="has-sub-sanji" style="padding-left: 30px;">'
//								List += '<a href="javascript:void(0);"><span>' + data.data.UserlList[i].id.company + '</span><label>' + data.data.UserlList[i].id.id + '</label><span class="threeIfon">'+data.data.UserlList[i].id+'</span></a>'
//								List += '</li>'
//							}
//							$('.sub-menu-sanji').html(List);
//						};
//
//					} else if(data.code == -999) {
//						if(confirm("用户登录已失效，是否重新登录？")) {
//							window.parent.location.href = "login.html";
//						}
//					} else {
//						alert(data.msg);
//					}
//
//				},
//				error: function(jqXHR) {
//					alert("网络异常");
//				}
//			});
//			$(".has-sub-sanji>a").click(function() {
////				var threeIfon = $(this).find(".threeIfon").html();
//				alert("a:"+JSON.stringify(abc.phone));
////				joinInfo(JSON.stringify(threeIfon));
//			});
//		});
//	});
//
//});
//
//function joinInfo(v){
//	var threeIfon = JSON.parse(v);
//	alert('a------------'+threeIfon.phone);
//};


//获取当前时间
function p(s) {
    return s < 10 ? '0' + s: s;
}

var myDate = new Date();
//获取当前年
var year=myDate.getFullYear();
//获取当前月
var month=myDate.getMonth()+1;
//获取当前日
var date=myDate.getDate(); 
/*var h=myDate.getHours();       //获取当前小时数(0-23)
var m=myDate.getMinutes();     //获取当前分钟数(0-59)
var s=myDate.getSeconds(); */ 

var now=year+'-'+p(month)+"-"+p(date);




var json = null;
var total = null;
var pageSize = 20;
var pageNo = 1;
var indexState = 1;


//加载默认列表
$(function() {
	builderUQTQueryMsg(getJsonArrayByPageSize(pageSize, pageNo));
	var totalPage = getTotllePage(pageSize);
	var totalRecords = total;
	//生成分页控件 根据分页的形式在这里设置
	kkpager.init({
		pno: pageNo,
		//总页码
		total: totalPage,
		//总数据条数
		totalRecords: totalRecords,
		//页面条数
		pageSize: pageSize
	});
	kkpager.generPageHtml();

});
//切换状态
function ChildByParentAndSupport(v) {
	indexState = v;
	builderUQTQueryMsg(getJsonArrayByPageSize(pageSize, pageNo));
	var totalPage = getTotllePage(pageSize);
	var totalRecords = total;
	//生成分页控件 根据分页的形式在这里设置
	kkpager.init({
		pno: pageNo,
		//总页码
		total: totalPage,
		//总数据条数
		totalRecords: totalRecords,
		//页面条数
		pageSize: pageSize
	});
	kkpager.generPageHtml();
};
/**
 * 获取总页数
 * @returns {number}
 */
var getTotllePage = function(pageSize) {
		var jsonCount = total;
		var shang = jsonCount / pageSize;
		var yushu = jsonCount % pageSize;
		if(yushu > 0) {
			shang++;
		}
		return shang;
	}
	/**
	 * 获取分页后的数据
	 * @param pageSize分页后的条目数
	 * @param pageNo当前第几页
	 * @returns {*}
	 */
var getJsonArrayByPageSize = function(pageSize, pageNo) {
	if(indexState == 1) { //已服务
		$.ajax({
			type: "post",
			url: "getChildByParentAndSupport",
			dataType: "json",
			async: false,
			cache: false,
			data: {
				'start': (pageNo - 1) * pageSize,
				'limit': pageSize,
				'support': 1,
				'parent':getCookie('sessionId')
			},
			success: function(data) {
				console.log(data)
				if(data.code == 1) {
					json = data.data.UserlList;
					total = data.data.count
				} else {
					alert(data.msg);
				}
			},
			error: function(data) {
				alert("网络异常");
			}
		})
	} else if(indexState == 0) { //未服务
		$.ajax({
			type: "post",
			url: "getChildByParentAndSupport",
			dataType: "json",
			async: false,
			cache: false,
			data: {
				'start': (pageNo - 1) * pageSize,
				'limit': pageSize,
				'support': 0,
				'parent':getCookie('sessionId')
			},
			success: function(data) {
				if(data.code == 1) {
					json = data.data.UserlList;
					total = data.data.count;
				} else {
					alert(data.msg);
				}
			},
			error: function(data) {
				alert("网络异常");
			}
		})
	};
	var jsonCount = total;
	var shang = getTotllePage(pageSize);
	//  var startIndex = (pageNo);
	//  var endIndex = (shang == pageNo)? jsonCount:pageSize;
	return json.slice(0, 20);
};

/**
 * 刷新页面数据
 * @param pageSize   每页显示条数
 * @param pageNum    第几页
 */
function refreshData(pageSize, pageNo) {
	builderUQTQueryMsg(getJsonArrayByPageSize(pageSize, pageNo));

	var totalPage = getTotllePage(pageSize);
	var totalRecords = total;
	//生成分页控件 根据分页的形式在这里设置
	kkpager.init({
		pno: pageNo,
		//总页码
		total: totalPage,
		//总数据条数
		totalRecords: totalRecords,
		//页面条数
		pageSize: pageSize
	});
	kkpager.generPageHtml();

}

/**
 * 构建表格数据
 */
var builderUQTQueryMsg = function(UQTQueryMsg) {
	var Join_Table = $('#JoinTable');
	Join_Table.empty();

	var th = '<tr><th class="hide-check" style="width: 60px;"><input type="checkbox" class="check_all" /></th><th scope="col" class="company" >公司名称</th><th class="dphone" scope="col">公司座机</th><th scope="col" class="contact" >联系人</th><th scope="col" class="telephone" >联系手机</th><th scope="col"  class="address">地址</th><th scope="col"  class="dis_dta">操作</th></tr>';

	Join_Table.append(th);
	var tr;
	$.each(UQTQueryMsg, function(i, eachData) {
		tr = $('<tr>');
		var id = eachData.id.id;
		var support = eachData.id.support;
		var company = eachData.id.company;
		var dphone = eachData.id.dphone;
		var contact = eachData.id.contact;
		var telephone = eachData.id.telephone;
		var address = eachData.id.address;
		var rank =eachData.id.rank;
		
		if(rank == 2){
			tr.append("<td class='hide-check'><input type='checkbox' class='check_a' /></td>"+
		"<td>"+company+"</td><td>"+dphone+"</td>"+
		"<td>"+contact+"</td><td>"+telephone+"</td><td>"+address+"</td>"+
		"<td class='dis_dta'>"+
		"<a href='javascript:;' class='C_details'>详细信息</a>"+
		"<a class='checkCity' href='javascipt:;' data-cityid='"+id+"' data-csupport='"+support+"' >查看市级</a>"+
		"<a href='javascript:;' class='serve-note' data-toggle='modal' data-target='#serveNote' data-arr='"+JSON.stringify(eachData)+"'>服务追踪</a>"+
		"<a href='javascript:;' class='z-serve' >转为已服务</a></td>");
		}else if(rank == 3){
			tr.append("<td class='hide-check'><input type='checkbox' class='check_a' /></td>"+
		"<td>"+company+"</td><td>"+dphone+"</td><td>"+contact+"</td><td>"+telephone+"</td><td>"+address+"</td><td class='dis_dta'><a href='javascript:;' class='C_details'>详细信息</a><a data-distid='"+data.data.UserlList[i].id.id+"' data-dsupport='"+data.data.UserlList[i].id.support+"' class='checkDist' href='javascipt:;' >查看区级</a><a href='javascript:;' class='serve-note' data-toggle='modal' data-target='#serveNote' data-arr='"+JSON.stringify(eachData)+"'>服务追踪</a><a href='javascript:;' class='z-serve' >转为已服务</a></td>");
		}else if(rank == 4){
			tr.append("<td class='hide-check'><input type='checkbox' class='check_a' /></td>"+
		"<td>"+company+"</td><td>"+dphone+"</td><td>"+contact+"</td><td>"+telephone+"</td><td>"+address+"</td><td class='dis_dta'><a href='javascript:;' class='C_details'>详细信息</a><a href='javascript:;' class='serve-note' data-toggle='modal' data-target='#serveNote' data-arr='"+JSON.stringify(eachData)+"'>服务追踪</a><a href='javascript:;' class='z-serve' >转为已服务</a></td>");
		}
			 
		Join_Table.append(tr);
		if(support == 1){
			$('.serve-note').hide();
			$('.z-serve').hide();
		}
		if(support == 0){
			$('.hide-check').hide();
		}
	
	});
};

//获取市级列表

$(document).on('click','.checkCity',function(){
	var cityId = $(this).data('cityid');
	var support = $(this).data('csupport');
	var tr="";
	$.ajax({
		type:"post",
		url:"getChildByParentAndSupport",
		async:false,
		data:{
			'start': 0,
			'limit': 15,
			'support': 0,
			'parent':cityId
		},
		success:function(data){
			if(data.code == 1){
				tr +='<tr><th class="hide-check" style="width: 60px;"><input type="checkbox" class="check_all" /></th><th scope="col" class="company" >公司名称</th><th class="dphone" scope="col">公司座机</th><th scope="col" class="contact" >联系人</th><th scope="col" class="telephone" >联系手机</th><th scope="col"  class="address">地址</th><th scope="col"  class="dis_dta">操作</th></tr>';
				for(var i=0; i<data.data.UserlList.length; i++){
					tr +="<tr><td class='hide-check'><input type='checkbox' /></td>"
					tr +="<td>"+data.data.UserlList[i].id.company+"</td>"
					tr +="<td>"+data.data.UserlList[i].id.dphone+"</td>"
					tr +="<td>"+data.data.UserlList[i].id.contact+"</td>"
					tr +="<td>"+data.data.UserlList[i].id.telephone+"</td>"
					tr +="<td>"+data.data.UserlList[i].id.address+"</td>"
					tr +="<td class='dis_dta'><a href='javascript:;' class='C_details'>详细信息</a><a data-distid='"+data.data.UserlList[i].id.id+"' data-dsupport='"+data.data.UserlList[i].id.support+"' class='checkDist' href='javascipt:;' >查看区级</a><a href='javascript:;' class='serve-note' data-toggle='modal' data-target='#serveNote' data-arr='"+JSON.stringify(data.data.UserlList[i])+"'>服务追踪</a><a href='javascript:;' class='z-serve' >转为已服务</a></td></tr>"
				}
				$('#CityTable').html(tr);
				
				if(support == 1){
					$('.serve-note').hide();
					$('.z-serve').hide();
				}
				if(support == 0){
					$('.hide-check').hide();
				}
			}
		}
	});
});


//获取区级列表

$(document).on('click','.checkDist',function(){
	var distId = $(this).data('distid');
	var support = $(this).data('dsupport');
	var tr = '';
	$.ajax({
		type:"post",
		url:"getChildByParentAndSupport",
		async:false,
		data:{
			'start': 0,
			'limit': 15,
			'support': 0,
			'parent':distId
		},
		success:function(data){
			if(data.code == 1){
				tr +='<tr><th class="hide-check" style="width: 60px;"><input type="checkbox" class="check_all" /></th><th scope="col" class="company" >公司名称</th><th class="dphone" scope="col">公司座机</th><th scope="col" class="contact" >联系人</th><th scope="col" class="telephone" >联系手机</th><th scope="col"  class="address">地址</th><th scope="col"  class="dis_dta">操作</th></tr>';
				for(var i=0; i<data.data.UserlList.length; i++){
					tr +="<tr><td class='hide-check'><input type='checkbox' /></td>"
					tr +="<td>"+data.data.UserlList[i].id.company+"</td>"
					tr +="<td>"+data.data.UserlList[i].id.dphone+"</td>"
					tr +="<td>"+data.data.UserlList[i].id.contact+"</td>"
					tr +="<td>"+data.data.UserlList[i].id.telephone+"</td>"
					tr +="<td>"+data.data.UserlList[i].id.address+"</td>"
					tr +="<td class='dis_dta'><a href='javascript:;' class='C_details'>详细信息</a><a href='javascript:;'  class='serve-note' data-toggle='modal' data-target='#serveNote' data-arr='"+JSON.stringify(data.data.UserlList[i])+"'>服务追踪</a><a href='javascript:;' class='z-serve' >转为已服务</a></td></tr>"
				}
				$('#DistTable').html(tr);
				if(support == 1){
					$('.serve-note').hide();
					$('.z-serve').hide();
				}
				if(support == 0){
					$('.hide-check').hide();
				}
			}
		}
	});
});



//获取服务追踪标签

$(document).on('click','.serve-note',function(){
	//获取服务类型
	var option ='';
	$.ajax({
		type:"post",
		url:"getSupportTypeList",
		async:false,
		data:{},
		success:function(data){
			if(data.code == 1){
				for(var i=0; i<data.data.result.length; i++){
					 option +="<option value='"+data.data.result[i].id+"'>"+data.data.result[i].name+"</option>"
				}
				$('.type-list').html(option);
			}
		},
		error:function(data){
			alert("error");
		}
	});

	var arr = $(this).data('arr');
	$.ajax({
		type:"post",
		datatype:'json',
		url:"getSupportTrackingByIdStatus",
		async:false,
		data:{
			'start':0,
			'limit':4,
			'userId':arr.id.id,
			'status':-1
		},
		success:function(data){
			if(data.code == 1) {
				var li = '';
				for (i = 0; i < data.data.SupportTrackingList.length; i++) {
					li += "<li>"
					li +="<span class='delete-note' onclick='Deleteservenote("+data.data.SupportTrackingList[i].id.id+")' alt='删除标签' title='删除标签'>×</span>"
					li +="<p class='note-time'>发布时间：<span class='n-time'>"+changeTime(data.data.SupportTrackingList[i].id.ttime)+"</span><span class='type-name'>"+data.data.SupportTrackingList[i].id.name+"</span></p>"
					li +="<div class='note-con'><i class='ico-san'></i><span class='note-txt'>"+data.data.SupportTrackingList[i].id.content+"<i class='edit-note'  title='修改标签'onclick='EditServenote("+JSON.stringify(data.data.SupportTrackingList[i].id)+")'></i></span></div>"
					li +="</li>"
				}
				$('#serve-note-list').html(li);
				
			} else {
				alert(data.msg);
			}					
		},
		error:function(data){
			alert('error');
		}
	});
	

//添加服务追踪标签

	$('#note-btn').one('click',function(){
		var typeId = $('.type-list option:selected').val();
		var typeTxt = $('.type-list option:selected').text();
		if($('#note-text').val() == ''){
			alert("合同追踪信息不能为空！")
			return false;
		}else{
			$.ajax({
				type:"post",
				datatype:'json',
				url:"addSupportTracking",
				data:{
					'id':arr.id.id,
					'content':$('#note-text').val(),
					'ttime':now,
					'typeId':typeId,
					'status':-1
				},
				success:function(data){
					if(data.code == 1){
						alert("添加服务跟踪状态成功");
						var li = '';
						li += "<li>"
						li +="<span class='delete-note' >×</span>"
						li +="<p class='note-time'>发布时间：<span class='n-time'>"+now+"</span><span class='type-name'>"+typeTxt+"</span></p>"
						li +="<div class='note-con'><i class='ico-san'></i><span class='note-txt'><span class='notetxt'>"+$('#note-text').val()+"</span><i class='edit-note'></i></span></div>"
						li +="</li>"
						$('#pact-note-list').append(li);
						$('#note-text').val("");
					}else{
						alert(data.msg);
					}
				},
				error:function(data){
					alert("error")
				}
			});
		}
	});
	return false;
	
	
});

//修改标签
function EditServenote(v){
	console.log(v)
	$(document).on('blur','.edit-input',function(){
		$.ajax({
			type:"post",
			datatype: 'json',
			url:"updateSupportTracking",
			data:{
				'id':v.id,
				'time':now,
				'content':$(this).val(),
				'status':-1,
				'typeId':v.typeId
			},
			success:function(data){
				if(data.code == 1){
					alert("修改服务跟踪成功");
				}else{
					alert("修改服务跟踪失败");
				}
			},
			error:function(data){
				alert("error");
			}
		});
	});
}

function Deleteservenote(id){
	$.ajax({
		type: "post",
		url:  "deleteSupportTacking",
		data: {
			id: id
		},
		success: function(data) {
			if(data.code == 1) {
				alert("添加删除合同服务跟踪成功");
			} else {
				alert(data.msg);
			}
		},
		error: function(data) {
			alert("error");
		}
	});
	
}








/**
 * Created by huipu on 2016/1/28.
 *	分页插件
 */
var kkpager = {
	//divID
	pagerid: 'div_pager',
	//当前页码
	pno: 1,
	//总页码
	total: 1,
	//总数据条数
	totalRecords: 0,
	//是否显示总页数
	isShowTotalPage: true,
	//是否显示总记录数
	isShowTotalRecords: true,
	//是否显示页码跳转输入框
	isGoPage: true,
	//页面条数默认大小
	pagesize: 20,
	//链接前部
	hrefFormer: '',
	//链接尾部
	hrefLatter: '',
	/****链接算法****/
	getLink: function(n) {
		//这里的算法适用于比如：
		//hrefFormer=http://baidu.com/news/20131212
		//hrefLatter=.html
		//那么首页（第1页）就是http://baidu.com/news/20131212.html
		//第2页就是http://baidu.com/news/20131212_2.html
		//第n页就是http://baidu.com/news/20131212_n.html
		if(n == 1) {
			return this.hrefFormer + this.hrefLatter;
		} else {
			return this.hrefFormer + '_' + n + this.hrefLatter;
		}
	},
	//跳转框得到输入焦点时
	focus_gopage: function() {
		var btnGo = $('#btn_go');
		$('#btn_go_input').attr('hideFocus', true);
		btnGo.show();
		btnGo.css('left', '0px');
		$('#go_page_wrap').css('border-color', '#6694E3');
		btnGo.animate({
			left: '+=44'
		}, 50, function() {
			//$('#go_page_wrap').css('width','88px');
		});
	},

	//跳转框失去输入焦点时

	blur_gopage: function() {
		setTimeout(function() {
			var btnGo = $('#btn_go');
			//$('#go_page_wrap').css('width','44px');
			btnGo.animate({
				left: '-=44'
			}, 100, function() {
				$('#btn_go').css('left', '0px');
				$('#btn_go').hide();
				$('#go_page_wrap').css('border-color', '#DFDFDF');
			});
		}, 400);
	},
	//根据页数刷新页面数据
	gopage: function(data) {
		var currentPage = '';
		if(data.tagName == 'A') {
			//点击的是a标签，这里写你的代码
			var tempPage = $(data).html();
			if(tempPage == '下一页') {
				currentPage = parseInt(this.pno) + 1;
			} else if(tempPage == '上一页') {
				currentPage = parseInt(this.pno) - 1;
			} else {
				currentPage = tempPage;
			}
		} else {
			//手动输入要跳转的页数
			var str_page = $("#btn_go_input").val();
			if(isNaN(str_page)) {
				$("#btn_go_input").val(this.next);
				return;
			}
			var n = parseInt(str_page);
			if(n < 1 || n > this.total) {
				$("#btn_go_input").val(this.next);
				return;
			}
			currentPage = n;
		}
		refreshData(this.pagesize, currentPage);
		//不管是点击页码还是手动输入页码，都要将下一页的页码选中
		//此时，只需要重新加载本组件即可
	},
	changepageSize: function(data) {
		//更改每页显示条数
		//刷新数据时初始化页数为1，
		var pageSize = $(data).val();
		//alert('要初始化的页面条数为:'+pageSize);
		refreshData(pageSize, 1);
	},
	//分页按钮控件初始化
	init: function(config) {

		//页面条数初始化
		this.pagesize = config.pageSize;
		//赋值
		this.pno = isNaN(config.pno) ? 1 : parseInt(config.pno);
		this.total = isNaN(config.total) ? 1 : parseInt(config.total);
		this.totalRecords = isNaN(config.totalRecords) ? 0 : parseInt(config.totalRecords);
		if(config.pagerid) {
			this.pagerid = pagerid;
		}
		if(config.isShowTotalPage != undefined) {
			this.isShowTotalPage = config.isShowTotalPage;
		}
		if(config.isShowTotalRecords != undefined) {
			this.isShowTotalRecords = config.isShowTotalRecords;
		}
		if(config.isGoPage != undefined) {
			this.isGoPage = config.isGoPage;
		}
		this.hrefFormer = config.hrefFormer || '';
		this.hrefLatter = config.hrefLatter || '';
		if(config.getLink && typeof(config.getLink) == 'function') {
			this.getLink = config.getLink;
		}
		//验证
		if(this.pno < 1) this.pno = 1;
		this.total = (this.total <= 1) ? 1 : this.total;
		if(this.pno > this.total) this.pno = this.total;
		this.prv = (this.pno <= 2) ? 1 : (this.pno - 1);
		this.next = (this.pno >= this.total - 1) ? this.total : (this.pno + 1);
		this.hasPrv = (this.pno > 1);
		this.hasNext = (this.pno < this.total);

		this.inited = true;
	},
	//生成分页控件Html
	generPageHtml: function() {
		if(!this.inited) {
			return;
		}

		var str_prv = '',
			str_next = '';
		if(this.hasPrv) {
			str_prv = '<a href="javascript:void(0);"  onclick="kkpager.gopage(this);" title="上一页">上一页</a>';
			//str_prv = '<a href="javascript:void(0);""javascript:void(0);""' + this.getLink(this.prv) + '" title="上一页">上一页</a>';
		} else {
			str_prv = '<span class="disabled">上一页</span>';
		}

		if(this.hasNext) {
			str_next = '<a href="javascript:void(0);" onclick="kkpager.gopage(this);"  title="下一页">下一页</a>';
			//str_next = '<a href="javascript:void(0);""javascript:void(0);""' + this.getLink(this.next) + '" title="下一页">下一页</a>';
		} else {
			str_next = '<span class="disabled">下一页</span>';
		}

		var str = '';
		var dot = '<span>...</span>';
		var total_info = '';
		if(this.isShowTotalPage || this.isShowTotalRecords) {
			total_info = '<span class="normalsize">共';
			if(this.isShowTotalPage) {
				total_info += this.total + '页';
				if(this.isShowTotalRecords) {
					total_info += '&nbsp;/&nbsp;';
				}
			}
			if(this.isShowTotalRecords) {
				total_info += this.totalRecords + '条数据';
			}

			total_info += '</span>';
		}

		var pageSize = '<select id="select_pagesize" onchange="kkpager.changepageSize(this)">';

		if(this.pagesize == 5)
			pageSize += '<option selected="selected" value="5" >5</option>';
		else if(this.pagesize == 10)
			pageSize += '<option selected="selected" value="10" >10</option>';
		else
			pageSize += '<option  value="10" >10</option>';
		if(this.pagesize == 15)
			pageSize += '<option selected="selected" value="15" >15</option>';
		else
			pageSize += '<option  value="15" >15</option>';
		if(this.pagesize == 20)
			pageSize += '<option selected="selected" value="20" >20</option>';
		else
			pageSize += '<option  value="20" >20</option>';
		//		if(this.pagesize == 50)
		//			pageSize += '<option selected="selected" value="50" >50</option>';
		//		else
		//			pageSize += '<option  value="50" >50</option>';
		//		if(this.pagesize == 75)
		//			pageSize += '<option selected="selected" value="75" >75</option>';
		//		else
		//			pageSize += '<option  value="75" >75</option>';
		//		if(this.pagesize == 100)
		//			pageSize += '<option selected="selected" value="100" >100</option>';
		//		else
		//			pageSize += '<option  value="100" >100</option>';
		pageSize += '</select><span class="normalsize" >条/页</span>';

		var gopage_info = '';
		if(this.isGoPage) {
			gopage_info = '&nbsp;<span class="normalsize" >转到</span><span id="go_page_wrap" style="display:inline-block;width:44px;height:22px;border:1px solid #DFDFDF;margin:0px 1px;padding:0px;position:relative;left:0px;top:5px;">' +
				'<input type="button" id="btn_go" onclick="kkpager.gopage(this);" style="width:44px;height:22px;line-height:22px;padding:0px;font-family:arial,宋体,sans-serif;text-align:center;border:0px;background-color:#41a1e6;color:#FFF;position:absolute;left:0px;top:-1px;display:none;" value="确定" />' +
				'<input type="text" id="btn_go_input" onfocus="kkpager.focus_gopage()" onkeypress="if(event.keyCode<48 || event.keyCode>57)return false;" onblur="kkpager.blur_gopage()" style="width:42px;height:20px;text-align:center;border:0px;position:absolute;left:0px;top:0px;outline:none;" value="' + this.pno + '" /></span><span class="normalsize" >页</span>';
		}

		//分页处理
		if(this.total <= 8) {
			for(var i = 1; i <= this.total; i++) {
				if(this.pno == i) {
					str += '<span class="curr">' + i + '</span>';
				} else {
					str += '<a href="javascript:void(0);" onclick="kkpager.gopage(this);" title="第' + i + '页">' + i + '</a>';
				}
			}
		} else {
			if(this.pno <= 5) {
				for(var i = 1; i <= 7; i++) {
					if(this.pno == i) {
						str += '<span class="curr">' + i + '</span>';
					} else {
						str += '<a href="javascript:void(0);" onclick="kkpager.gopage(this);" title="第' + i + '页">' + i + '</a>';
					}
				}
				str += dot;
			} else {
				str += '<a href="javascript:void(0);" onclick="kkpager.gopage(this);" title="第1页">1</a>';
				str += '<a href="javascript:void(0);" onclick="kkpager.gopage(this);" title="第2页">2</a>';
				str += dot;

				var begin = this.pno - 2;
				var end = this.pno + 2;
				if(end > this.total) {
					end = this.total;
					begin = end - 4;
					if(this.pno - begin < 2) {
						begin = begin - 1;
					}
				} else if(end + 1 == this.total) {
					end = this.total;
				}
				for(var i = begin; i <= end; i++) {
					if(this.pno == i) {
						str += '<span class="curr">' + i + '</span>';
					} else {
						str += '<a href="javascript:void(0);" onclick="kkpager.gopage(this);" title="第' + i + '页">' + i + '</a>';
					}
				}
				if(end != this.total) {
					str += dot;
				}
			}
		}

		str = "&nbsp;" + pageSize + "&nbsp;" + str_prv + str + str_next + total_info + gopage_info;
		$("#" + this.pagerid).html(str);
	}
};

function getParameter(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	var r = window.location.search.substr(1).match(reg);
	if(r != null) return unescape(r[2]);
	return null;
};