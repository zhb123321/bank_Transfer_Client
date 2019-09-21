package com.zl.bts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.zl.bts.pojo.TransactionRecord;
import com.zl.bts.service.TransactionRecordService;
import com.zl.bts.util.Page;
import com.zl.bts.util.ResultMap;

@Controller
@RequestMapping("/tc")
public class TransactionController {
	
	@Autowired
	private TransactionRecordService trs;
	
	@RequestMapping(value = "/list")
	@ResponseBody
	public ResultMap<List<TransactionRecord>> selectMaterialList(Page page, @RequestParam("limit") int limit) {
		// 设置一次查询的条数
		page.setRows(limit);
		// 查询数据
		List<TransactionRecord> List = trs.findTransactionRecord(page);
		System.out.println(page);
		// 查询总条数
		int totals = 10;
		page.setTotalRecord(totals);
		// 返回给结果集
		return new ResultMap<List<TransactionRecord>>("", List, 0, totals);
	}
	
	
	@RequestMapping(value = "/bj")
	@ResponseBody
	public String bj(@RequestBody String data){
		JSONObject jsonObject = JSONObject.parseObject(data);
		System.out.println(jsonObject);
		return "success";
	}
}
