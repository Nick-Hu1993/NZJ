//var mainUrl = "http://192.168.1.1.226:8080/nzj/";
var mainUrl = "";
$(document).ready(function() {
	getDateShow();
});

//检查用户登录状态，修改用户或员工的信息显示/隐藏
function check_login() {
	$.ajax({
		type: "post",
		url: mainUrl + "getSession",
		async: false,
		cache: false,
		success: function(data) {
			SetCookie('permission',data.code);
			$('#liModUser').show();
			$('#liModYg').hide();
			$('#liModUserPassword').show();
			$('#liModYgPassword').hide();
			if(data.data == null && data.code != 0) {
				if(confirm("用户登录已失效，是否重新登录？")) {
					location.href = "login.html";
				}
			} else if(data.code == 2) {
				$('#liModUser').hide();
				$('#liModYg').show();
				$('#liModUserPassword').hide();
				$('#liModYgPassword').show();
			} else if(data.code == 1) {
				$('#liModUser').show();
				$('#liModYg').hide();
				$('#liModUserPassword').show();
				$('#liModYgPassword').hide();
			}
		},
		error: function(data) {
			alert("检查用户登录状态异常");
		}
	});
};

//根据ajax请求返回的code来提示用户是否登录
function main_code(c, m) {
	if(c == -999) {
		if(confirm("用户登录已失效，是否重新登录？")) {
			location.href = "login.html";
		}
	} else if(c == 1) {
		if(confirm("注册成功，是否重新登录？")) {
			location.href = "login.html";
		}
	} else {
		alert(m);
	}
}

//写入到Cookie  
//name:cookie名称  value:cookie值   
function SetCookie(name, value) {  
    var Days = 30;  
    var exp = new Date();  
    exp.setTime(exp.getTime() + 7*24*60*60*1000);//过期时间7天
    document.cookie = name + "=" + escape(value) + ";expires=" + exp.toGMTString();  
}; 

//取Cookie的值  
function getCookie(name) {
	var arr, reg = new RegExp("(^| )" + name + "=([^;]*)(;|$)");
	if(arr = document.cookie.match(reg)) return unescape(arr[2]);
	else return null;
};

var t = null;
t = setTimeout(getDateShow, 1000); //开始执行
function getDateShow() {
	//	clearTimeout(t); //清除定时器
	var date = new Date();
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
	$('.timeShow').html(currentdate);
	t = setTimeout(getDateShow, 1000); //设定定时器，循环执行             
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

};