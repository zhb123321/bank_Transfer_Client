package com.zl.bts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.bts.dao.InerBankDao;
import com.zl.bts.pojo.Account;
import com.zl.bts.pojo.InerbankTransfer;
import com.zl.bts.service.InerBankService;

@Service
public class InerBankServiceImpl implements InerBankService {
	
	@Autowired
	private InerBankDao dao;
	

	@Override
	public String findByNumber(Account a) {
		//传入银行卡号进行验证
		String name = dao.findByNumber(a);
		
		return name;
	}


	@Override
	public Long findForNumber() {
		// 获取当前订单号
		Long number = dao.findForNumber();
		return number;
	}


	@Override
	public void addIner(InerbankTransfer ibt) {
		// 生成新的交易订单
		dao.addIner(ibt);
	}


	@Override
	public void ad(Account a) {
		// 加钱
		dao.ad(a);
		
	}


	@Override
	public void de(Account a) {
		// 减钱
		dao.de(a);
		
	}


	@Override
	public void zt(InerbankTransfer ibt) {
		// 修改状态
		dao.zt(ibt);
		
	}


	@Override
	public void ye(InerbankTransfer ibt) {
		// 修改余额
		dao.ye(ibt);
		
	}


	@Override
	public void lastTime(InerbankTransfer ibt) {
		// 修改最后操作时间
		dao.lastTime(ibt);
		
	}

}
