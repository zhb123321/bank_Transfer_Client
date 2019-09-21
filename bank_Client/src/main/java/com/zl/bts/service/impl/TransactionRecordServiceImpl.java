package com.zl.bts.service.impl;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.bts.dao.TransactionRecordDao;
import com.zl.bts.pojo.TransactionRecord;
import com.zl.bts.service.TransactionRecordService;

@Service
public class TransactionRecordServiceImpl implements TransactionRecordService{
	@Autowired
	private TransactionRecordDao trdao;
	
	public void addTransactionRecord(TransactionRecord t) {
		trdao.addTransactionRecord(t);		
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
	//查询历史转账记录总数据量
	public Integer queryTotalCountAll() {
		return trdao.queryTotalCountAll();
				
	}
}
