package com.zl.bts.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping(value="/pc")
public class PlzzController { 
	
	
	@RequestMapping(value="/plzz")
    @ResponseBody
	public String plzz(@RequestBody String data){
		System.out.println("asasassasaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println("sas:"+data);
		
		return "";
	}
}