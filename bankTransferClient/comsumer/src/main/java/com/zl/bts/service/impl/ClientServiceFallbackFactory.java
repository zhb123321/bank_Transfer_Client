package com.zl.bts.service.impl;

import org.springframework.stereotype.Service;

import com.zl.bts.pojo.RestData;
import com.zl.bts.service.PerService;
@Service
public class ClientServiceFallbackFactory implements PerService{

	public RestData findUser(Integer userid) {
		RestData restData = new RestData();
		restData.setSuccess(false);
		restData.setMsg("此Id:"+userid+"没有相关数据!");
		return restData;
	}
}
