package com.zl.bts.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("test")
public class ComsumerController {
	
	
	
	@JmsListener(destination = "${myqueue}")
	//@SendTo("sample.result")
	public void receiveQueue(String msg) throws InterruptedException {  
		 System.out.println("Consumer收到的报文为:"+msg); 
	} 
 

    
    /**
     * 监听和读取topic消息
     * @param message
     */
    @JmsListener(destination="active.topic")
    public void readActiveTopic(String message) {
        System.out.println("接受到：" + message);
        //TODO something
    }
}

