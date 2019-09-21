package com.zl.bts.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zl.bts.pojo.Account;
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
	//批量转账
	@RequestMapping(value="/plzz")
    @ResponseBody
	public String plzz(@RequestBody String data){
		JSONObject jsonObject = JSONObject.parseObject(data);
		System.out.println(jsonObject);
		Plzz share = JSON.toJavaObject(jsonObject,Plzz.class);
		System.out.println(share);
		for(Ss s:share.getSs())
		{
			TransactionRecord t= new TransactionRecord();
			t.setTid(s.getTempId());
			t.setInaccount(share.getDd().getInaccount());
			t.setMoney(s.getMoney());
			t.setBankname("工商银行");
			t.setUsername(s.getUsername());
			t.setUsername(s.getOutaccount());
			trs.addTransactionRecord(t);
		}
		return "success";
	}
	//转账限额
	@RequestMapping(value="/zhxe")
	@ResponseBody
	public String zhxe(@RequestBody String data){
		JSONObject jsonObject = JSONObject.parseObject(data);
		Account share = JSON.toJavaObject(jsonObject,Account.class);
		System.out.println(share);
		if(as.updataAccount(share.getAmountlimit())){
			return "success";
		}else{
			return  "false";
		}		
	}
	
	
}