<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
</head>

<body>

  <div class="limiter">
    <div class="container-login100" style="background-image:url('/images/loginbg.jpg')">
      <div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
      
        <form class="login100-form validate-form" action="/regist" method="post">
          <span class="login100-form-title p-b-49">开通网银</span>

          <div class="wrap-input100 validate-input m-b-23" data-validate="请输入用户名">
            <span class="label-input100">银行卡号</span>
            <input class="input100" type="text" name="username" placeholder="请输入用户名" autocomplete="off">
            <span class="focus-input100" data-symbol="&#xf206;"></span>
          </div>

          <div class="wrap-input100 validate-input" data-validate="请输入密码">
            <span class="label-input100">密码</span>
            <input class="input100" type="password" name="password" placeholder="请输入密码">
            <span class="focus-input100" data-symbol="&#xf190;"></span>
          </div>
          
           <div class="wrap-input100 validate-input m-b-23" data-validate="请输入姓名">
            <span class="label-input100">姓名</span>
            <input class="input100" type="text" name="name" placeholder="请输入姓名" autocomplete="off">
            <span class="focus-input100" data-symbol="&#xf206;"></span>
          </div>
          
          <div class="wrap-input100 validate-input m-b-23" data-validate="请输入性别">
            <span class="label-input100">性别</span>
            <input class="input100" type="text" name="sex" placeholder="请输入性别" autocomplete="off">
            <span class="focus-input100" data-symbol="&#xf206;"></span>
          </div>
          
           <div class="wrap-input100 validate-input m-b-23" data-validate="请输入年龄">
            <span class="label-input100">年龄</span>
            <input class="input100" type="text" name="old" placeholder="请输入年龄" autocomplete="off">
            <span class="focus-input100" data-symbol="&#xf206;"></span>
          </div>

          <div class="text-right p-t-8 p-b-31">
          </div>

          <div class="container-login100-form-btn">
            <div class="wrap-login100-form-btn">
              <div class="login100-form-bgbtn"></div>
              <button id="login" class="login100-form-btn">注 册</button>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>

  <script src="./js/jquery-1.11.1.js"></script>
  <script src="./js/login.js"></script>


</body>

</html>