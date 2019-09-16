package com.zl.bts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.zl.bts.dao.PerDao;
import com.zl.bts.pojo.Personal;
import com.zl.bts.service.perService;
@Service
public class perServiceImpl implements perService {

	@Autowired
	PerDao  perDao;
	/**
	 * 根据ID查询实体
	 * @param id
	 * @return
	 * @Cacheable 添加缓存 value属性表示缓存整体唯一标识,key属性标识缓存键值对中的key
	 */
	@Cacheable(value = "gathering",key = "#uid")
	public Personal findById(Integer uid) {
		return perDao.findById(uid);
	}

}
