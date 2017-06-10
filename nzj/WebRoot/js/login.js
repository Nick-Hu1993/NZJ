//用户登录
function login() {
	$('.page').show();
	setTimeout(loginRequest,500);
};

function loginRequest(){
	var username = $('.username').val();
	var password = $('.password').val();
	//md5密码加密，并在加密之前,后面拼接一串字符串.
	var md5 = hex_md5(password+'nzj');
	$.ajax({
		type: "post",
		url: "login",
		dataType: "json",
		cache: false,
		data: {
			'phone': username,
			'password':md5
		},
		success: function(data) {
			if(data.code=='1'){
                location.href = "index.html";
                $('.page').hide();
			}else if(data.code=='-1'){
				$('.page').hide();
				alert(data.msg);
				location.href = "checkUserDetail.html";
			}else{
				$('.loginMsg').html(data.msg);
				$('.page').hide();
			}
		},
		error: function(jqXHR) {
			$('.page').hide();
			$('.loginMsg').html('网络异常');
		}
	});
};

//员工登录
function yg_login() {
	$('.page').show();
	setTimeout(yg_loginRequest,500);
};

function yg_loginRequest(){
	var username = $('.username').val();
	var password = $('.password').val();
	//md5密码加密，并在加密之前,后面拼接一串字符串.
//	var md5 = hex_md5(password+'nzj');
	$.ajax({
		type: "post",
		url: "sLogin",
		dataType: "json",
		cache: false,
		data: {
			'phone': username,
			'password':password
		},
		success: function(data) {
			if(data.code=='1'){
                location.href = "index.html";
                $('.page').hide();
			}else{
				$('.loginMsg').html(data.msg);
				$('.page').hide();
			}
		},
		error: function(jqXHR) {
			$('.page').hide();
			$('.loginMsg').html('网络异常');
		}
	});
};

//游客登录
function youkeLogin(){
	$('.page').show();
	setTimeout(youkeLoginRequest,1000);
}

function youkeLoginRequest(){
	$.ajax({
		type: "post",
		url: "logout",
		dataType: "json",
		cache: false,
		success: function(data) {
			$('.page').hide();
			location.href="index.html";
		},
		error: function(jqXHR) {
			$('.page').hide();
			$('.loginMsg').html('网络异常');
		}
	});
};

//写入到Cookie  
//name:cookie名称  value:cookie值   
//function SetCookie(name, value) {  
//  var Days = 30;  
//  var exp = new Date();  
//  exp.setTime(exp.getTime() + 7*24*60*60*1000);//过期时间7天
//  document.cookie = name + "=" + escape(value) + ";expires=" + exp.toGMTString();  
//}  