var json = null;
var total = null;
var pageSize = 20;
var pageNo = 1;
var indexState = 2;



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
var h=myDate.getHours();       //获取当前小时数(0-23)
var m=myDate.getMinutes();     //获取当前分钟数(0-59)
var s=myDate.getSeconds();  

var now=year+'-'+p(month)+"-"+p(date)+" "+p(h)+':'+p(m)+":"+p(s);





//加载默认列表（全部雇主）
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
//添加雇主
function addEmployer() {
	$('#btn_employer_add').click(function() {
		if($("#name").val() == '' || $("#phone").val() == '' || $("#eTime").val() == '' || $("#content").val() == '') {
			alert("请完善信息！");
		} else if(!/^[0-9]*$/.test($("#phone").val())) {
			alert("手机号码输入格式错误");
		} else {
			var formData = new FormData(document.getElementById("employer_add"));
			$.ajax({
				type: "post",
				url: mainUrl + "addEmployer",
				data: formData,
				async: false,
				cache: false,
				contentType: false,
				processData: false,
				success: function(data) {
					//							main_code(data.code,data.msg);
					if(data.code == -999) {
						if(confirm("用户登录已失效，是否重新登录？")) {
							window.location.href = "login.html";
						}
					} else if(data.code == 1) {
						$('#addemployer').modal('hide');
						location.reload();
					} else {
						alert(data.msg);
					}
				},
				error: function(data) {
					alert("error");
				}
			});
		};
	});
};

//修改雇主
function modEmployer(v) {
	$('#mod_id').val(v.id);
	$('#mod_name').val(v.name);
	$('#mod_phone').val(v.phone);
	$('#mod_eTime').val(changeTime(v.time));
	$('#mod_address').val(v.address);
	$('#mod_content').val(v.content);
	$('#btn_employer_mod').click(function() {
		if($("#mod_name").val() == '' || $("#mod_phone").val() == '' || $("#mod_eTime").val() == '' || $("#mod_content").val() == '') {
			alert("请完善信息！");
		} else if(!/^[0-9]*$/.test($("#phone").val())) {
			alert("手机号码输入格式错误");
		} else {
			var formData = new FormData(document.getElementById("employer_mod"));
			formData.append("status", indexState);
			$.ajax({
				type: "post",
				url: mainUrl + "updateEmployer",
				data: formData,
				async: false,
				cache: false,
				contentType: false,
				processData: false,
				success: function(data) {
					//							main_code(data.code,data.msg);
					if(data.code == -999) {
						if(confirm("用户登录已失效，是否重新登录？")) {
							window.location.href = "login.html";
						}
					} else if(data.code == 1) {
						$('#modemployer').modal('hide');
						location.reload();
					} else {
						alert(data.msg);
					}
				},
				error: function(data) {
					alert("error");
				}
			});
		};
	});
};

//删除雇主
function deleteEmployer(v) {
	$.ajax({
		type: "post",
		url: mainUrl + "deleteEmployer",
		data: {
			id: v
		},
		success: function(data) {
			//							main_code(data.code,data.msg);
			if(data.code == -999) {
				if(confirm("用户登录已失效，是否重新登录？")) {
					window.location.href = "login.html";
				}
			} else if(data.code == 1) {
				location.reload();
			} else {
				alert(data.msg);
			}
		},
		error: function(data) {
			alert("error");
		}
	});
};


