<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
  <base href="<%=basePath%>">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="keywords" content="" />
  <meta name="description" content="" /> 

  <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="https://lib.baomitu.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" type="text/css" href="https://lib.baomitu.com/material-design-iconic-font/2.2.0/css/material-design-iconic-font.min.css">
  <link rel="stylesheet" type="text/css" href="/css/util.css">
  <link rel="stylesheet" type="text/css" href="/css/login.css">
  <script src="../js/jquery-1.8.3.js"></script>
  
  
</head>

<body>
<form action="/acc/login" method="post">

  <div class="limiter">
    <div class="container-login100" style="background-image:url('/images/loginbg.jpg')">
      <div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
          <span class="login100-form-title p-b-49">登录</span>

          <div class="wrap-input100 validate-input m-b-23" data-validate="请输入用户名">
            <span class="label-input100">用户名</span>
            <input class="input100" type="text" id="username" name="phone" placeholder="请输入用户名" autocomplete="off">
            <span class="focus-input100" data-symbol="&#xf206;"></span>
          </div>

          <div class="wrap-input100 validate-input" data-validate="请输入密码">
            <span class="label-input100">密码</span>
            <input class="input100" type="password" id="password" name="bpassword" placeholder="请输入密码">
            <span class="focus-input100" data-symbol="&#xf190;"></span>
          </div>

          <div class="text-right p-t-8 p-b-31">
            <a href="/login-pages/reg.jsp">立即注册</a>
          </div>

          <div class="container-login100-form-btn">
            <div class="wrap-login100-form-btn">
              <div class="login100-form-bgbtn"></div>
              <button id="login" class="login100-form-btn"  >登 录</button>
            </div>
          </div>
          </form>

          <div class="txt1 text-center p-t-54 p-b-20">
            <span>第三方登录</span>
          </div>

          <div class="flex-c-m">
            <a href="#" class="login100-social-item bg1">
              <i class="fa fa-wechat"></i>
            </a>

            <a href="#" class="login100-social-item bg2">
              <i class="fa fa-qq"></i>
            </a>

            <a href="#" class="login100-social-item bg3">
              <i class="fa fa-weibo"></i>
            </a>
          </div>
      </div>
    </div>
  </div>
  
     
 <script>
 $("#login").click(function(){
	var username = $("#username").val();//取值
	var password = $("#password").val();
	var param = {"phone":username,"bpassword":password}; 
	$.ajax({
        url:"${pageContext.request.contextPath}/acc/ajax",
        data:{"phone":username,"bpassword":password},
        dataType:"json",
        success: function(date){
        	if(date){
        		alert("登入成功");	
        	}else{
        		alert("账号或密码有误");
        	}
        }
    })
});  
</script>
</body>

</html>