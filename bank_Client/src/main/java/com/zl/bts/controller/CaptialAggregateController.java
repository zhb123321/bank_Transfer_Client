package com.zl.bts.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zl.bts.service.impl.CapitalAggregateServiceImpl;

@Controller
@RequestMapping("/cac")

//控制中心
public class CaptialAggregateController {
	//https://github.com/zhb123321/bank_Transfer_Client
	@Autowired
	private  CapitalAggregateServiceImpl serviceimpl;
	
	public void test() {
		
	}
}
