package com.zl.bts.service.impl;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.bts.dao.TransactionRecordDao;
import com.zl.bts.pojo.CrossborderTransfer;
import com.zl.bts.pojo.InerbankTransfer;
import com.zl.bts.pojo.InterbankTransfer;
import com.zl.bts.pojo.TransactionRecord;
import com.zl.bts.service.TransactionRecordService;

@Service 
public class TransactionRecordServiceImpl implements TransactionRecordService{
	@Autowired
	private TransactionRecordDao trdao;
	//新增转账记录
	public void addTransactionRecord(TransactionRecord t) {
		trdao.addTransactionRecord(t);		
	}
	
	//获取id最大值
	public Integer getMaxId() {
		return trdao.getMaxId();
	}

	//查询历史转账记录
	public List<TransactionRecord> queryFinshed(Map<String,Object> map){
			return trdao.queryFinshed(map);
	}
	//查询未完成转账记录
	public List<TransactionRecord> queryUnFished(Map<String,Object> map){
		return trdao.queryUnFinshed(map);
	}
		
	//查询历史转账记录总数据量
	public Integer queryTotalCountFinshed() {
		return trdao.queryTotalCountFinshed();
	}
	// 查询未完成转账记录总数据量
	public Integer queryTotalCountUnFinshed() {
		return trdao.queryTotalCountUnFinshed();
	}
	//查询转账记录
	public List<TransactionRecord> queryAll(Map<String,Object> map){
		return trdao.queryAll(map);
	}
	//查询所有转账记录总数据量
	public Integer queryTotalCountAll(Map<String,Object> map) {
		return trdao.queryTotalCountAll(map);
				
	}
	//查询行内转账
	public List<InerbankTransfer> queryInerbankTransferByUserId(Integer userid){
		return trdao.queryInerbankTransferByUserId(userid);
	}
	//查询跨行转账
	public List<InterbankTransfer> queryInterbankTransferByUserId(Integer userid){
		return trdao.queryInterbankTransferByUserId(userid);
	}
	//查询跨镜转账
	public List<CrossborderTransfer> queryCrossborderTransferByUserId(Integer userid){
		return trdao.queryCrossborderTransferByUserId(userid);
	}

}
