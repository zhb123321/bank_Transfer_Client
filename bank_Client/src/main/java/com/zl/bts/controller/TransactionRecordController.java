package com.zl.bts.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.bts.pojo.CrossborderTransfer;
import com.zl.bts.pojo.InerbankTransfer;
import com.zl.bts.pojo.InterbankTransfer;
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
		public Layui queryAllRecord(Integer page,Integer limit,Integer keyType,String keyNum,String keyWord) {
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("endPage", page*limit);
			map.put("beginPage", (page-1)*limit);
			map.put("transtype", keyType);
			map.put("datetime", keyNum);
			map.put("username", keyWord);
			System.out.println(keyType);
			List<TransactionRecord> list = traservice.queryAll(map);
			Integer totalCountAll = traservice.queryTotalCountAll(map);
			
			return  Layui.data(totalCountAll, list);
		} 
		
		//新增转账记录
		/*@RequestMapping("addTransactionRecord")
		@ResponseBody
		public void addTransactionRecord() {
			TransactionRecord  t = new TransactionRecord();
			
			//行内转账
			List<InerbankTransfer> inerList = traservice.queryInerbankTransferByUserId(1);
			//跨行转账
			List<InterbankTransfer> interList = traservice.queryInterbankTransferByUserId(2);
			//跨镜转账
			List<CrossborderTransfer> CrossborderList = traservice.queryCrossborderTransferByUserId(3);
			for (CrossborderTransfer crossborderTransfer : CrossborderList) {
				Integer maxId = traservice.getMaxId();
				t.setTid(maxId+1);
				t.setUserid(crossborderTransfer.getUserid());
				t.setRealname(crossborderTransfer.getUsername());
				t.setInaccount(inaccount);
				t.setPhone(phone);
				t.setInvoice(Invoice);
				t.setCurrencyid(currencyid);
				t.setMoney(money);
				t.setStatus(status);
				t.setTranstype(transtype);
				t.setDatetime(datetime);
				t.setBankname(bankname);
				t.setUsername(username);
				t.setOutaccount(outaccount);
				t.setUptime(uptime);
				t.setDeletetype(deletetype);
				
			}
			
			
			
			traservice.addTransactionRecord(t);
		}*/
}
