package com.zl.bts.controller;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.bts.pojo.CaptialAggregate;
import com.zl.bts.pojo.Layui;
import com.zl.bts.service.impl.CapitalAggregateServiceImpl;

@Controller
@RequestMapping("/cac")

//控制中心
public class CaptialAggregateController {
	//https://github.com/zhb123321/bank_Transfer_Client
	@Autowired
	private  CapitalAggregateServiceImpl serviceimpl;
	//行内资金归集
	@RequestMapping("addCapitalAggregateInLine")
	public String addCapitalAggregateInLine(CaptialAggregate ca) {
		BigDecimal bd = new BigDecimal(1);
		ca.setDeletetype("0");//0-存在，1-删除
		ca.setUptime("2019-09-19"); 
		ca.setSigningstatus("0");//1未通过,2已通过,0审核中
		BigDecimal maxId = serviceimpl.getMaxId();
		if(null!=maxId) {
			
			ca.setCapitalid(maxId.add(bd));
		}
		
		serviceimpl.addCapitalAggregate(ca);
		return "Payee-pages/capital_aggregate_inLine_Show";
	}
	
	//跨行资金归集
		@RequestMapping("addCapitalAggregateOutLine")
		public String addCapitalAggregateOutLine(CaptialAggregate ca) {
			BigDecimal bd = new BigDecimal(1);
			ca.setDeletetype("0");//0-存在，1-删除
			ca.setUptime("2019-09-19");
			ca.setSigningstatus("0");//1未通过,2已通过,0审核中
			BigDecimal maxId = serviceimpl.getMaxId();
			if(null!=maxId) {
				
				ca.setCapitalid(maxId.add(bd));
			}
			
			serviceimpl.addCapitalAggregate(ca);
			return "Payee-pages/capital_aggregate_outLine_Show";
		}
		
		//查询行内资金归集签约单
		@RequestMapping("showCapitalAggregateInLine")
		@ResponseBody
		public Layui showCapitalAggregateInLine(Model model,Integer page,Integer limit){
			
			
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("endPage", page*limit);
			map.put("beginPage", (page-1)*limit);
			
			Integer totalCount = serviceimpl.queryTotalCountInLine();
			
			List<CaptialAggregate> list = serviceimpl.queryCapitalAggregateInLine(map);
			//Integer totalPages = totalCount%limit==0 ? totalCount/limit : totalCount/limit+1;
			
			
			
			//System.out.println(totalCount);
			
			return Layui.data(totalCount, list);
			
		}
		//查询跨行资金归集签约单
		@RequestMapping("showCapitalAggregateOutLine")
		@ResponseBody
		public Layui showCapitalAggregateOutLine(Model model,Integer page,Integer limit){
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("endPage", page*limit);
			map.put("beginPage", (page-1)*limit);
			
			Integer totalCount = serviceimpl.queryTotalCountOutLine();
			
			List<CaptialAggregate> list = serviceimpl.queryCapitalAggregateOutLine(map);
			//Integer totalPages = totalCount%limit==0 ? totalCount/limit : totalCount/limit+1;
			
			return Layui.data(totalCount, list);
		}
		
		//批量删除
		@RequestMapping("updateDeleteType")
		@ResponseBody
		public String updateDeleteType(Integer[] capitalids,CaptialAggregate ca) {
			Map<String,Object> map = new HashMap<String,Object>();
			ca.setDeletetype("1");
			map.put("ca", ca);
			map.put("arr", capitalids);
			serviceimpl.updateDeleteType(map);
			return "删除成功!";
		}
		
}
