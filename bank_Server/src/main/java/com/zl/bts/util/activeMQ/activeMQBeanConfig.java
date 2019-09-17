package com.zl.bts.util.activeMQ;


 
import javax.jms.Queue;
import javax.jms.Topic;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

@Component
@EnableJms
public class activeMQBeanConfig {

	/*设置队列名称name*/
   /* private static final String QUEUE_NAME = "active.queue";
      */
    private static final String TOPIC_NAME = "active.topic";

	@Value("${myqueue}")
	private String myqueue;
    @Bean
    public Queue queue(){
        return new ActiveMQQueue(myqueue);
    }
 
    @Bean
    public Topic topic(){
        return new ActiveMQTopic(TOPIC_NAME);
    }
}

