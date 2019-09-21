package com.zl.bts.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zl.bts.dao.TransferAuditDao;
import com.zl.bts.pojo.Account;
import com.zl.bts.pojo.CrossborderTransfer;
import com.zl.bts.pojo.InerbankTransfer;
import com.zl.bts.pojo.InterbankTransfer;
import com.zl.bts.pojo.page;
import com.zl.bts.service.TransferAuditService;

@Service
public class TransferAuditServiceImpl implements TransferAuditService {
		
	@Autowired
	private TransferAuditDao transferAuditDao;
	
	Date date = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式

	@Override
	public List<InerbankTransfer> InerbankInfo(page qc) {
		return transferAuditDao.InerbankInfo(qc);
	}

	@Override
	public List<CrossborderTransfer> CrossborderInfo(page qc) {
		return transferAuditDao.CrossborderInfo(qc);
	}
	
	@Override
	public List<InterbankTransfer> InterbankInfo(page qc) {

		return transferAuditDao.InterbankInfo(qc);
	}

//查询账户余额
	public Long selectMoney(Long userid) {
			return transferAuditDao.selectMoney(userid);
		}
//跨境
	public CrossborderTransfer queryByCId(Integer cid) {
		return transferAuditDao.queryByCId(cid) ;
	}

//成功
	@Transactional
	public void updateCt(CrossborderTransfer ct,Long money) {
		if (money>=ct.getMoneynumber()||money!=null) {
			transferAuditDao.updateCt(ct);
			Long tmoney=money-ct.getMoneynumber()-ct.getFee();
			transferAuditDao.updateAccountMoney(ct.getUserid(),tmoney);
		}
	}
//失败
	public void updateStatus(CrossborderTransfer ct) {
		transferAuditDao.updateCt(ct);
	}
	
//行内

	@Override
	public InerbankTransfer queryByNId(Integer nid) {
		return transferAuditDao.queryByNId(nid) ;
	}
//成功
	public void updateIt(InerbankTransfer it, Long money) {
		if (money>=it.getMoney()||money!=null) {
		transferAuditDao.updateIt(it);
		Long tmoney=money-it.getMoney()-it.getFee();
		it.setBalance(tmoney);
		transferAuditDao.updateAccountMoney(it.getUserid(),tmoney);
		}
	}

//失败
	public void updateStatus(InerbankTransfer it) {
		transferAuditDao.updateIt(it);
		
	}
//外行
	@Override
	public InterbankTransfer queryByIId(Integer iid) {

		return transferAuditDao.queryByIId(iid);
	}
	
	//成功
		public void updateIit(InterbankTransfer iit, Long money) {
			if (money>=iit.getMoney()||money!=null) {
			transferAuditDao.updateIit(iit);
			Long tmoney=money-iit.getMoney()-iit.getFee();
			iit.setBalance(tmoney);
			transferAuditDao.updateAccountMoney(iit.getUserid(),tmoney);
			}
		}

	//失败
		public void updateStatus(InterbankTransfer iit) {
			transferAuditDao.updateIit(iit);
			
		}


}