//获取追踪标签
function Noteloyer(nId){
		$.ajax({
		type:"post",
		datatype: 'json',
		url: "getEmployerTrackingByemployerId",
		data:{
			'employerId': nId,
			'start': 0,
			'limit': 4
		},
		success:function(data){
			if(data.code == 1) {
				var note_list = '';
				for (i = 0; i < data.data.result.length; i++) {
					note_list += "<li>"
					note_list +="<span class='delete-note' onclick='Deletenote("+data.data.result[i].id+")'>×</span>"
					note_list +="<p class='note-time'>发布时间：<span class='n-time'>"+data.data.result[i].etime+"</span></p>"
					note_list +="<div class='note-con'><i class='ico-san'></i><span class='note-txt'>"+data.data.result[i].econtent+"</span></div>"
					note_list +="</li>"
				}
				$('.note-list').html(note_list);
				
			} else {
				alert(data.msg);
			}
		},
		error: function(jqXHR) {
			alert("网络异常");
		}
		
	});	


//添加标签
$('#note-btn').click(function(){
		if($('#note-text').val() == ''){
			alert("标签信息内容不能为空");
		}else{
			$.ajax({
				type: "post",
				url: "addEmployerTracking",
				data: {
					etime:now,
					econtent:$('#note-text').val(),
					employerId:nId
				},
				success: function(data) {
					if(data.code == -999) {
						if(confirm("用户登录已失效，是否重新登录？")) {
							window.location.href = "login.html";
						}
					} else if(data.code == 1) {
						alert("添加成功");
						$('#note-text').val("");
					} else {
						alert(data.msg);
					}
				},
				error: function(data) {
					alert("error");
				}
			});
		}
		if ($('#note-text').val() == '') {
			return false;
		}else{
			var note_list = '';
			note_list += "<li>"
			note_list +="<span class='delete-note' >×</span>"
			note_list +="<p class='note-time'>发布时间：<span class='n-time'>"+now+"</span></p>"
			note_list +="<div class='note-con'><i class='ico-san'></i><span class='note-txt'>"+$('#note-text').val()+"</span></div>"
			note_list +="</li>"
			$('.note-list').prepend(note_list);
		}
		
	});
	
}


//删除标签

function Deletenote(id){
	$.ajax({
		type: "post",
		url:  "deleteEmployerTracking",
		data: {
			id: id
		},
		success: function(data) {
			if(data.code == 1) {
				alert("删除成功");
			} else {
				alert(data.msg);
			}
		},
		error: function(data) {
			alert("error");
		}
	});
	
}


//查看合同

function Lookpact(p){
	$('.u-name').html(p.name);
	$.ajax({
		type:"post",
		datatype: 'json',
		async : false,
		url: "http://192.168.1.134:8080/nzj/getPactListByEmployerId",
		data:{
			'employerId': p.id,
			'start': 0,
			'limit': 8
		},
		success:function(data){
			if(data.code == 1) {
				var list = '';
				for (i = 0; i < data.data.PactList.length; i++) {
					list += "<div class='pact-list'><div class='info-t'><span class='info-tit'>合同编号"+data.data.PactList[i].code+"</span><a href='javascript:;' class='btnj'>展开</a></div>"
					list +="<div class='pact-info'><div class='info-one'><ul class='clearfix'><li>雇主姓名：<span class='normal'>"+data.data.PactList[i].ename+"</span></li>"
					list +="<li>签约时间：<span class='normal'>"+data.data.PactList[i].ptime+"</span></li>"
					list +="<li>雇主电话：<span class='normal'>"+data.data.PactList[i].ephone+"</span></li>"
					list +="<li>雇主需求：<span class='normal'>"+data.data.PactList[i].econtent+"</span></li>"
					list +="<li>签约时长：<span class='normal'>"+data.data.PactList[i].duration+"</span></li>"
					list +="<li>服务费：<span class='normal'>"+data.data.PactList[i].cost+"</span></li>"
					list +="<li>上班时间：<span class='normal'>"+data.data.PactList[i].time+"</span></li>"
					list +="<li>雇主地址：<span class='normal'>"+data.data.PactList[i].econtent+"</span></li>"
					list +="<li>雇主需求：<span class='normal'>"+data.data.PactList[i].eaddress+"</span></li>"
					list +="</ul></div>"
					list +="<div class='info-two'><ul class='clearfix'>"
					list +="<li>服务人员姓名：<span class='normal'>"+data.data.PactList[i].aname+"</span></li>"
					list +="<li>服务人员电话：<span class='normal'>"+data.data.PactList[i].aphone+"</span></li>"
					list +="<li>薪资标准：<span class='normal'>"+data.data.PactList[i].salary+"</span></li>"
					list +="</ul></div>"
					list +="<div class='info-three'><span class='remark'>备注：</span>"
					list +="<p class='remark-info'>"+data.data.PactList[i].remark+"</p></div>"
					list +="</div></div>"
					
				}
				$('.model-main').html(list);
				
			} else {
				alert(data.msg);
			}
		},
		error: function(jqXHR) {
			alert("网络异常");
		}
		
	});	
}






