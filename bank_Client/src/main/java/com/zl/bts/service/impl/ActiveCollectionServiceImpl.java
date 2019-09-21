package com.zl.bts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.bts.dao.ActiveDao;
import com.zl.bts.pojo.ActiveCollection;
import com.zl.bts.service.ActiveCollectionService;

@Service
public class ActiveCollectionServiceImpl implements ActiveCollectionService {
	
	@Autowired
	private ActiveDao activeDao;

	@Override
	public void insertActiveInfo(ActiveCollection activeCollection) {
		activeDao.insertSelective(activeCollection);
	}

	@Override
	public Long findMaxAid() {
		return activeDao.selectMaxAid();
	}

	@Override
	public ActiveCollection findActiveInfo(Long maxid) {
		return activeDao.selectByPrimaryKey(maxid);
	}
	

}
