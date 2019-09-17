package com.zl.bts.controller;



import java.util.UUID;

import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.Topic;
import javax.validation.Payload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
 
    @Autowired
    private Queue queue;
 
    @Autowired
    private Topic topic;
 
    /*
     * 消息生产者
     */
    @RequestMapping("/sendQueueMsg/{msg}")
    public void sendQueueMsg(@PathVariable("msg")String msg) {
    	 // 指定消息发送的目的地及内容
        this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
    }
    
    /*定时间隔3秒发送到消息队列*/
   /* @Scheduled(fixedDelay=3000)	*/
   /* public void sendQueueMsgScheduled() {
   	 // 指定消息发送的目的地及内容
       this.jmsMessagingTemplate.convertAndSend(this.queue,"hello"+UUID.randomUUID());
   }*/
    
    
    
    @RequestMapping("/sendTopicMsg")
    public void sendTopicMsg(String msg) {
        // 指定消息发送的目的地及内容
        System.out.println("@@@@@@@@@@@@@@" + msg);
        this.jmsMessagingTemplate.convertAndSend(this.topic, msg);
    }
}
