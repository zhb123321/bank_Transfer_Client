package com.zl.bts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zl.bts.pojo.Personal;
import com.zl.bts.pojo.RestData;
import com.zl.bts.service.perService;


@RestController
@RequestMapping("client")
public class ClentInfo {
		@Autowired
		perService perService;
		RestData restData=new RestData();
		
		@RequestMapping("findById/{uid}")
		@HystrixCommand(fallbackMethod="HystrixData")
		public RestData findById(@PathVariable("uid")Integer uid) {
			System.err.println(uid);
			if(uid == null) {
				throw new RuntimeException("id 不能为null,id:"+uid);
			}
			Personal personal =perService.findById(uid);
			System.out.println(personal.toString());
			if (personal==null) {
				throw new RuntimeException("没有找到结果");
			}
			restData.setMsg(null);
			restData.setSuccess(true);
		
       return restData;
		}
		public RestData HystrixData(@PathVariable("uid")Integer uid) {
			restData.setMsg("uid:"+uid+"没有相关数据");
			restData.setSuccess(false);
			return restData;
		}

}
