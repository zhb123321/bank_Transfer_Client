package com.zl.bts.service;

import com.zl.bts.pojo.ActiveCollection;

public interface ActiveCollectionService {
	
	void insertActiveInfo(ActiveCollection activeCollection);

	Long findMaxAid();

	ActiveCollection findActiveInfo(Long maxid);
}
