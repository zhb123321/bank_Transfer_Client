package com.zl.bts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.bts.dao.TransactionRecordDao;
import com.zl.bts.pojo.TransactionRecord;
import com.zl.bts.service.TransactionRecordService;
import com.zl.bts.util.Page;

@Service
public class TransactionRecordServiceImpl implements TransactionRecordService{
	@Autowired
	private TransactionRecordDao trdao;
	
	public void addTransactionRecord(TransactionRecord t) {
		trdao.addTransactionRecord(t);		
	}

	@Override
	public List<TransactionRecord> findTransactionRecord(Page p) {
		List<TransactionRecord> s=trdao.selectTransactionRecord(p);
		return s;
	}

}