//切换雇主列表状态
function EmployerListByStatus(v) {
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

//修改订单
function updateIndent(v) {
	$('#id').val(v);
	$('#xgdd_btn').click(function() {
		$.ajax({
			type: "post",
			url: "back/orders/updateOrder",
			dataType: "json",
			async: false,
			cache: false,
			headers: {
				"token": getCookie('token')
			},
			data: {
				id: $('#id').val(),
				state: $('#state').val()
			},
			success: function(data) {
				if(data.code == 100) {
					location.reload();
				}
			},
			error: function(jqXHR) {
				alert("网络异常");
			}
		})
	});
};

/********************************商品列表分页***************************************/
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
	if(indexState == 2) { //全部雇主
		$.ajax({
			type: "post",
			url: "getEmployerList",
			dataType: "json",
			async: false,
			cache: false,
			data: {
				'start': (pageNo - 1) * pageSize,
				'limit': pageSize,
			},
			success: function(data) {
				if(data.code == -999) {
					if(confirm("用户登录已失效，是否重新登录？")) {
						window.parent.location.href = "login.html";
					}
				} else if(data.code == 1) {
					json = data.data.result;
					total = data.data.count
				} else {
					alert(data.msg);
				}
			},
			error: function(jqXHR) {
				alert("网络异常");
			}
		})
	} else if(indexState == 1) { //已签约雇主
		$.ajax({
			type: "post",
			url: "getEmployerListByStatus",
			dataType: "json",
			async: false,
			cache: false,
			data: {
				'start': (pageNo - 1) * pageSize,
				'limit': pageSize,
				'status': 1
			},
			success: function(data) {
				if(data.code == -999) {
					if(confirm("用户登录已失效，是否重新登录？")) {
						window.parent.location.href = "login.html";
					}
				} else if(data.code == 1) {
					json = data.data.result;
					total = data.data.count
				} else {
					alert(data.msg);
				}
			},
			error: function(jqXHR) {
				alert("网络异常");
			}
		})
	} else if(indexState == 0) { //新单雇主
		$.ajax({
			type: "post",
			url: "getEmployerListByStatus",
			dataType: "json",
			async: false,
			cache: false,
			data: {
				'start': (pageNo - 1) * pageSize,
				'limit': pageSize,
				'status': 0
			},
			success: function(data) {
				if(data.code == -999) {
					if(confirm("用户登录已失效，是否重新登录？")) {
						window.parent.location.href = "login.html";
					}
				} else if(data.code == 1) {
					json = data.data.result;
					total = data.data.count
				} else {
					alert(data.msg);
				}
			},
			error: function(jqXHR) {
				alert("网络异常");
			}
		})
	} else if(indexState == -1) { //放弃 雇主
		$.ajax({
			type: "post",
			url: "getEmployerListByStatus",
			dataType: "json",
			async: false,
			cache: false,
			data: {
				'start': (pageNo - 1) * pageSize,
				'limit': pageSize,
				'status': -1
			},
			success: function(data) {
				if(data.code == -999) {
					if(confirm("用户登录已失效，是否重新登录？")) {
						window.parent.location.href = "login.html";
					}
				} else if(data.code == 1) {
					json = data.data.result;
					total = data.data.count
				} else {
					alert(data.msg);
				}
			},
			error: function(jqXHR) {
				alert("网络异常");
			}
		})
	} else if(indexState == -2) { //黑名单雇主
		$.ajax({
			type: "post",
			url: "getEmployerListByStatus",
			dataType: "json",
			async: false,
			cache: false,
			data: {
				'start': (pageNo - 1) * pageSize,
				'limit': pageSize,
				'status': -2
			},
			success: function(data) {
				if(data.code == -999) {
					if(confirm("用户登录已失效，是否重新登录？")) {
						window.parent.location.href = "login.html";
					}
				} else if(data.code == 1) {
					json = data.data.result;
					total = data.data.count
				} else {
					alert(data.msg);
				}
			},
			error: function(jqXHR) {
				alert("网络异常");
			}
		})
	};
	var jsonCount = total;
	var shang = getTotllePage(pageSize);
	//  var startIndex = (pageNo);
	//  var endIndex = (shang == pageNo)? jsonCount:pageSize;
	return json.slice(0, 20);
}

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

	var UQT_detailTable = $('#UQT_detailTable');
	UQT_detailTable.empty();
	var th = '<tr><th scope="col" class="eng_name" >姓名</th><th class="match_type" scope="col">需求</th><th scope="col" class="query_pro" >联系电话</th><th scope="col" class="dis_order" >地址</th><th scope="col"  class="query_pro">时间</th><th scope="col"  class="dis_dta">操作</th><th class="dis_hidden" style="display: none">隐藏属性</th></tr>';

	UQT_detailTable.append(th);
	var tr;
	$.each(UQTQueryMsg, function(i, eachData) {
		tr = $('<tr>');
		var id = eachData.id;
		var name = eachData.name;
		var content = eachData.content;
		var phone = eachData.phone;
		var address = eachData.address;
		var time = eachData.time;
		
		if(eachData.status !==1){
			$('.lookpact').hide();
		}
		if(eachData.status !==0 && eachData.status !==1){
			$('.addPact').hide();
		}
		
		
		
		tr.append("<td class='eng_name' title=" + name + ">" + name + "</td>" +
			"<td class='match_type' title=" + content + ">" + content + "</td>" +
			"<td class='query_pro' title=" + phone + ">" + phone + "</td>" +
			"<td class='dis_order' title=" + address + ">" + address + "</td>" +
			"<td class='query_pro' title=" + changeTime(time) + ">" + changeTime(time) + "</td>" +
			"<td class='dis_dta'>" +
//			"<a class='editOp' href=''  data-toggle='modal' data-target='#modemployer' onclick='modEmployer(" + JSON.stringify(eachData) + ")'>雇主追踪</a>" +
			"<a class='editOp addNote' href=''  data-toggle='modal' data-target='#noteloyer' onclick='Noteloyer(" + id + ")' >标签</a>" +
			"<a class='editOp' href=''  data-toggle='modal' data-target='#modemployer' onclick='modEmployer(" + JSON.stringify(eachData) + ")'>修改</a>" +
			"<a class='editOp addPact' href=''  data-toggle='modal' data-target='#addpactloyer' >添加合同</a>" +
			"<a class='editOp lookpact' href=''  data-toggle='modal' onclick='Lookpact(" + JSON.stringify(eachData) + ")'>查看合同</a>" +
			"<a class='editOp' href='javascript:void(0);' onclick='deleteEmployer(" + id + ")'>删除</a>" +
			"</td>" +
			"<td class='dis_hidden' style='display: none'></td>"
			
		);
				
			 
		UQT_detailTable.append(tr);
	
	});
}

