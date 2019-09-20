<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>主动收款</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="/css/layui.css">
    <script src="/js/layui.js"></script>
    <script src="/js/jquery-1.8.3.js"></script>
</head>
<style>
.layui-form-label{
width:120px;
}

</style>
<script>	
$(function () {
    //转成大写
    $("#moneynumber").blur(function(){
		var moneynumber=$("#moneynumber").val();
 		$.ajax({
 	        url:"${pageContext.request.contextPath}/active/upMoney",
 	        data:{"moneynumber":moneynumber},
 	        dataType:"text",
 	        success: function(result){
 	        	//alert(result.chinese);
 	        	$("#money2").text(result);
 	        }
 	    })
 	});
});
</script>
<body style=" overflow-y:auto; overflow-x:auto; height:1100px;">

<form class="layui-form" action="${pageContext.request.contextPath}/active/insertActive" id="submitFrom">
<div style="background-color: #DFE6EE">
    <hr class="layui-bg-black">
    <div style="height: 25px;width: 100%;margin-left: 650px">
        收款人部分填写
    </div>
    <hr class="layui-bg-black">
</div>

    <div class="layui-form-item">
        <label class="layui-form-label">收款人姓名</label>
        <div class="layui-input-block">
            <input type="text" name="username" required lay-verify="required" placeholder="请输入收款人姓名" autocomplete="off"
                   class="layui-input" style="width: 220px">
        </div>
    </div>
    
    <div class="layui-form-item">
        <label class="layui-form-label">收款人账户</label>
        <div class="layui-input-inline">
            <select name="inaccount" lay-verify="required" lay-search="">
                <option value="">点击选择</option>
                <option value="622439320010754123">622439320010754123</option>
                <option value="622439321234754772">622439321234754772</option>
                <option value="622439325432754772">622439325432754772</option>
                <option value="622567820010754772">622567820010754772</option>
                <option value="622432346001075472">622432346001075472</option>
            </select>
        </div>
    </div>
    
    <div style="font-size: 13px;margin-left: 120px;height: 30px;margin-top: 10px">币种: 人民币元</div>

    <div class="layui-form-item">
        <label class="layui-form-label">收款金额</label>
        <div class="layui-input-block">
            <input type="text" name="moneynumber" id="moneynumber" required lay-verify="required" placeholder="请输入金额" autocomplete="off"
                   class="layui-input" style="width: 220px">
        </div>
        
    </div>
    
     <div class="layui-form-item">
        <label  class="layui-form-label">金额大写</label>
        <label id="money2" class="layui-form-label"></label>
    </div>
    

    <div class="layui-form-item">
        <label class="layui-form-label" style="font-size: 13px">收款人手机号</label>
        <div class="layui-input-block">
            <input type="text" name="userphone" required lay-verify="required" placeholder="请输入号码" autocomplete="off"
                   class="layui-input" style="width: 220px">
        </div>
     </div>
        
        <div class="layui-form-item">
	    <div class="layui-inline">
	     <label class="layui-form-label">附言:</label>
			<div class="layui-input-block">
				<textarea name="message" placeholder="请输入内容" class="layui-textarea"  style="width:400px"></textarea>
			</div>
	    </div>
	  </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">下一步</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>

</form>
<script>
    layui.use('form', function () {
        var form = layui.form;
        form.render();
        //监听提交
        form.on('submit(formDemo)', function (data) {
           $("#submitFrom").submit();
        });
    });
</script>
</body>
</html>
