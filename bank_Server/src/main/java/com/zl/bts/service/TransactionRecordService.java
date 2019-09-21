package com.zl.bts.service;

import java.util.List;

import com.zl.bts.pojo.TransactionRecord;
import com.zl.bts.util.Page;

public interface TransactionRecordService {
	public void addTransactionRecord(TransactionRecord t);
	public List<TransactionRecord> findTransactionRecord(Page p);
}
