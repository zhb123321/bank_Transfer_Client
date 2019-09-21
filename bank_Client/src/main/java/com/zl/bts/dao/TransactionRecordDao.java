package com.zl.bts.dao;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.zl.bts.pojo.CrossborderTransfer;
import com.zl.bts.pojo.InerbankTransfer;
import com.zl.bts.pojo.InterbankTransfer;
import com.zl.bts.pojo.InerbankTransfer;
import com.zl.bts.pojo.TransactionRecord;
@Mapper  
public interface TransactionRecordDao {

	//获取id最大值
	public Integer getMaxId();
	
	//新增转账记录

	public void addInerbankTransfer(InerbankTransfer t);
	
	public void addTransactionRecord(TransactionRecord t);
	
	//查询转账记录
	public List<TransactionRecord> queryAll(Map<String,Object> map);
	//查询历史转账记录
	public List<TransactionRecord> queryFinshed(Map<String,Object> map);
	//查询未完成转账记录
	public List<TransactionRecord> queryUnFinshed(Map<String,Object> map);
	
	//查询所有转账记录总数据量
	public Integer queryTotalCountAll(Map<String,Object> map);
	
	//查询历史转账记录总数据量
	public Integer queryTotalCountFinshed();
	// 查询未完成转账记录总数据量
	public Integer queryTotalCountUnFinshed();
	//查询行内转账
	public List<InerbankTransfer> queryInerbankTransferByUserId(Integer userid);
	//查询跨行转账
	public List<InterbankTransfer> queryInterbankTransferByUserId(Integer userid);
	//查询跨镜转账
	public List<CrossborderTransfer> queryCrossborderTransferByUserId(Integer userid);
}
