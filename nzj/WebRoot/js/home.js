$(document).ready(function() {
//获取主页面阿姨共享列表
	$.ajax({
		type: "post",
		url: "getAllShareAuntList",
		data: {
			start: 0,
			limit: 6
		},
		async: false,
		cache: false,
		success: function(data) {
			if(data.code == 1) {
				var nanny_list = '';
				for(i = 0; i < data.data.result.length; i++) {
					nanny_list += "<div class='sender'>"
					nanny_list += "<div class='a'>"
					if(i==0){
						nanny_list += "<img style='width: 80px; height: 80px;' src='image/0.jpg' class='img-circle'>"
					}else{
						nanny_list += "<img style='width: 80px; height: 80px;' src='image/"+i+".png' class='img-circle'>"
					}
					nanny_list += "</div>"
					nanny_list += "<div class='b'>"
					nanny_list += "<div class='left_triangle'></div>"
					nanny_list += "<div >"
					nanny_list += "<div class='shareEmployerContent'><span style='font-size: 18px;'>求职意向:&nbsp</span><span title='"+data.data.result[i].skill+"'>"+data.data.result[i].skill+"</span></div>"
					nanny_list += "<div class='shareEmployerButtom'>联系人:"+data.data.result[i].contact+"&nbsp;&nbsp;&nbsp;&nbsp;地址;"+data.data.result[i].address+"&nbsp;&nbsp;&nbsp;&nbsp;联系电话:"+data.data.result[i].phone+"&nbsp;&nbsp;&nbsp;&nbsp;发表时间:"+changeTime(data.data.result[i].time)+"</div>"
					nanny_list += "</div>"
					nanny_list += "</div>"
					nanny_list += "</div>"
//					if(i % 2 != 0) {
//						nanny_list += "<tr style='background: #e0e0e0;'><td class='home_table'><img src='image/3.png' /></td><td class='home_table1' title='能力:"+data.data.result[i].skill+"'>" + data.data.result[i].skill + "</td><td class='home_table2' title='联系人:"+data.data.result[i].contact+"'>" + data.data.result[i].contact + "</td><td class='home_table2' title='联系电话："+data.data.result[i].phone+"'>" + data.data.result[i].phone + "</td><td class='home_table5' title='备注:"+data.data.result[i].remark+"'>" + data.data.result[i].remark + "</td><td class='home_table3' title='发布时间："+changeTime(data.data.result[i].time)+"'>" + changeTime(data.data.result[i].time) + "</td></tr>"
//					} else {
//						nanny_list += "<tr style='background: #f1f2f7;'><td class='home_table'><img src='image/3.png' /></td><td class='home_table1' title='能力:"+data.data.result[i].skill+"'>" + data.data.result[i].skill + "</td><td class='home_table2' title='联系人:"+data.data.result[i].contact+"'>" + data.data.result[i].contact + "</td><td class='home_table2' title='联系电话："+data.data.result[i].phone+"'>" + data.data.result[i].phone + "</td><td class='home_table5' title='备注:"+data.data.result[i].remark+"'>" + data.data.result[i].remark + "</td><td class='home_table3' title='发布时间："+changeTime(data.data.result[i].time)+"'>" + changeTime(data.data.result[i].time) + "</td></tr>"
//					};
				};
				$('#shareAunt').prepend(nanny_list);
			} else {
				alert(data.msg);
				location.href = "login.html";
			}
		},
		error: function(data) {
			alert("error");
		}
	});

	//获取主页面客户共享列表
	$.ajax({
		type: "post",
		url: "getAllShareEmployerList",
		data: {
			start: 0,
			limit: 6
		},
		async: false,
		cache: false,
		success: function(data) {
			if(data.code == 1) {
				//加载主页客户列表
				var shareEmployerList = '';
				for(var i = 0; i < data.data.result.length; i++) {
					shareEmployerList += "<div class='sender'>"
					shareEmployerList += "<div class='a'>"
					shareEmployerList += "<img style='width: 80px; height: 80px;' src='image/"+i+".png' class='img-circle'>"
					shareEmployerList += "</div>"
					shareEmployerList += "<div class='b'>"
					shareEmployerList += "<div class='left_triangle'></div>"
					shareEmployerList += "<div >"
					shareEmployerList += "<div class='shareEmployerContent'><span style='font-size: 18px;'>需求:&nbsp</span><span title='"+data.data.result[i].content+"'>"+data.data.result[i].content+"</span></div>"
					shareEmployerList += "<div class='shareEmployerButtom'>联系人:"+data.data.result[i].contact+"&nbsp;&nbsp;&nbsp;&nbsp;地址;"+data.data.result[i].address+"&nbsp;&nbsp;&nbsp;&nbsp;联系电话:"+data.data.result[i].phone+"&nbsp;&nbsp;&nbsp;&nbsp;发表时间:"+changeTime(data.data.result[i].time)+"</div>"
					shareEmployerList += "</div>"
					shareEmployerList += "</div>"
					shareEmployerList += "</div>"
//					shareEmployerList += "<div class='shareEmployerBox'>"
////					shareEmployerList += "<div class='shareEmployerTitle'>"+data.data.result[i].contact+"</div>"
//					shareEmployerList += "<div class='shareEmployerContent'>"+data.data.result[i].content+"</div>"
//					shareEmployerList += "<div class='shareEmployerButtom'>联系人:"+data.data.result[i].contact+"&nbsp;&nbsp;&nbsp;&nbsp;地址;"+data.data.result[i].address+"&nbsp;&nbsp;&nbsp;&nbsp;联系电话:"+data.data.result[i].phone+"&nbsp;&nbsp;&nbsp;&nbsp;发表时间:"+changeTime(data.data.result[i].time)+"</div>"
//					shareEmployerList += "</div>";
				}
				$("#shareEmployer").prepend(shareEmployerList);
			} else {
				alert(data.msg);
				location.href = "login.html";
			}
		},
		error: function(data) {
			alert("error");
		}
	});


	//新闻栏列表
	$.ajax({
		type: "post",
		url: "getArticleList",
		data: {
			start: 0,
			limit: 5
		},
		async: false,
		cache: false,
		success: function(data) {
			if(data.code == 1) {
				var newsList = '';
				newsList += "<li style='list-style-type:none;color: #333;border:1px #333;  text-align: left;'><div class='news_title_head'>标题</div><div class='notice_time_head'>时间</div></li>"
				for(var i = 0; i < data.data.result.length; i++) {
					var a = data.data.result[i].url;
					newsList += "<li style='list-style-type:none; padding-top: 5px;' title='摘要:" + data.data.result[i].digest + "'>"
					newsList += "<a href='" + data.data.result[i].url + "'>"
					newsList += "<div class='news_title'>" + data.data.result[i].title + "</div>"
					newsList += "<div class='notice_time'>" + changeTime(data.data.result[i].time) + "</div>"
					newsList += "</a>"
					newsList += "</li>"
				}
				$('.newsUl').html(newsList);
			} else {
				alert(data.msg);
				location.href = "login.html";
			}
		},
		error: function(data) {
			alert("error");
		}
	});

	//公告栏列表
	$.ajax({
		type: "post",
		url: "getBoardList",
		data: {
			start: 0,
			limit: 6
		},
		async: false,
		cache: false,
		success: function(data) {
			if(data.code == 1) {
				var noticeList = '';
				noticeList += "<li style='list-style-type:none;color: #333;border:1px #333;  text-align: left;'><div style='float: left; width: 20px; height: 22px; margin: 0 10px 0 0;'></div><div class='notice_title'>标题</div><div class='notice_name'>文件名</div><div class='notice_time'>时间</div></li>"
				for(var i = 0; i < data.data.result.length; i++) {
					noticeList += "<li style='list-style-type:none; padding-top: 5px;' title='描述:" + data.data.result[i].description + "'>"
					noticeList += "<img style='float: left; width: 20px; height: 22px; margin: 0 10px 0 0;' src='image/file.png'/>"
					noticeList += "<div class='notice_title' style='text-align: left;'>" + data.data.result[i].title + "</div>"
					noticeList += "<div class='notice_name' style='text-align: left;'>" + data.data.result[i].name + "</div>"
					noticeList += "<div class='notice_time' style='text-align: left;'>" + changeTime(data.data.result[i].time) + "</div>"
					noticeList += "<input type='button' class='notice_dowloa_file' onclick='window.open(" + JSON.stringify(data.data.result[i].url) + ")'/>"
					noticeList += "</li>"
				}
				$('.noticeUl').html(noticeList);
			}else if(data.code == 0){
				$('.noticeUl').html("<div class='noticeTs'>登录后,才能预览公告哦!</div>");
//				$('.noticeUl').html("<img style='width: 160px; height: 180px;' src='image/dhk.png' />");
			}else {
				alert(data.msg);
			}
		},
		error: function(data) {
			alert("error");
		}
	});
});

