package com.zl.bts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zl.bts.pojo.RestData;
import com.zl.bts.service.PerService;


@RequestMapping("/feign")
@RestController
@EnableScheduling
public class TestFeignGetClient {
	
		@Autowired
		private PerService  perService;
			
		@RequestMapping("personal/{uid}")
		public RestData findById(@PathVariable(value="uid")Integer uid) {
			System.err.println(uid);
			return perService.findUser(uid);
		}
//	/*	这些星号由左到右按顺序代表 ：     *    *     *     *    *     *   *     
//        				格式： [秒] [分] [小时] [日] [月] [周] [年] */
//		@Scheduled(cron="0/3 * * * * ?")
//		public void testQuartz() {
//			System.err.println("定时开启");
//		}
		
		
}
