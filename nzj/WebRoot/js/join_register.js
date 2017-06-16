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
