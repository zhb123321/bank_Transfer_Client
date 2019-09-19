package com.zl.bts.controller;


import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zl.bts.pojo.CaptialAggregate;
import com.zl.bts.service.impl.CapitalAggregateServiceImpl;

@Controller
@RequestMapping("/cac")

//控制中心
public class CaptialAggregateController {
	//https://github.com/zhb123321/bank_Transfer_Client
	@Autowired
	private  CapitalAggregateServiceImpl serviceimpl;
	@RequestMapping("addCapitalAggregate")
	public void addCapitalAggregate(CaptialAggregate ca) {
		
		
		BigDecimal maxId = serviceimpl.getMaxId();
		if(null!=maxId) {
			ca.setCapitalid(maxId);
		}
		
		serviceimpl.addCapitalAggregate(ca);
	}
}
