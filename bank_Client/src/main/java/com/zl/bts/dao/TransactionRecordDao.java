package com.zl.bts.dao;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.zl.bts.pojo.InerbankTransfer;
import com.zl.bts.pojo.TransactionRecord;
@Mapper
public interface TransactionRecordDao {
	public void addInerbankTransfer(InerbankTransfer t);
	
	public void addTransactionRecord(TransactionRecord t);
	
	//查询转账记录
	public List<TransactionRecord> queryAll(Map<String,Object> map);
	//查询历史转账记录
	public List<TransactionRecord> queryFinshed(Map<String,Object> map);
	//查询未完成转账记录
	public List<TransactionRecord> queryUnFinshed(Map<String,Object> map);
	
	//查询历史转账记录总数据量
	public Integer queryTotalCountAll();
	
	//查询历史转账记录总数据量
	public Integer queryTotalCountFinshed();
	// 查询未完成转账记录总数据量
	public Integer queryTotalCountUnFinshed();
}
