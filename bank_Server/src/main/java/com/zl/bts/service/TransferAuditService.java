package com.zl.bts.service;

import java.util.List;

import com.zl.bts.pojo.CrossborderTransfer;
import com.zl.bts.pojo.InerbankTransfer;
import com.zl.bts.pojo.InterbankTransfer;
import com.zl.bts.pojo.page;

public interface TransferAuditService {

	List<InerbankTransfer> InerbankInfo(page qc);

	List<CrossborderTransfer> CrossborderInfo(page qc);

	Long selectMoney(Long userid);
	
	CrossborderTransfer queryByCId(Integer cid);

	void updateCt(CrossborderTransfer ct, Long money);

	void updateIt(InerbankTransfer it, Long money);

	InerbankTransfer queryByNId(Integer nid);

	void updateStatus(CrossborderTransfer ct);

	void updateStatus(InerbankTransfer it);

	List<InterbankTransfer> InterbankInfo(page qc);

	void updateIit(InterbankTransfer iit, Long money);

	void updateStatus(InterbankTransfer iit);

	InterbankTransfer queryByIId(Integer iid);




}
