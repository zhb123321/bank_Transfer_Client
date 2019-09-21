<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>跨境账单状态修改</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/layui.css">
<style>
.layui-form-label_2 {
	position: relative;
	float: left;
	display: block;
	padding: 9px 0px;
	width: 750px;
	font-weight: 400;
	line-height: 20px;
}

.layui-form-label_3 {
	position: relative;
	float: left;
	display: block;
	padding: 9px 0px;
	width: 100px;
	font-weight: 400;
	line-height: 20px;
	text-align: left;
}

.layui-textarea_1 {
	width: 800px;
	height: 200px;
}

a {
	position: relative;
	float: left;
	display: block;
	padding: 9px 0px;
	width: 100px;
	font-weight: 400;
	line-height: 20px;
	text-align: left;
}

.layui-layer-btn0{
   width:30px;
}
 .layui-layer-btn1{
  width:30px
}
</style>
</head>
<body scrolling="yes">
              
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>跨境账单状态修改</legend>
</fieldset>
 
<form class="layui-form" action="${pageContext.request.contextPath }/TransferAudit/updateCrossborder" id="changeForm">
	      
	<label class="layui-form-label">&emsp;</label>
		<!-- 第一行 -->
		  <div class="layui-form-item" >
			<label class="layui-form-label">账单状态:</label>
			<div class="layui-input-inline">
				<select  lay-filter="relationship" name="status">
			       <option>--选择账单状态--</option>
			       <option value="3">转账成功</option>
			       <option value="4">转账失败</option>
			     </select>
			  </div> 
				 <label class="layui-form-label">汇款金额:</label>
				<input type="text" name="moneynumber" autocomplete="off" class="layui-input"style="width: 220px" value="${ct.moneynumber}" readonly="readonly">
			</div>
		<!-- 第一行 -->	
		<div class="layui-form-item" >
				 <label class="layui-form-label">服务费:</label>
			<div class="layui-input-inline">
				<input type="text" name="fee" autocomplete="off" class="layui-input"style="width: 220px" value="${ct.fee}" readonly="readonly" >
			</div>
				 <label class="layui-form-label">交易单号:</label>
				<input type="text" name="cid" autocomplete="off" class="layui-input"style="width: 220px" value="${ct.cid}" readonly="readonly">
		</div>
		<div class="layui-form-item" >
				 <label class="layui-form-label">账户编号:</label>
			<div class="layui-input-inline">
				<input type="text" name="userid" autocomplete="off" class="layui-input"style="width: 220px" value="${ct.userid}" readonly="readonly" >
			</div>
				 <label class="layui-form-label">收款人账户:</label>
				<input type="text" name="reusernumber" autocomplete="off" class="layui-input"style="width: 220px" value="${ct.reusernumber}" readonly="readonly">
		</div>
		<div class="layui-form-item" >
				 <label class="layui-form-label">收款人名称:</label>
				<div class="layui-input-inline">
				<input type="text" name="reusername" autocomplete="off" class="layui-input"style="width: 220px" value="${ct.reusername}" readonly="readonly" >
			</div>
  		</div>
  		<div class="layui-form-item">
  			<label class="layui-form-label">&emsp;</label>
  			<div class="layui-input-block" align="center">
      			<button class="layui-btn" lay-submit="" lay-filter="editMaterial">提交更改</button>
      			<button class="layui-btn" lay-submit="" lay-filter="demo1">返回</button>
      			<button type="reset" class="layui-btn layui-btn-primary">重置</button>
    		</div>
  		</div>
  	</div>
</form>

<script src="${pageContext.request.contextPath }/js/layui.js" charset="utf-8"></script>
<script>
layui.use('form',function(){
	  var $ = layui.jquery
	  ,form = layui.form;

	form.on('submit(editMaterial)', function(data) {
			layui.layer.confirm('是否提交请求?', {
				icon : 1,
				title : '提示',
				btn : [ '确定', '取消' ]
			},function(index) {
				$("#changeForm").submit();
				var index = parent.layer.getFrameIndex(window.name);
				window.parent.location.reload();//刷新父页面
				parent.layer.close(index);//关闭当前页
				//return false;
			}, function() {

				layer.msg('已取消..');
				return false;
			});
			return false;
		});
	});
</script>
</body>
</html>