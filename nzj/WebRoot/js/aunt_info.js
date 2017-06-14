var json = null;
var total = null;
$(function() {
	$('#tdLanguages').children('span').hide();
	$('#tdCookingId').children('span').hide();
	$('#tdSkillId').children('span').hide();
	$('#tdApplianceId').children('span').hide();
	$('#tdJobId').children('span').hide();
	$('#tdCertificateId').children('span').hide();
	//refreshData(20,1,10,json.length);
	var pageSize = 20;
	var pageNo = 1;
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
	//获取语言
	$.ajax({
		type: "post",
		url: mainUrl + "getLanguageList",
		dataType: "json",
		async: false,
		cache: false,
		success: function(data) {
			var Languages = "<label>语&nbsp;&nbsp;&nbsp;&nbsp;言:&nbsp;&nbsp;</label>";
			for(var i = 0; i < data.data.length; i++) {
				//				 if(i==0){
				//				 	Languages += "<input type='checkbox' value='"+data.data[i].id+"' name='languageId' checked='checked'/>"+data.data[i].name+'&nbsp;&nbsp;&nbsp;&nbsp;';
				//				 }else{
				Languages += "<input type='checkbox' value=" + data.data[i].id + " name='languageId'/>" + data.data[i].name + "&nbsp;&nbsp;&nbsp;&nbsp;";
				//				 }
			}
			$("#tdLanguages").html(Languages + "<span style='display: none;'><button type='button' id='modLanguage' class='btn btn-info' style='float: right;'>保存</button></span>");
		},
		error: function(jqXHR) {
			alert("网络异常");
		}
	});

	//修改语言
	$('#modLanguage').click(function() {
		var appform = document.getElementById('divFrame');
		var lanItems = document.getElementsByName("languageId");
		var lan = [];
		for(i = 0; i < lanItems.length; i++) {
			if(lanItems[i].checked == true) {
				lan.push(lanItems[i].value);
			}
		};
		$.ajax({
			type: "post",
			url: mainUrl + "updateAuntLanguage",
			data: {
				"AuntId": appform.id.value,
				"id": lan
			},
			cache: false,
			traditional: true,
			success: function(data) {
				if(data.code == -999) {
					if(confirm("用户登录已失效，是否重新登录？")) {
						window.location.href = "login.html";
					}
				} else if(data.code == 1) {
					alert('保存语言成功');
				} else {
					alert(data.msg);
				};
			},
			error: function(data) {
				alert("error");
			}
		});
	});

	//获取烹饪技能
	$.ajax({
		type: "post",
		url: mainUrl + "getCookingList",
		dataType: "json",
		async: false,
		cache: false,
		success: function(data) {
			var CookingId = "<label>烹&nbsp;&nbsp;&nbsp;&nbsp;饪:&nbsp;&nbsp;</label>";
			for(var i = 0; i < data.data.length; i++) {
				//				 if(i==0){
				//				 	CookingId += "<input type='checkbox' value='"+data.data[i].id+"' name='cookingId' checked='checked'/>"+data.data[i].name+'&nbsp;&nbsp;&nbsp;&nbsp;';
				//				 }else{
				CookingId += "<input type='checkbox' value='" + data.data[i].id + "' name='cookingId'/>" + data.data[i].name + '&nbsp;&nbsp;&nbsp;&nbsp;';
				//				 }
			}
			$("#tdCookingId").html(CookingId + "<span style='display: none;'><button type='button' id='modCooking' class='btn btn-info' style='float: right;'>保存</button></span>");
		},
		error: function(jqXHR) {
			alert("网络异常");
		}
	});

	//修改烹饪技能
	$('#modCooking').click(function() {
		var appform = document.getElementById('divFrame');
		var cookingItems = document.getElementsByName("cookingId");
		var cooking = [];
		for(i = 0; i < cookingItems.length; i++) {
			if(cookingItems[i].checked == true) {
				cooking.push(cookingItems[i].value);
			}
		};
		$.ajax({
			type: "post",
			url: mainUrl + "updateAuntCooking",
			data: {
				"AuntId": appform.id.value,
				"id": cooking
			},
			cache: false,
			traditional: true,
			success: function(data) {
				if(data.code == -999) {
					if(confirm("用户登录已失效，是否重新登录？")) {
						window.location.href = "login.html";
					}
				} else if(data.code == 1) {
					alert('保存烹饪技能成功');
				} else {
					alert(data.msg);
				};
			},
			error: function(data) {
				alert("error");
			}
		});
	});

	//获取基本技能
	$.ajax({
		type: "post",
		url: mainUrl + "getSkillList",
		dataType: "json",
		async: false,
		cache: false,
		success: function(data) {
			var SkillId = "<label>基本技能:&nbsp;&nbsp;</label>";
			for(var i = 0; i < data.data.length; i++) {
				//				 if(i==0){
				//				 	SkillId += "<input type='checkbox' value='"+data.data[i].id+"' name='skillId' checked='checked'/>"+data.data[i].name+'&nbsp;&nbsp;&nbsp;&nbsp;';
				//				 }else{
				SkillId += "<input type='checkbox' value='" + data.data[i].id + "' name='skillId'/>" + data.data[i].name + '&nbsp;&nbsp;&nbsp;&nbsp;';
				//				 }
			}
			$("#tdSkillId").html(SkillId + "<span style='display: none;'><button type='button' id='modSkill' class='btn btn-info' style='float: right;'>保存</button></span>");
		},
		error: function(jqXHR) {
			alert("网络异常");
		}
	});

	//修改基本技能
	$('#modSkill').click(function() {
		var appform = document.getElementById('divFrame');
		var skillItems = document.getElementsByName("skillId");
		var skill = [];
		for(i = 0; i < skillItems.length; i++) {
			if(skillItems[i].checked == true) {
				skill.push(skillItems[i].value);
			}
		};
		$.ajax({
			type: "post",
			url: mainUrl + "updateAuntSkill",
			data: {
				"AuntId": appform.id.value,
				"id": skill
			},
			cache: false,
			traditional: true,
			success: function(data) {
				if(data.code == -999) {
					if(confirm("用户登录已失效，是否重新登录？")) {
						window.location.href = "login.html";
					}
				} else if(data.code == 1) {
					alert('保存基本技能成功');
				} else {
					alert(data.msg);
				};
			},
			error: function(data) {
				alert("error");
			}
		});
	});

	//获取家用电器
	$.ajax({
		type: "post",
		url: mainUrl + "getApplianceList",
		dataType: "json",
		async: false,
		cache: false,
		success: function(data) {
			var ApplianceId = "<label>家用电器:&nbsp;&nbsp;</label>";
			for(var i = 0; i < data.data.length; i++) {
				//				 if(i==0){
				//				 	ApplianceId += "<input type='checkbox' value='"+data.data[i].id+"' name='applianceId' checked='checked'/>"+data.data[i].name+'&nbsp;&nbsp;&nbsp;&nbsp;';
				//				 }else{
				ApplianceId += "<input type='checkbox' value='" + data.data[i].id + "' name='applianceId'/>" + data.data[i].name + '&nbsp;&nbsp;&nbsp;&nbsp;';
				//				 }
			}
			$("#tdApplianceId").html(ApplianceId + "<span style='display: none;'><button type='button' id='modAppliance' class='btn btn-info' style='float: right;'>保存</button></span>");
		},
		error: function(jqXHR) {
			alert("网络异常");
		}
	});

	//修改家用电器
	$('#modAppliance').click(function() {
		var appform = document.getElementById('divFrame');
		var applianceItems = document.getElementsByName("applianceId");
		var appliance = [];
		for(i = 0; i < applianceItems.length; i++) {
			if(applianceItems[i].checked == true) {
				appliance.push(applianceItems[i].value);
			}
		};
		$.ajax({
			type: "post",
			url: mainUrl + "updateAuntAppliance",
			data: {
				"AuntId": appform.id.value,
				"id": appliance
			},
			cache: false,
			traditional: true,
			success: function(data) {
				if(data.code == -999) {
					if(confirm("用户登录已失效，是否重新登录？")) {
						window.location.href = "login.html";
					}
				} else if(data.code == 1) {
					alert('保存家用电器成功');
				} else {
					alert(data.msg);
				};
			},
			error: function(data) {
				alert("error");
			}
		});
	});

	//获取岗位
	$.ajax({
		type: "post",
		url: mainUrl + "getJobList",
		dataType: "json",
		async: false,
		cache: false,
		success: function(data) {
			var JobId = "<label>应聘岗位:&nbsp;&nbsp;</label>";
			for(var i = 0; i < data.data.length; i++) {
				//				 if(i==0){
				//				 	JobId += "<input type='checkbox' value='"+data.data[i].id+"' name='jobId' checked='checked'/>"+data.data[i].name+'&nbsp;&nbsp;&nbsp;&nbsp;';
				//				 }else{
				JobId += "<input type='checkbox' value='" + data.data[i].id + "' name='jobId'/>" + data.data[i].name + '&nbsp;&nbsp;&nbsp;&nbsp;';
				//				 }
			}
			$("#tdJobId").html(JobId + "<span style='display: none;'><button type='button' id='modJob' class='btn btn-info' style='float: right;'>保存</button></span>");
		},
		error: function(jqXHR) {
			alert("网络异常");
		}
	});

	//修改岗位
	$('#modJob').click(function() {
		var appform = document.getElementById('divFrame');
		var jobItems = document.getElementsByName("jobId");
		var job = [];
		for(i = 0; i < jobItems.length; i++) {
			if(jobItems[i].checked == true) {
				job.push(jobItems[i].value);
			}
		};
		$.ajax({
			type: "post",
			url: mainUrl + "updateAuntJob",
			data: {
				"AuntId": appform.id.value,
				"id": job
			},
			cache: false,
			traditional: true,
			success: function(data) {
				if(data.code == -999) {
					if(confirm("用户登录已失效，是否重新登录？")) {
						window.location.href = "login.html";
					}
				} else if(data.code == 1) {
					alert('保存岗位成功');
				} else {
					alert(data.msg);
				};
			},
			error: function(data) {
				alert("error");
			}
		});
	});

	//获取提供证件
	$.ajax({
		type: "post",
		url: mainUrl + "getCertificateList",
		dataType: "json",
		async: false,
		cache: false,
		success: function(data) {
			var CertificateId = "<label>提供证件:&nbsp;&nbsp;</label>";
			for(var i = 0; i < data.data.length; i++) {
				//				 if(i==0){
				//				 	CertificateId += "<input type='checkbox' value='"+data.data[i].id+"' name='certificateId' checked='checked'/>"+data.data[i].name+'&nbsp;&nbsp;&nbsp;&nbsp;';
				//				 }else{
				CertificateId += "<input type='checkbox' value='" + data.data[i].id + "' name='certificateId'/>" + data.data[i].name + '&nbsp;&nbsp;&nbsp;&nbsp;';
				//				 }
			}
			$("#tdCertificateId").html(CertificateId + "<span style='display: none;'><button type='button' id='modCertificate' class='btn btn-info' style='float: right;'>保存</button></span>");
		},
		error: function(jqXHR) {
			alert("网络异常");
		}
	});

	//修改提供证件
	$('#modCertificate').click(function() {
		var appform = document.getElementById('divFrame');
		var certificateItems = document.getElementsByName("certificateId");
		var certificate = [];
		for(i = 0; i < certificateItems.length; i++) {
			if(certificateItems[i].checked == true) {
				certificate.push(certificateItems[i].value);
			}
		};
		$.ajax({
			type: "post",
			url: mainUrl + "updateAuntCertificate",
			data: {
				"AuntId": appform.id.value,
				"id": certificate
			},
			cache: false,
			traditional: true,
			success: function(data) {
				if(data.code == -999) {
					if(confirm("用户登录已失效，是否重新登录？")) {
						window.location.href = "login.html";
					}
				} else if(data.code == 1) {
					alert('保存证件成功');
				} else {
					alert(data.msg);
				};
			},
			error: function(data) {
				alert("error");
			}
		});
	});

	//获取紧急联系人
	var val_contact;
	for(var i = 0; i < 1; i++) {

		val_contact += "<tr id='tr" + i + "'>" +
			"<td>姓名：<input type='text' name='cname'/></td>" +
			"<td>关系：<input type='text' name='relation'/></td>" +
			"<td>工作状况 : <input type='text' name='workstatus'/></td>" +
			"<td>联系电话：<input type='text' name='cphone'/></td>" +
			"<td onClick='del_contact(this)'><button class='contact_del_btn' type='button' title='删除'/></td>" +
			"</tr>";
	}
	$(".contact_table").html(val_contact);

	//工作经历
	var val_work;
	for(var i = 0; i < 1; i++) {

		val_work += "<tr id='tr" + i + "'>" +
			"<td>起止时间：<input type='text' name='time'/></td>" +
			"<td>主要工作：<input type='text' name='work'/></td>" +
			"<td onClick='del_work(this)'><button class='contact_del_btn' type='button' title='删除'/></td>" +
			"</tr>";
	}
	$(".work_table").html(val_work);
	//	
	//添加阿姨信息
	$('#btn_aunt_add').click(function() {
		var formData = new FormData(document.getElementById("divFrame"));
		$.ajax({
			type: "post",
			url: mainUrl + "addAunt",
			data: formData,
			async: false,
			cache: false,
			contentType: false,
			processData: false,
			success: function(data) {
				if(data.code == -999) {
					if(confirm("用户登录已失效，是否重新登录？")) {
						window.location.href = "login.html";
					}
				} else if(data.code == 1) {
					$('#aunt').modal('hide');
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
	});
	//修改阿姨信息
	$('#btn_aunt_mod').click(function() {
		//  var formData = new FormData(document.getElementById("divFrame"));
		var appform = document.getElementById('divFrame');
		//  alert(appform.id.value+'--'+appform.userId.value+'--'+appform.native_.value);
		$.ajax({
			type: "post",
			url: mainUrl + "updateAunt",
			data: {
				id: appform.id.value,
				userId: appform.userId.value,
				name: appform.name.value,
				age: appform.age.value,
				sign: appform.sign.value,
				native_: appform.native_.value,
				sex: appform.sex.value,
				education: appform.education.value,
				marriage: appform.marriage.value,
				nation: appform.nation.value,
				height: appform.height.value,
				weight: appform.weight.value,
				sigh: appform.sigh.value,
				idnumber: appform.idnumber.value,
				phone: appform.phone.value,
				address: appform.address.value
			},
			cache: false,
			success: function(data) {
				if(data.code == -999) {
					if(confirm("用户登录已失效，是否重新登录？")) {
						window.location.href = "login.html";
					}
				} else if(data.code == 1) {
					$('#aunt').modal('hide');
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

	});
});

$(function() {

	//鼠标经过语言复选框是显示保存按钮
	$('#tdLanguages').mouseover(function() {
		$('#tdLanguages').children('span').show()
	});
//	$('#tdLanguages').mouseout(function() {
//		$('#tdLanguages').children('span').hide()
//	});
	//鼠标经过语言复选框是显示保存按钮
	$('#tdCookingId').mouseover(function() {
		$('#tdCookingId').children('span').show()
	});
//	$('#tdCookingId').mouseout(function() {
//		$('#tdCookingId').children('span').hide()
//	});
	//鼠标经过语言复选框是显示保存按钮
	$('#tdSkillId').mouseover(function() {
		$('#tdSkillId').children('span').show()
	});
//	$('#tdSkillId').mouseout(function() {
//		$('#tdSkillId').children('span').hide()
//	});
	//鼠标经过语言复选框是显示保存按钮
	$('#tdApplianceId').mouseover(function() {
		$('#tdApplianceId').children('span').show()
	});
//	$('#tdApplianceId').mouseout(function() {
//		$('#tdApplianceId').children('span').hide()
//	});
	//鼠标经过语言复选框是显示保存按钮
	$('#tdJobId').mouseover(function() {
		$('#tdJobId').children('span').show()
	});
//	$('#tdJobId').mouseout(function() {
//		$('#tdJobId').children('span').hide()
//	});
	//鼠标经过语言复选框是显示保存按钮
	$('#tdCertificateId').mouseover(function() {
		$('#tdCertificateId').children('span').show()
	});
//	$('#tdCertificateId').mouseout(function() {
//		$('#tdCertificateId').children('span').hide()
//	});
});

//添加阿姨信息时初始化表
function addAunt() {
	//	document.getElementById("divFrame").reset(); 
	//	$(".aunt_img").attr("src", "image/u196.png");
	$("input[type=reset]").trigger("click");
	$(".aunt_img").attr("src", "image/u196.png");
	$('#auntLabel').html('添加阿姨信息');
	$('#btn_aunt_add').show();
	$('#btn_aunt_mod').hide();
	$('#modLanguage').hide();
	$('#modCooking').hide();
	$('#modSkill').hide();
	$('#modAppliance').hide();
	$('#modJob').hide();
	$('#modCertificate').hide();
	$('#auntIcon').html('添加阿姨照片');
	//初始化紧急联系人
	var tb = document.getElementById('contact_table');
	var rowNum = tb.rows.length;
	for(i = 0; i < rowNum; i++) {
		tb.deleteRow(i);
		rowNum = rowNum - 1;
		i = i - 1;
	};
	var val_contact;
	for(var i = 0; i < 1; i++) {

		val_contact += "<tr id='tr" + i + "'>" +
			"<td>姓名：<input type='text' name='cname'/></td>" +
			"<td>关系：<input type='text' name='relation'/></td>" +
			"<td>工作状况 : <input type='text' name='workstatus'/></td>" +
			"<td>联系电话：<input type='text' name='cphone'/></td>" +
			"<td onClick='del_contact(this)'><button class='contact_del_btn' type='button' title='删除'/></td>" +
			"</tr>";
	}
	$(".contact_table").html(val_contact);

	//初始化工作经历
	var tb = document.getElementById('work_table');
	var rowNum = tb.rows.length;
	for(i = 0; i < rowNum; i++) {
		tb.deleteRow(i);
		rowNum = rowNum - 1;
		i = i - 1;
	};
	var val_work;
	for(var i = 0; i < 1; i++) {

		val_work += "<tr id='tr" + i + "'>" +
			"<td>起止时间：<input type='text' name='time'/></td>" +
			"<td>主要工作：<input type='text' name='work'/></td>" +
			"<td onClick='del_work(this)'><button class='contact_del_btn' type='button' title='删除'/></td>" +
			"</tr>";
	}
	$(".work_table").html(val_work);
};

//添加工作经历
function add_work() {
	var work_table = document.getElementById("work_table");
	var rows = work_table.rows.length;
	var add_tr = "<tr id='tr" + rows + "'>" +
		"<td>起止时间：<input type='text' name='time'/></td>" +
		"<td>主要工作：<input type='text' name='work'/></td>" +
		"<td onClick='del_work(this)'><button class='contact_del_btn' type='button' title='删除'/></td>" +
		" </tr>"
	$(".work_table").append(add_tr);
};

//删除工作经历
function del_work(v) {
	$(v).parent().remove();
};

//添加紧急联系人
function add_contact() {
	var table = document.getElementById("contact_table");
	var rows = table.rows.length;
	var add_tr = "<tr id='tr" + rows + "'>" +
		"<td>姓名：<input type='text' name='cname'/></td>" +
		"<td>关系：<input type='text' name='relation'/></td>" +
		"<td>工作状况 : <input type='text' name='workstatus'/></td>" +
		"<td>联系电话：<input type='text' name='cphone'/></td>" +
		"<td  onClick='del_contact(this)'><button class='contact_del_btn' type='button' title='删除'/></td>" +
		" </tr>"
	$(".contact_table").append(add_tr);
};

//删除紧急联系人
function del_contact(v) {
	$(v).parent().remove();
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
	$.ajax({
		type: "post",
		url: mainUrl + "getAuntList",
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
			//			console.log(JSON.stringify(data))
			//			builderUQTQueryMsg(data);

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
	var auntTable = $('#auntTable');
	auntTable.empty();
	var th = '<tr><th scope="col" class="eng_name" >姓名</th><th scope="col" class="query_pro" >年龄</th><th class="match_type" scope="col">籍贯</th><th scope="col"  class="match_type">性别</th><th class="match_type" scope="col">联系电话</th><th class="dis_order" scope="col">家庭地址</th><th scope="col"  class="dis_dta">操作</th><th class="dis_hidden" style="display: none">隐藏属性</th></tr>';

	auntTable.append(th);
	var tr;
	$.each(UQTQueryMsg, function(i, eachData) {
		tr = $('<tr>');
//		if(i % 2 == 0) {
//			tr.css('background-color', '#f5f5f5');
//		} else {
//			tr.css('background-color', '#FFFFFF');
//		}
		var listId = eachData.id;
		var listName = eachData.name;
		var listAge = eachData.age;
		var listSex = null;
		if(eachData.sex == 1) {
			listSex = '男';
		} else {
			listSex = '女';
		}
		var listNative = eachData.native_;
		//      var listHeight = eachData.height;
		//		var listWeight = eachData.weight;
		var listPhone = eachData.phone;
		var listAdress = eachData.address;
		tr.append("<td class='eng_name'>" + listName + "</td>" +
			"<td class='query_pro'>" + listAge + "</td>" +
			"<td class='match_type'>" + listNative + "</td>" +
			"<td class='match_type'>" + listSex + "</td>" +
			//			"<td class='match_type'>" + listWeight + "</td>" +
			"<td class='match_type'>" + listPhone + "</td>" +
			"<td class='dis_order'>" + listAdress + "</td>" +
			"<td class='dis_dta'>" +
			"<a class='editOp' href='' data-toggle='modal' data-target='#aunt'onclick='updateAunt(" + listId + ")'>修改</a>" +
			"<a class='editOp' href='javascript:void(0);' onclick='deleteAunt(" + listId + ")'>删除</a>" +
			"</td>" +
			"<td class='dis_hidden' style='display: none'></td>"
		);
		auntTable.append(tr);
	});
}

//修改阿姨信息时初始化表
function updateAunt(aid) {
	$("input[type=reset]").trigger("click");
	$('#auntLabel').html('修改阿姨信息');
	$('#btn_aunt_mod').show();
	$('#btn_aunt_add').hide();
	$('#modLanguage').show();
	$('#modCooking').show();
	$('#modSkill').show();
	$('#modAppliance').show();
	$('#modJob').show();
	$('#modCertificate').show();
	$('#auntIcon').html('修改阿姨照片');
	$.ajax({
		type: "post",
		url: mainUrl + "getAuntById",
		dataType: "json",
		async: false,
		cache: false,
		data: {
			id: aid
		},
		success: function(data) {
			if(data.code == -999) {
				if(confirm("用户登录已失效，是否重新登录？")) {
					window.parent.location.href = "login.html";
				}
			} else if(data.code == 1) {
				$("input[name='id']").val(data.data.id);
				$("input[name='userId']").val(data.data.userId);
				$("input[name='name']").val(data.data.name);
				$("input[name='age']").val(data.data.age);
				$("input[name='sign']").val(data.data.sign);
				$("input[name='native_']").val(data.data.native);
				$("input[name='education']").val(data.data.education);
				$("input[name='nation']").val(data.data.nation);
				$("input[name='height']").val(data.data.height);
				$("input[name='weight']").val(data.data.weight);
				$("input[name='sigh']").val(data.data.sigh);
				$("input[name='phone']").val(data.data.phone);
				$("input[name='idnumber']").val(data.data.idnumber);
				$("input[name='address']").val(data.data.address);
				$(".aunt_img").attr("src", data.data.url);
				$(":radio[name='sex'][value='" + data.data.sex + "']").prop("checked", "checked");
				$(":radio[name='marriage'][value='" + data.data.marriage + "']").prop("checked", "checked");
				//勾选语言
				var lan = [];
				for(var i = 0; i < data.data.language.length; i++) {
					lan.push(data.data.language[i].languageId);
				};
				var lanItems = document.getElementsByName("languageId");
				for(var i = 0; i < lanItems.length; i++) {
					for(var j = 0; j < lan.length; j++) {
						if(lanItems[i].value == lan[j]) {
							lanItems[i].checked = true;
						};
					};
				};
				//勾选烹饪
				var cooking = [];
				for(var i = 0; i < data.data.cooking.length; i++) {
					cooking.push(data.data.cooking[i].cookingId);
				};
				var cookingItems = document.getElementsByName("cookingId");
				for(var i = 0; i < cookingItems.length; i++) {
					for(var j = 0; j < cooking.length; j++) {
						if(cookingItems[i].value == cooking[j]) {
							cookingItems[i].checked = true;
						};
					};
				};
				//勾选基本技能
				var skill = [];
				for(var i = 0; i < data.data.skill.length; i++) {
					skill.push(data.data.skill[i].skillId);
				};
				var skillItems = document.getElementsByName("skillId");
				for(var i = 0; i < skillItems.length; i++) {
					for(var j = 0; j < skill.length; j++) {
						if(skillItems[i].value == skill[j]) {
							skillItems[i].checked = true;
						};
					};
				};
				//勾选家用电器
				var appliance = [];
				for(var i = 0; i < data.data.appliance.length; i++) {
					appliance.push(data.data.appliance[i].applianceId);
				};
				var applianceItems = document.getElementsByName("applianceId");
				for(var i = 0; i < applianceItems.length; i++) {
					for(var j = 0; j < skill.length; j++) {
						if(applianceItems[i].value == appliance[j]) {
							applianceItems[i].checked = true;
						};
					};
				};
				//勾选岗位
				var job = [];
				for(var i = 0; i < data.data.job.length; i++) {
					job.push(data.data.job[i].jobId);
				};
				var jobItems = document.getElementsByName("jobId");
				for(var i = 0; i < jobItems.length; i++) {
					for(var j = 0; j < job.length; j++) {
						if(jobItems[i].value == job[j]) {
							jobItems[i].checked = true;
						};
					};
				};
				//勾选提供证件
				var certificate = [];
				for(var i = 0; i < data.data.certificate.length; i++) {
					certificate.push(data.data.certificate[i].certificateId);
				};
				var certificateItems = document.getElementsByName("certificateId");
				for(var i = 0; i < certificateItems.length; i++) {
					for(var j = 0; j < certificate.length; j++) {
						if(certificateItems[i].value == certificate[j]) {
							certificateItems[i].checked = true;
						};
					};
				};
				//获取紧急联系人
				var val_contact;
				for(var i = 0; i < 1; i++) {
					val_contact += "<tr id='tr" + i + "'>" +
						"<td>姓名：<input type='text' name='cname' value='" + data.data.contact[i].cname + "'/></td>" +
						"<td>关系：<input type='text' name='relation' value='" + data.data.contact[i].relation + "'/></td>" +
						"<td>工作状况 : <input type='text' name='workstatus' value='" + data.data.contact[i].workstatus + "'/></td>" +
						"<td>联系电话：<input type='text' name='cphone' value='" + data.data.contact[i].cphone + "'/></td>" +
						"<td onClick='del_contact(this)'><button class='contact_del_btn' type='button' title='删除'/></td>" +
						"</tr>";
				};
				$(".contact_table").html(val_contact);
				//获取工作经历 
				var val_work;
				for(var i = 0; i < data.data.work.length; i++) {
					val_work += "<tr id='tr" + i + "'>" +
						"<td>起止时间：<input type='text' name='time' value='" + data.data.work[i].time + "'/></td>" +
						"<td>主要工作：<input type='text' name='work' value='" + data.data.work[i].work + "'/></td>" +
						"<td onClick='del_work(this)'><button class='contact_del_btn' type='button' title='删除'/></td>" +
						"</tr>";
				};
				$(".work_table").html(val_work);
			} else {
				alert(data.msg);
			};
		},
		error: function(jqXHR) {
			alert("网络异常");
		}
	});
};

//删除阿姨信息
function deleteAunt(aid) {
	$.ajax({
		type: "post",
		url: mainUrl + "deleteAunt",
		dataType: "json",
		async: false,
		cache: false,
		data: {
			id: aid
		},
		success: function(data) {
			if(data.code == -999) {
				if(confirm("用户登录已失效，是否重新登录？")) {
					window.parent.location.href = "login.html";
				}
			} else if(data.code == 1) {
				location.reload();
			} else {
				alert(data.msg);
			}
			//			console.log(JSON.stringify(data))
			//			builderUQTQueryMsg(data);

		},
		error: function(jqXHR) {
			alert("网络异常");
		}
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

/*********************************列表分页***************************************/
/**
 * Created by huipu on 2016/1/28.
 *	分页插件
 */
var kkpager = {
	//divID
	pagerid: 'aunt_pager',
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

/*********************************列表分页（结束）***************************************/

if(typeof FileReader == 'undefined') {
	document.getElementById("xmTanDiv").InnerHTML = "<h1>当前浏览器不支持上传照片</h1>";
	//使选择控件不可操作
	document.getElementById("xdaTanFileImg").setAttribute("disabled", "disabled");
}

//选择图片，马上预览
function onUpdateIcon() {
	var fileObj = document.getElementById("auntFileImg");
	fileObj.onchange = function(obj) {
		var file = fileObj.files[0];
		var reader = new FileReader();
		reader.onload = function(e) {
			var img = document.getElementById("xmTanImg");
			img.src = e.target.result;
			//上传阿姨照片
			if($('#auntIcon').html() == '修改阿姨照片') {
				var self = this;
				var appform = document.getElementById('divFrame');
				var fileObj = document.getElementById("auntFileImg").files[0];
				var formData = new FormData();
				formData.append('AuntId', appform.id.value);
				formData.append('file', fileObj);
				if(!self.appUploadXHR) {
					self.appUploadXHR = null;
				}
				self.appUploadXHR = new XMLHttpRequest();
				self.appUploadXHR.open("POST", mainUrl + "updateAuntPhoto");
				self.appUploadXHR.send(formData);
			};
		}
		reader.readAsDataURL(file)
	}
	fileObj.click();
};