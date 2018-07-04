package com.jt.springbootweb;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.*;

@Service("publish")
public class Publisher {

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;
    public void publish(String destinationName, String message) {
        Destination destination = new ActiveMQTopic(destinationName);
        System.out.println("============>>>>> 发布topic消息 " + message);
        jmsMessagingTemplate.convertAndSend(destination, message);
    }
}