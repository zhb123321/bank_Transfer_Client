package com.zl.bts.dao;

import java.util.List;
import java.util.Map;

import com.zl.bts.pojo.TransactionRecord;

public interface TransactionRecordDao {
	public void addTransactionRecord(TransactionRecord t);
	
	//查询历史转账记录
	public List<TransactionRecord> queryFinshed(Map<String,Object> map);
	//查询未完成转账记录
	public List<TransactionRecord> queryUnFished(Map<String,Object> map);
	
	//查询历史转账记录总数据量
	public Integer queryTotalCountFinshed();
	// 查询未完成转账记录总数据量
	public Integer queryTotalCountUnFinshed();
}
