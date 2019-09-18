package com.zl.bts.controller;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.zl.bts.pojo.BankResult;
import com.zl.bts.pojo.Currency;
import com.zl.bts.service.CrossBorderService;
import com.zl.bts.util.BankUtil;

@RestController
@RequestMapping("CrossBorder")
public class CrossBorderController {
	@Autowired
	private CrossBorderService  crossBorderService;
	
	
		//查询收款账户信息
		@RequestMapping("reuser")
		public String reuser(String reusername,String reusernumber) throws InvalidKeyException, NoSuchAlgorithmException, UnsupportedEncodingException {
			reusernumber="4391880081522983";
					reusername="王金山";
			BankUtil bankUtil = new BankUtil();
			String bankResult = bankUtil.BankResult(reusername,reusernumber);
			System.out.println(bankResult+"bankResult");
			BankResult result = JSON.parseObject(bankResult, BankResult.class);
			System.err.println(result.getShowBody());
			String code = result.getShowBody().getCode();
			System.err.println(result.toString());
			if (code.equals("0")||code!=null) {
				System.out.println("账户验证成功");
				return "账户验证成功";
			}else {
				System.out.println("账户不合法");
				return "账户不合法";
			}
		}
	
		//查询币种信息
		@RequestMapping("findCurrency")
		public List<Currency> findCurrency(Model model) {
			List<Currency> currency = crossBorderService.findCurrency();
			model.addAttribute("currencys", currency);
			return currency;
		}
	
		//根据汇款人姓名查询汇款人是否存在
		@RequestMapping("findUser")
		public String findUser(String username) {
			Integer i = crossBorderService.findUser(username);
			if (i>=1) {
				return "账户姓名正确";
			}else {
				return "账户姓名不存在";
			}
			
		} 
	
		//查询当前用户名下账户
	
		//查询当前账户余额与输入金额进行比较
		@RequestMapping("findMoney")
		public String findMoney(Long moneynumber) {
			Long  money= crossBorderService.findMoney();
			if (money>=moneynumber) {
				return "资金充足";
			}else {
				return "资金不足";
			}
		} 
		
	//开始转账
		public String CrossBorder() {
			Long cid=crossBorderService.findCrossBorderId()+1;
			crossBorderService.CrossBorder();
			return "";
		} 

		
}
