package com.zl.bts.dao;

import java.util.List;

import com.zl.bts.pojo.TransactionRecord;
import com.zl.bts.util.Page;

public interface TransactionRecordDao {
	public void addTransactionRecord(TransactionRecord t);
	public List<TransactionRecord> selectTransactionRecord(Page p);
}
