package com.zl.bts.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zl.bts.pojo.Account;
import com.zl.bts.pojo.InerbankTransfer;
import com.zl.bts.pojo.Plzz;
import com.zl.bts.pojo.Ss;
import com.zl.bts.pojo.TransactionRecord;
import com.zl.bts.service.AccountService;
import com.zl.bts.service.TransactionRecordService;

@Controller
@RequestMapping(value="/pc")
public class PlzzController { 
	
	@Autowired
	private TransactionRecordService trs;
	@Autowired
	private AccountService as;
	
	@RequestMapping(value="/pl")
	public String pl(HttpServletRequest request){
		Account a= new Account();
		a.setUserid(Long.valueOf("123"));
		Long w=as.select(Long.valueOf("123"));
		request.getSession().setAttribute("w",w);
		return "bank/plzz";
	}
	
	@RequestMapping(value="/xe")
	public String xe(HttpServletRequest request){
		Account a= new Account();
		a.setUserid(Long.valueOf("123"));
		Long w=as.select(Long.valueOf("123"));
		request.getSession().setAttribute("w",w);
		return "Transaction-pages/zhxe";
	}
	
	
	//批量转账
	@RequestMapping(value="/plzz")
    @ResponseBody
	public String plzz(@RequestBody String data,HttpServletRequest request){
		JSONObject jsonObject = JSONObject.parseObject(data);
		System.out.println(jsonObject);
		Plzz share = JSON.toJavaObject(jsonObject,Plzz.class);
		System.out.println(share);
		for(Ss s:share.getSs())
		{
			InerbankTransfer t =new InerbankTransfer();
			t.setNid(s.getTempId());
			t.setInaccount(Long.valueOf(share.getDd().getInaccount()));
			t.setMoney(Long.valueOf(s.getMoney()));
			t.setBankname("工商银行");
			t.setUsername(s.getUsername());
			t.setUsername(s.getOutaccount());
			System.out.println("sss");
			//trs.addInerbankTransfer(t);
		}
		return "success";
	}
	//转账限额
	@RequestMapping(value="/zhxe")
	@ResponseBody
	public String zhxe(@RequestBody String data,HttpServletRequest request){
		JSONObject jsonObject = JSONObject.parseObject(data);
		Account share = JSON.toJavaObject(jsonObject,Account.class);
		System.out.println(share);
		System.out.println(as.updataAccount(share.getAmountlimit(),share.getCardnumber()));
		if(as.updataAccount(share.getAmountlimit(),share.getCardnumber())){
			return "success";
		}else{
			return  "false";
		}		
	}
	
	
}