//主页面搜索功能
function seek() {
	//搜索共享阿姨列表
	var seek_text = $('#seek_text').val();
	$.ajax({
		type: "post",
		url: mainUrl + "getSearchShareAuntList",
		dataType: "json",
		async: false,
		cache: false,
		data: {
			'key': seek_text,
			'start': 0,
			'limit': 7
		},
		success: function(data) {
			if(data.code == 1) {
				var nanny_table = $('#nanny_table');
				var nanny_list = '';
				nanny_list += "<tr style='background: #ccc;'><th class='home_table'></th><th class='home_table1'>能力</th><th class='home_table2'>联系人</th><th class='home_table2'>联系电话</th><th class='home_table5'>备注</th><th class='home_table3'>发布时间</th></tr>"
				for(i = 0; i < data.data.result.length; i++) {
					if(i % 2 != 0) {
						nanny_list += "<tr style='background: #e0e0e0;'><td class='home_table'><img src='image/3.png' /></td><td class='home_table1' style='margin-left: 20px;'>" + data.data.result[i].skill + "</td><td class='home_table2'>" + data.data.result[i].contact + "</td><td class='home_table2'>" + data.data.result[i].phone + "</td><td class='home_table5'>" + data.data.result[i].remark + "</td><td class='home_table3'>" + changeTime(data.data.result[i].time) + "</td></tr>"
					} else {
						nanny_list += "<tr style='background: #f1f2f7;'><td class='home_table'><img src='image/3.png' /></td><td class='home_table1'>" + data.data.result[i].skill + "</td><td class='home_table2'>" + data.data.result[i].contact + "</td><td class='home_table2'>" + data.data.result[i].phone + "</td><td class='home_table5'>" + data.data.result[i].remark + "</td><td class='home_table3'>" + changeTime(data.data.result[i].time) + "</td></tr>"
					};
				};
				nanny_table.html(nanny_list);
			} else {
				alert(data.msg);
			}

		},
		error: function(jqXHR) {
			alert("网络异常");
		}
	});

	//搜索共享客户列表
	$.ajax({
		type: "post",
		url: mainUrl + "getSearchEmployerList",
		dataType: "json",
		async: false,
		cache: false,
		data: {
			'key': seek_text,
			'start': 0,
			'limit': 7
		},
		success: function(data) {
			if(data.code == 1) {
				//加载主页客户列表
				var clientele_table = $('#clientele_table');
				clientele_table.empty();
				var clientele_list = '';
				clientele_list += "<tr style='background: #ccc;'><th class='home_table'></th><th class='home_table1'>需求</th><th class='home_table2'>联系人</th><th class='home_table2'>联系电话</th><th class='home_table5'>备注</th><th class='home_table3'>发布时间</th></tr>"
				for(i = 0; i < data.data.result.length; i++) {
					if(i % 2 != 0) {
						clientele_list += "<tr style='background: #e0e0e0;'><td class='home_table'><img src='image/3.png' /></td><td class='home_table1'>需求：" + data.data.result[i].content + "</td><td class='home_table2'>" + data.data.result[i].contact + "</td><td class='home_table2'>" + data.data.result[i].phone + "</td><td class='home_table5'>" + data.data.result[i].remark + "</td><td class='home_table3'>" + changeTime(data.data.result[i].time) + "</td></tr>"
					} else {
						clientele_list += "<tr style='background: #f1f2f7;'><td class='home_table'><img src='image/3.png' /></td><td class='home_table1'>需求：" + data.data.result[i].content + "</td><td class='home_table2'>" + data.data.result[i].contact + "</td><td class='home_table2'>" + data.data.result[i].phone + "</td><td class='home_table5'>" + data.data.result[i].remark + "</td><td class='home_table3'>" + changeTime(data.data.result[i].time) + "</td></tr>"
					};

				};
				clientele_table.html(clientele_list);
			} else {
				alert(data.msg);
			}

		},
		error: function(jqXHR) {
			alert("网络异常");
		}
	});

	//搜索公告栏列表
	$.ajax({
		type: "post",
		url: mainUrl + "getSearchBoardList",
		dataType: "json",
		async: false,
		cache: false,
		data: {
			'key': seek_text,
			'start': 0,
			'limit': 6
		},
		success: function(data) {
			if(data.code == 1) {
				var noticeList = '';
				for(var i = 0; i < data.data.result.length; i++) {
					noticeList += "<li style='list-style-type:none;' title='描述:" + data.data.result[i].description + "'>"
					noticeList += "<img style='float: left; width: 20px; height: 22px; margin: 0 10px 0 0;' src='image/file.png' />"
					noticeList += "<div class='notice_title'>标题:&nbsp;" + data.data.result[i].title + "</div>"
					noticeList += "<div class='notice_name'>文件名:&nbsp;" + data.data.result[i].name + "</div>"
					noticeList += "<div class='notice_time'>时间:&nbsp;" + changeTime(data.data.result[i].time) + "</div>"
					noticeList += "<input type='button' class='notice_dowloa_file' onclick='window.open(" + JSON.stringify(data.data.result[i].url) + ")'/>"
					noticeList += "</li>"
				}
				$('.noticeUl').html(noticeList);
			}else if(data.code == 0){
				$('.noticeUl').html("<img style='width: 160px; height: 180px;' src='image/dhk.png' />");
			}else {
				alert(data.msg);
			}

		},
		error: function(jqXHR) {
			alert("网络异常");
		}
	});
};

