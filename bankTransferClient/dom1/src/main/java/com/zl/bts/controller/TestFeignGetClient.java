package com.zl.bts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zl.bts.pojo.RestData;
import com.zl.bts.service.PerService;


@RequestMapping("/feign")
@RestController
public class TestFeignGetClient {
	
		@Autowired
		private PerService  perService;
			
		@RequestMapping("personal/{uid}")
		public RestData findById(@PathVariable(value="uid")Integer uid) {
			System.err.println(uid);
			return perService.findUser(uid);
		}
}