/**
 *选择左侧checkbox
 *
 */
var optionCheckBoxes = function(data) {
	var checkType = $(data).is(':checked');
	var trs = $(data).parent().parent().parent().nextAll();

	if(checkType) {
		//全部选择
		trs.each(function(trNode) {
			var currentCheck = $(this).find('>td span input[type="checkbox"]');
			//alert(currentCheck.is(':checked'));
			currentCheck.attr("checked", true);
		});
	} else {
		//全部取消选择
		trs.each(function(trNode) {
			var currentCheck = $(this).find('>td span input[type="checkbox"]');
			//alert(currentCheck.is(':checked'));
			currentCheck.attr("checked", false);
		});
	}
}

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
			gopage_info = '&nbsp;<span class="normalsize" >转到</span><span id="go_page_wrap" style="display:inline-block;width:44px;height:18px;border:1px solid #DFDFDF;margin:0px 1px;padding:0px;position:relative;left:0px;top:5px;">' +
				'<input type="button" id="btn_go" onclick="kkpager.gopage(this);" style="width:44px;height:20px;line-height:20px;padding:0px;font-family:arial,宋体,sans-serif;text-align:center;border:0px;background-color:#0063DC;color:#FFF;position:absolute;left:0px;top:-1px;display:none;" value="确定" />' +
				'<input type="text" id="btn_go_input" onfocus="kkpager.focus_gopage()" onkeypress="if(event.keyCode<48 || event.keyCode>57)return false;" onblur="kkpager.blur_gopage()" style="width:42px;height:23px;text-align:center;border:0px;position:absolute;left:0px;top:0px;outline:none;" value="' + this.pno + '" /></span><span class="normalsize" >页</span>';
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

/*********************************订单列表分页***************************************/