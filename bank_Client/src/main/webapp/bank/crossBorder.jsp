<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>跨境转账</title>
<link rel="stylesheet" href="/css/layui.css">
<script src="${pageContext.request.contextPath}/js/layui.js"></script>
</head>
<body style=" overflow-y:auto; overflow-x:auto; height:2400px;">
		<div style="background-color: #DFE6EE">
			<hr class="layui-bg-black">
			<div style="height: 25px;width: 100%;margin-left: 650px">
				请您填写收款人信息</div>
			<hr class="layui-bg-black">
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">收款人姓名</label>
			<div class="layui-input-block">
				<input type="text" name="reusername" lay-verify="required"
					placeholder="请输入姓名(英文或拼音)" autocomplete="off" class="layui-input"
					style="width: 220px">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">收款人账号</label>
			<div class="layui-input-block">
				<input type="text" name="reusernumber" lay-verify="required"
					placeholder="请输入账号" autocomplete="off" class="layui-input"
					style="width: 220px">
			<span style="margin-left: 35px ;color:red;" id="msg"></span>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">收款银行所在国家(地区)</label>
			<div class="layui-input-block">
				<select name="modules" lay-verify="required"  name='bankcountry'>
					<option value="">直接选择或搜索选择</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
			</div>
		</div >
		<span style="margin-left: 20px">收款银行全称:bankname</span><br />
		<div class="layui-form-item">
			<label class="layui-form-label">币种:</label>
			<div class="layui-input-inline">
			<%-- <c:forEach items="currencys" var="currency"> --%>
				<select name="modules" lay-verify="required"  name='currencyid' class="">
					<option value="">直接选择或搜索选择</option>
					<option value="1"></option>
				</select>
			<%-- </c:forEach>  --%>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">国家/地区:</label>
			<div class="layui-input-inline">
				<select name="modules" lay-verify="required"  name='reusercountry'>
					<option value="">直接选择或搜索选择</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
			</div>
		</div>

		<div style="background-color: #DFE6EE">
			<hr class="layui-bg-black">
			<div style="height: 25px;width: 100%;margin-left: 650px">
				请您填写汇款人信息</div>
			<hr class="layui-bg-black">
		</div>
	
		
		<div class="layui-form-item">
			<label class="layui-form-label">汇款人姓名(英文或拼音)</label>
			<div class="layui-input-block">
				<input type="text" name="username" required lay-verify="required"
					placeholder="请输入姓名" autocomplete="off" class="layui-input"
					style="width: 220px">
			<span style="margin-left: 35px ;color:red;" id="msgUser"></span>
			</div>
		</div>
		<span style="margin-left: 20px">汇款人名称(英文或拼音): <span>LI
				WUTONG</span></span><br />
		<div style="margin-left: 170px;font-size: 13px;color: red">英文名或拼音名如有误,可持本人有效身份证及任意一电子银行关联账户至我行任意网点柜台修改</div>
		<span style="margin-left: 20px">国家地区: <span>China(中国)</span></span><br />

		<div class="layui-form-item">
			<label class="layui-form-label">省/直辖市:</label>
			<div class="layui-input-inline">
				<select name="modules" lay-verify="required"  >
					<option value="">直接选择或搜索选择</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">城市:</label>
			<div class="layui-input-inline">
				<select name="modules" lay-verify="required" lay-search="">
					<option value="">直接选择或搜索选择</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">详细地址:</label>
			<div class="layui-input-block">
				<textarea name="desc" placeholder="请输入内容" class="layui-textarea" name="useraddr"></textarea>
			</div>
			<div style="margin-left: 110px;font-size: 13px;color: red">请填写详细地址,必须详细到门牌号,否则将影响您的款项的汇出</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">邮政编码</label>
			<div class="layui-input-block">
				<input type="text" name="postcode" required lay-verify="required"
					placeholder="汇款人邮政编码" autocomplete="off" class="layui-input"
					style="width: 220px">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">联系电话</label>
			<div class="layui-input-block">
				<input type="text" name="userphone" required lay-verify="required"
					placeholder="汇款人联系电话" autocomplete="off" class="layui-input"
					style="width: 220px">
			</div>
		</div>


		<div style="background-color: #DFE6EE">
			<hr class="layui-bg-black">
			<div style="height: 25px;width: 100%;margin-left: 650px">
				请您填写交易信息</div>
			<hr class="layui-bg-black">
		</div>

		<div>
			<label class="layui-form-label">扣款账户:</label>
			<div class="layui-input-inline">
				<select name="modules" lay-verify="required" lay-search="" name="inaccount">
					<option value="">直接选择或搜索选择</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select> <a>您可以点击这里购买外汇</a>	
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">汇款金额</label>
			<div class="layui-input-block">
				<input type="text" name="moneynumber" required lay-verify="required"
					placeholder="请输入金额" autocomplete="off" class="layui-input"
					style="width: 220px">
				<input type="button" value="收费标准">fee <input type="button" value="查询剩余额度">
				<div style="margin-left: 1px;font-size: 13px;color: red">根据监管规定,当日累计等值5万美金以下的外币跨境汇款可以通过本渠道直接办理,超过限额的汇款请持真实凭证至我行网点柜台办理</div>
			</div>
		</div>

		<span style="margin-left: 35px">国内外费用承担方式: SHA 共同承担 <span
			style="color:red;">跨境汇款可能产生中转费用</span></span>

		<div style="height: 15px"></div>
		<div>
			<label class="layui-form-label">汇款币种:</label>
			<div class="layui-input-inline">
				<select name="modules" lay-verify="required" lay-search="1" name="currencyid">
					<option value="">直接选择或搜索选择</option>
					<option value="1">人名币元</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
			</div>
		</div>

		<div style="height: 15px"></div>
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">给收款方的汇款附言</label>
			<div class="layui-input-block">
				<textarea name="message" placeholder="请输入内容" class="layui-textarea"></textarea>
			</div>
			<div style="margin-left: 110px;font-size: 13px;color: red">请用英文如实填写您的汇款用途/原因,如未如实填写,可能导致收款人无法顺利收到汇款</div>
		</div>

		<div style="background-color: #DFE6EE">
			<hr class="layui-bg-black">
			<div style="height: 25px;width: 100%;margin-left: 650px">
				请填写您的外管申报信息(用中文填写)</div>
			<hr class="layui-bg-black">
		</div>


		<div class="layui-form-item">
			<label class="layui-form-label">收款人常驻国家</label>
			<div class="layui-input-inline">
				<select name="modules" lay-verify="required" lay-search="1" name="reusercountry">
					<option value="">直接选择或搜索选择</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">汇款用途</label>
			<div class="layui-input-inline">
				<select name="modules" lay-verify="required" lay-search="1">
					<option value="">直接选择或搜索选择</option>
					<option value="1">留学及教育相关旅行(一年及以上)</option>
					<option value="2">留学及教育相关旅行(一年及以下)</option>
					<option value="3">就医及健康相关旅行</option>
					<option value="4">公务及商务旅行</option>
					<option value="5">其他私人旅行</option>
					<option value="6">信息服务</option>
					<option value="7">法律服务</option>
				</select>
			</div>
		</div>
		<div style="height: 50px"></div>
		<div class="layui-form-item">
			<div class="layui-input-block">
				<button class="layui-btn" lay-submit lay-filter="formDemo">下一步</button>
				<button type="reset" class="layui-btn layui-btn-primary">重置</button>
			</div>
		</div>

	<script>
		$(function () {
			//查询收款账户信息
			$("input[name='reusernumber']").on('change' function () {
				var reusername=$("input[name='reusername']").val();
				var reusernumber=$("input[name='reusernumber']").val();
				$.post("CrossBorder/reuser",
					{"reusername":reusername,"reusernumber":reusernumber},function(data){
						$('#msg').text(data)
				},"json");
			})
		//根据汇款人姓名查询汇款人是否存在username
		$("input[name='username']").on('change' function () {
				var username=$("input[name='username']").val();
				$.post("CrossBorder/findUser",
					{"username":username},function(data){
						$('#msgUser').text(data)
				},"json");
			})
			
			//查询当前账户余额与输入金额进行比较moneynumber
			$("input[name='moneynumber']").on('change' function () {
				var moneynumber=$("input[name='moneynumber']").val();
				$.post("CrossBorder/findMoney",
					{"moneynumber":moneynumber},function(data){
						$('#msgUser').text(data)
				},"json");
			})
		
		})

		layui.use('form', function() {
			var form = layui.form;
			form.render();
			//监听提交
			form.on('submit(formDemo)', function(data) {
				layer.msg(JSON.stringify(data.field));
				return false;
			});
		});
	</script>
</body>
</html>