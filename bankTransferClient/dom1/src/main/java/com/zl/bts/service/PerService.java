package com.zl.bts.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zl.bts.pojo.RestData;
import com.zl.bts.service.impl.UserClientServiceFallbackFactory;

@FeignClient(value="per",fallback=UserClientServiceFallbackFactory.class)
public interface PerService {
	
	@RequestMapping("client/findById/{uid}")
	RestData findUser(@PathVariable(value="uid")Integer uid);

}
