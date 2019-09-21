package com.zl.bts.service;


import java.util.List;
import java.util.Map;

import com.zl.bts.pojo.InerbankTransfer;
import com.zl.bts.pojo.TransactionRecord;

public interface TransactionRecordService {
	public void addInerbankTransfer(InerbankTransfer t);
	public void addTransactionRecord(TransactionRecord t);
	//查询历史转账记录
	public List<TransactionRecord> queryFinshed(Map<String,Object> map);
	//查询未完成转账记录
	public List<TransactionRecord> queryUnFished(Map<String,Object> map);
		
	//查询历史转账记录总数据量
	public Integer queryTotalCountFinshed();
	// 查询未完成转账记录总数据量
	public Integer queryTotalCountUnFinshed();
	//查询转账记录
	public List<TransactionRecord> queryAll(Map<String,Object> map);
	//查询历史转账记录总数据量
	public Integer queryTotalCountAll();
}
