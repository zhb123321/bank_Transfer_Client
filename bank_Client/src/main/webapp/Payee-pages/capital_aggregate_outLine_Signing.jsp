<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
		<title>跨行资金签约</title>
		<style>
		#guijiType{
			margin-left: 60px;
		}
		li{
			width: 320px;
		}
	</style>
	</head>
	<body>
		
		<span class="layui-bg-cyan"><strong>1.设置汇总账户</strong></span><br />
		
<form class="layui-form" action="/cac/addCapitalAggregateOutLine" method="post">
  <div class="layui-form-item">
    <label class="layui-form-label">账号:</label>
    <div class="layui-input-inline">
      <input type="text" name="inaccount" value="1297661626162763176" required  lay-verify="required" placeholder="请输入银行卡号" autocomplete="off" class="layui-input">
    </div>
    <label class="layui-form-label">开户行:</label>
    <div class="layui-input-inline">
      <input type="text"name="inbankname" value="中国建设银行" required  lay-verify="required" placeholder="请输入银行卡开户行" autocomplete="off" class="layui-input">
    </div>
    <label class="layui-form-label">持卡人姓名:</label>
    <div class="layui-input-inline">
      <input type="text" name="username" value="liwutong" required  lay-verify="required" placeholder="请输入持卡人姓名" autocomplete="off" class="layui-input">
    </div><br /><br /><br />
    <span class="layui-bg-cyan"><strong>2.设置归集账户</strong></span><br />
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">账号:</label>
    <div class="layui-input-inline">
      <input type="text" name="outaccount" value="4512323123213243434" required  lay-verify="required" placeholder="请输入银行卡号" autocomplete="off" class="layui-input">
    </div>
    <label class="layui-form-label">开户行:</label>
    <div class="layui-input-inline">
      <input type="text" name="outbankname" value="中国农业银行" required  lay-verify="required" placeholder="请输入银行卡开户行" autocomplete="off" class="layui-input">
    </div>
    <label class="layui-form-label">持卡人姓名:</label>
    <div class="layui-input-inline">
      <input type="text" name="title" value="liwutong" required  lay-verify="required" placeholder="请输入持卡人姓名" autocomplete="off" class="layui-input">
    </div>
  </div><br />
  <span class="layui-bg-cyan"><strong>3.设置归集方式</strong></span><br />
  <div class="layui-tab layui-tab-card" id="guijiType">
  <ul class="layui-tab-title">
    <li class="layui-this">保留归集</li>
    <li>全额归集</li>
    <li>双向归集</li>
  </ul>
  <div class="layui-tab-content" style="height: 120px;" >
  	<!--保留归集-->
    <div class="layui-tab-item layui-show">
     <div class="layui-form-item">
    <label class="layui-form-label">保留金额</label>
    <div class="layui-input-inline">
      <input type="text" name="balanceupper" id="bao1" value=""  placeholder="请输入保留金额" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-item">
    <label class="layui-form-label">归集时间</label>
    <div class="layui-input-inline">
      <select name="" id="op1">
        <option value=""></option>
        <option value="0">每日</option>
        <option value="1">每月</option>
        <option value="2">每星期</option>
      </select>
    </div>
  </div><br />
  <div class="layui-form-item">
    <label class="layui-form-label">归集规则:</label>
    <div class="layui-input-block">
      <input type="text" name="title"  id="s1"  autocomplete="off" class="layui-input" value="当归集账户余额超出保留金额后,超出部分全部转账至主账户!">
    </div>
  </div>
    </div>
    </div>
    <!--全额归集-->
    <div class="layui-tab-item">
    	<div class="layui-form-item">
    <label class="layui-form-label">保留金额</label>
    <div class="layui-input-inline">
      <input type="text" name="balanceupper" id="bao2"   placeholder="1元" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-item">
    <label class="layui-form-label">归集时间</label>
    <div class="layui-input-inline">
      <select name="" id="op2">
        <option value=""></option>
        <option value="0">每日</option>
        <option value="1">每月</option>
        <option value="2">每星期</option>
      </select>
    </div>
  </div><br />
   <input type="hidden" value="" name="" id="h2"/>
  <div class="layui-form-item">
    <label class="layui-form-label">归集规则:</label>
    <div class="layui-input-block">
      <input type="text" name="title"  id="s2"  autocomplete="off" class="layui-input" value="归集账户余额保留1元,剩余部分全部转账至主账户!">
    </div>
  </div>
    </div>
    </div>
     <!--双向归集-->
    <div class="layui-tab-item">
    	<div class="layui-form-item">
    <label class="layui-form-label">金额上限</label>
    <div class="layui-input-inline">
      <input type="text" name="balanceupper" id="bao3"  value=""  placeholder="请输入金额上限" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-item">
    <label class="layui-form-label">金额下限</label>
    <div class="layui-input-inline">
      <input type="text" name="balancelower" placeholder="请输入金额下限" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-item">
    <label class="layui-form-label">归集时间</label>
    <div class="layui-input-inline">
      <select name="" id="op3">
        <option value=""></option>
        <option value="0">每日</option>
        <option value="1">每月</option>
        <option value="2">每星期</option>
      </select>
    </div>
  </div>
  
   <div class="layui-form-item">
    <label class="layui-form-label">归集规则:</label>
    <div class="layui-input-block">
      <input type="text" name="" id="s3"  autocomplete="off" class="layui-input" value="当归集账户余额超出金额上限后,超出部分全部转账至主账户,归集账户余额低于金额下限,主账户将差额补全!">
    </div>
  </div>
  
    </div>
    
    </div>
  </div>
  
</div><br /><br />
      <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div> 
</form>	



<script src="/js/layui.js"></script>
<link rel="stylesheet" href="/css/layui.css">
<script>
layui.use(['form','jquery','element'], function(){
	   var form = layui.form;
	  var $ = layui.jquery;
	  var element = layui.element;
	  
	  
	  
	  
	  
	  $("#bao1,#bao2,#bao3").blur(function (){
		  var bao1 =  $("#bao1").val();
			 var bao2 = $("#bao2").val();
			 var bao3 = $("#bao3").val();
	  		if(bao1 !=null && bao1!= ""){
	  			$("#s1").attr("name","aggregaterule");
	  			$("#h2").val("保留归集");
	  			$("#h2").attr("name","aggregatetype");
	  			$("#op1").attr("name","aggregatedate");
	  		}else if(bao2 == "1"){
	  			$("#s2").attr("name","aggregaterule");
	  			$("#h2").val("全额归集");
	  			$("#h2").attr("name","aggregatetype");
	  			$("#op2").attr("name","aggregatedate");
	  		}else if(bao3 != null && bao3 != ""){
	  			$("#s3").attr("name","aggregaterule");
	  			$("#h2").val("双向归集");
	  			$("#h2").attr("name","aggregatetype");
	  			$("#op3").attr("name","aggregatedate");
	  		}
	  });
	 
	
	


});
	
  
 
  

</script>
	</body>
</html>
