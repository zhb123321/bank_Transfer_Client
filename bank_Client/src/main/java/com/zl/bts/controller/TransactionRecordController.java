package com.zl.bts.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.bts.pojo.Layui;
import com.zl.bts.pojo.TransactionRecord;
import com.zl.bts.service.impl.TransactionRecordServiceImpl;

@Controller
@RequestMapping("/trc")
public class TransactionRecordController {
	@Autowired
	private TransactionRecordServiceImpl traservice;
	//查询历史转账记录
	@RequestMapping("queryFinshedRecord")
	@ResponseBody
	public Layui queryFinshedRecord(Model model,Integer page,Integer limit) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("endPage", page*limit);
		map.put("beginPage", (page-1)*limit);
		List<TransactionRecord> list = traservice.queryFinshed(map);
		Integer totalCountFinshed = traservice.queryTotalCountFinshed();
		
		return  Layui.data(totalCountFinshed, list);
	}
	//查询未完成转账记录
		@RequestMapping("queryFinshedUnRecord")
		@ResponseBody
		public Layui queryFinshedUnRecord(Model model,Integer page,Integer limit) {
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("endPage", page*limit);
			map.put("beginPage", (page-1)*limit);
			List<TransactionRecord> list = traservice.queryUnFished(map);
			Integer totalCountUnFinshed = traservice.queryTotalCountUnFinshed();
			
			return  Layui.data(totalCountUnFinshed, list);
		} 
	//查询所有转账记录
		@RequestMapping("queryAllRecord")
		@ResponseBody
		public Layui queryAllRecord(Integer page,Integer limit) {
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("endPage", page*limit);
			map.put("beginPage", (page-1)*limit);
			List<TransactionRecord> list = traservice.queryAll(map);
			Integer totalCountAll = traservice.queryTotalCountAll();
			
			return  Layui.data(totalCountAll, list);
		} 
}
