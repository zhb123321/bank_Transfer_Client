package com.zl.bts.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zl.bts.pojo.ActiveCollection;
import com.zl.bts.service.ActiveCollectionService;
import com.zl.bts.util.ConvertUpMoney;
import com.zl.bts.util.MessageResult;

@Controller
@RequestMapping("/active")
public class ActiveController {
	
	@Autowired
	private ActiveCollectionService activeCollectionService;

	@RequestMapping("upMoney")
	@ResponseBody
	public String upMoney(String moneynumber) {
		//System.out.println(moneynumber);
		String chinese = ConvertUpMoney.toChinese(moneynumber);
		return chinese;
	}
	
	@RequestMapping("insertActive")
	public ModelAndView insertInfo(ActiveCollection activeCollection) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = format.format(date);
		
		//查询表的最大id
		Long maxid = activeCollectionService.findMaxAid();
		activeCollection.setAid(maxid+1);
		activeCollection.setUptime(str);
		activeCollection.setDeletetype("0");
		activeCollectionService.insertActiveInfo(activeCollection);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/checkActive?maxid="+maxid);
		return modelAndView;
	}
	
	//短信验证模拟
	@RequestMapping("checkMessage")
	@ResponseBody
	public MessageResult checkMessage(String message) {
		return new MessageResult("0");
	}
	
	
}
