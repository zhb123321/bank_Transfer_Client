package com.zl.bts.dao;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.zl.bts.pojo.CrossborderTransfer;
import com.zl.bts.pojo.InerbankTransfer;
import com.zl.bts.pojo.InterbankTransfer;
import com.zl.bts.pojo.page;

public interface TransferAuditDao {

	List<InerbankTransfer> InerbankInfo(page qc);

	List<CrossborderTransfer> CrossborderInfo(page qc);

	CrossborderTransfer queryByCId(Integer cid);

	void updateCt(CrossborderTransfer ct);

	void updateAccountMoney(@Param("userid")Long userid,@Param("tmoney") Long tmoney);

	Long selectMoney(Long userid);

	InerbankTransfer queryByNId(Integer nid);

	void updateIt(InerbankTransfer it);

	List<InterbankTransfer> InterbankInfo(page qc);
	
	InterbankTransfer queryByIId(Integer iid);

	void updateIit(InterbankTransfer iit);

}
