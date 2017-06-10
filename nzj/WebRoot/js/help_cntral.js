/**
 * 共享阿姨，雇主
 */
var json = null;
var total = null;
var pageSize = 20;
var pageNo = 1;
var indexState = 1;
//预热舞台
$(function() {
	$("#Share").text('已共享雇主');
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
//点击标签页后更改对应文字------------------------------------------------------------
function addClientele() {
	$("#Share").text('添加共享雇主');
};

function shareClientele() {
	indexState = 1;
	$("#Share").text('已共享雇主');
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

function unShareClientele() {
	indexState = 2;
	$("#Share").text('未共享雇主');
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

function addShareNanny() {
	$("#Share").text('添加共享保姆');
};

function shareNanny() {
	indexState = -1;
	$("#Share").text('已共享保姆');
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

function unShareNanny() {
	indexState = -2;
	$("#Share").text('未共享保姆');
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
//----------------------------------------------------------------------------------

//添加雇主
function addClientele() {
	$('#add_share_clientele_btn').click(function() {
		if($("#add_content").val() == '' || $("#add_contact").val() == '' || $("#add_phone").val() == '' || $('#add_address').val() == '') {
			alert("请完善信息！");
		} else if(!/^1(3|4|5|7|8)\d{9}$/.test($("#add_phone").val())) {
			alert("联系电话格式错误");
		} else {
			var formData = new FormData(document.getElementById("add_clientele_form"));
			$.ajax({
				type: "post",
				url: mainUrl + "addShareEmployer",
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
						$('#add_share_clientele').modal('hide');
						location.reload();
						alert('添加成功');
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
function updateEmployer(v) {
	$('#mod_id').val(v.id);
	$('#mod_userId').val(v.userId);
	$('#mod_share').val(v.share);
	$('#mod_content').val(v.content);
	$('#mod_contact').val(v.contact);
	$('#mod_remark').val(v.remark);
	$('#mod_phone').val(v.phone);
	$('#mod_address').val(v.address);
	$('#mod_share_clientele_btn').click(function() {
		if($("#mod_content").val() == '' || $("#mod_contact").val() == '' || $("#mod_phone").val() == '' || $('#mod_address').val() == '') {
			alert("请完善信息！");
		} else if(!/^1(3|4|5|7|8)\d{9}$/.test($("#mod_phone").val())) {
			alert("联系电话格式错误");
		} else {
			var formData = new FormData(document.getElementById("mod_clientele_form"));
			$.ajax({
				type: "post",
				url: mainUrl + "updateShareEmployer",
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
						$('#mod_share_clientele').modal('hide');
						location.reload();
						alert('修改成功');
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
//删除已，未共享的雇主
function deleteEmployer(v) {
	$.ajax({
		type: "post",
		url: mainUrl + "deleteShareEmployer",
		data: {
			id: v
		},
		async: false,
		cache: false,
		success: function(data) {
			if(data.code == -999) {
				if(confirm("用户登录已失效，是否重新登录？")) {
					window.location.href = "login.html";
				}
			} else if(data.code == 1) {
				//						$('#addjoinTrace').modal('hide');
				location.reload();
				alert('删除成功');
			} else {
				alert(data.msg);
			}
		},
		error: function(data) {
			alert("error");
		}
	});
};
//添加共享阿姨
function addShareNanny() {
	$('#add_share_aunt_btn').click(function() {
		if($("#add_aunt_skill").val() == '' || $("#add_aunt_contact").val() == '' || $("#add_aunt_phone").val() == '' || $('#add_aunt_address').val() == '') {
			alert("请完善信息！");
		} else if(!/^1(3|4|5|7|8)\d{9}$/.test($("#add_aunt_phone").val())) {
			alert("联系电话格式错误");
		} else {
			var formData = new FormData(document.getElementById("add_aunt_form"));
			$.ajax({
				type: "post",
				url: mainUrl + "addShareAunt",
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
						$('#add_share_aunt').modal('hide');
						location.reload();
						alert('添加成功');
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

//修改共享阿姨
function updateAunt(v) {
	$('#mod_aunt_id').val(v.id);
	$('#mod_aunt_userId').val(v.userId);
	$('#mod_aunt_share').val(v.share);
	$('#mod_aunt_skill').val(v.skill);
	$('#mod_aunt_contact').val(v.contact);
	$('#mod_aunt_remark').val(v.remark);
	$('#mod_aunt_phone').val(v.phone);
	$('#mod_aunt_address').val(v.address);
	$('#mod_share_aunt_btn').click(function() {
		if($("#mod_aunt_skill").val() == '' || $("#mod_aunt_contact").val() == '' || $("#mod_aunt_phone").val() == '' || $('#mod_aunt_address').val() == '') {
			alert("请完善信息！");
		} else if(!/^1(3|4|5|7|8)\d{9}$/.test($("#mod_aunt_phone").val())) {
			alert("联系电话格式错误");
		} else {
			var formData = new FormData(document.getElementById("mod_aunt_form"));
			$.ajax({
				type: "post",
				url: mainUrl + "updateShareAunt",
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
						$('#mod_share_aunt').modal('hide');
						location.reload();
						alert('修改成功');
					} else {
						alert(data.msg);
					}
				},
				error: function(data) {
					alert("网络异常");
				}
			});
		};
	});
};

//删除已，未共享的阿姨
function deleteAunt(v) {
	$.ajax({
		type: "post",
		url: mainUrl + "deleteShareAunt",
		data: {
			id: v
		},
		async: false,
		cache: false,
		success: function(data) {
			if(data.code == -999) {
				if(confirm("用户登录已失效，是否重新登录？")) {
					window.location.href = "login.html";
				}
			} else if(data.code == 1) {
				//						$('#addjoinTrace').modal('hide');
				location.reload();
				alert('删除成功');
			} else {
				alert(data.msg);
			}
		},
		error: function(data) {
			alert("error");
		}
	});
};

//设置共享雇主状态
function onClienteleSwitch(id) {
	var shareEmployerUrl = '';
	if($('input[name="chk"]').prop("checked")) {
		shareEmployerUrl = 'setShareEmployer';
	} else {
		//		if(indexState == 2) {
		shareEmployerUrl = 'setUnShareEmployer';
		//		};
	};
	$.ajax({
		type: "post",
		url: shareEmployerUrl,
		data: {
			id: id
		},
		async: false,
		cache: false,
		success: function(data) {
			if(data.code == -999) {
				if(confirm("用户登录已失效，是否重新登录？")) {
					window.location.href = "login.html";
				}
			} else if(data.code == 1) {
				//						$('#addjoinTrace').modal('hide');
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

//设置共享阿姨状态
function onAuntSwitch(id){
	var shareAuntUrl = '';
	if($('input[name="chkA"]').prop("checked")) {
		shareAuntUrl = 'setShareAunt';
	} else {
		//		if(indexState == 2) {
		shareAuntUrl = 'setUnShareAunt';
		//		};
	};
	$.ajax({
		type: "post",
		url: shareAuntUrl,
		data: {
			id: id
		},
		async: false,
		cache: false,
		success: function(data) {
			if(data.code == -999) {
				if(confirm("用户登录已失效，是否重新登录？")) {
					window.location.href = "login.html";
				}
			} else if(data.code == 1) {
				//						$('#addjoinTrace').modal('hide');
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
/*********************************列表分页***************************************/

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
	var myUrl = '';
	if(indexState == 1) {
		myUrl = 'getShareEmployerList';
	} else if(indexState == 2) {
		myUrl = 'getUnShareEmployerList';
	} else if(indexState == -1) {
		myUrl = 'getShareAuntList';
	} else if(indexState == -2) {
		myUrl = 'getUnShareAuntList';
	};
	$.ajax({
		type: "post",
		url: mainUrl + myUrl,
		dataType: "json",
		async: false,
		cache: false,
		data: {
			'start': (pageNo - 1) * pageSize,
			'limit': pageSize
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
	});

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
	if(indexState == 1 || indexState == 2) { //构建雇主数据表
		var th = '<tr><th class="match_type" scope="col">需求</th><th scope="col"  class="chi_name">姓名</th><th class="eng_name" scope="col">联系电话</th><th class="match_type" scope="col">地址</th><th class="eng_name" scope="col">时间</th><th scope="col"  class="dis_dta">是否共享</th><th scope="col"  class="dis_dta">操作</th><th class="dis_hidden" style="display: none">隐藏属性</th></tr>';
		UQT_detailTable.append(th);
		var tr;
		$.each(UQTQueryMsg, function(i, eachData) {
			tr = $('<tr>');
			var listId = eachData.id;
			var content = eachData.content;
			var contact = eachData.contact;
			var phone = eachData.phone;
			var address = eachData.address;
			var time = eachData.time;
			var t = '';
			t += "<td class='match_type' title=" + content + ">" + content + "</td>" +
				"<td class='chi_name' title=" + contact + ">" + contact + "</td>" +
				"<td class='eng_name' title=" + phone + ">" + phone + "</td>" +
				"<td class='match_type' title=" + address + ">" + address + "</td>" +
				"<td class='eng_name' title=" + changeTime(time) + ">" + changeTime(time) + "</td>"
			if(indexState == 1) {
				t += "<td class='dis_dta'><span style='width: 60px; margin:0 auto; text-align: center;' class='checkbox checkbox-slider--b-flat checkbox-slider-md'><label><input type='checkbox' name='chk' onclick='onClienteleSwitch(" + listId + ")' checked><span></span></label></span></td>"
			} else if(indexState == 2) {
				t += "<td class='dis_dta'><span style='width: 60px; margin:0 auto; text-align: center;' class='checkbox checkbox-slider--b-flat checkbox-slider-md'><label><input type='checkbox' name='chk' onclick='onClienteleSwitch(" + listId + ")'><span></span></label></span></td>"
			};
			t += "<td class='dis_dta'>" +
				"<a class='editOp' href='' data-toggle='modal' data-target='#mod_share_clientele' onclick='updateEmployer(" + JSON.stringify(eachData) + ")'>修改</a>" +
				"<a class='editOp' href='javascript:void(0);' onclick='deleteEmployer(" + listId + ")'>删除</a>" +
				"</td>" +
				"<td class='dis_hidden' style='display: none'></td>"
			tr.append(t);
			UQT_detailTable.append(tr);
		});
	} else if(indexState == -1 || indexState == -2) { //构建阿姨数据表
		var th = '<tr><th class="match_type" scope="col">求职意向</th><th scope="col"  class="chi_name">姓名</th><th class="eng_name" scope="col">联系电话</th><th class="match_type" scope="col">地址</th><th class="eng_name" scope="col">时间</th><th scope="col"  class="dis_dta">共享状态</th><th scope="col"  class="dis_dta">操作</th><th class="dis_hidden" style="display: none">隐藏属性</th></tr>';
		UQT_detailTable.append(th);
		var tr;
		$.each(UQTQueryMsg, function(i, eachData) {
			tr = $('<tr>');
			var listId = eachData.id;
			var skill = eachData.skill;
			var contact = eachData.contact;
			var phone = eachData.phone;
			var address = eachData.address;
			var time = eachData.time;
			var t = '';
			t += "<td class='match_type' title=" + skill + ">" + skill + "</td>" +
				"<td class='chi_name' title=" + contact + ">" + contact + "</td>" +
				"<td class='eng_name' title=" + phone + ">" + phone + "</td>" +
				"<td class='match_type' title=" + address + ">" + address + "</td>" +
				"<td class='eng_name' title=" + changeTime(time) + ">" + changeTime(time) + "</td>" 
			if(indexState == -1) {
				t += "<td class='dis_dta'><span style='width: 60px; margin:0 auto; text-align: center;' class='checkbox checkbox-slider--b-flat checkbox-slider-md'><label><input type='checkbox' name='chkA' onclick='onAuntSwitch(" + listId + ")' checked><span></span></label></span></td>"
		    } else if(indexState == -2) {
				t += "<td class='dis_dta'><span style='width: 60px; margin:0 auto; text-align: center;' class='checkbox checkbox-slider--b-flat checkbox-slider-md'><label><input type='checkbox' name='chkA' onclick='onAuntSwitch(" + listId + ")'><span></span></label></span></td>"
			};
			t += "<td class='dis_dta'>" +
				"<a class='editOp' href='' data-toggle='modal' data-target='#mod_share_aunt' onclick='updateAunt(" + JSON.stringify(eachData) + ")'>修改</a>" +
				"<a class='editOp' href='javascript:void(0);' onclick='deleteAunt(" + listId + ")'>删除</a>" +
				"</td>" +
				"<td class='dis_hidden' style='display: none'></td>"
			tr.append(t);
			UQT_detailTable.append(tr);
		});
	}

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

		if(this.pagesize == 10)
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
				'<input type="text" id="btn_go_input" onfocus="kkpager.focus_gopage()" onkeypress="if(event.keyCode<48 || event.keyCode>57)return false;" onblur="kkpager.blur_gopage()" style="width:42px;height:22px;text-align:center;border:0px;position:absolute;left:0px;top:-4px;outline:none;" value="' + this.pno + '" /></span><span class="normalsize" >页</span>';
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

/*********************************列表分页***************************************/