package com.jt.springbootweb;


import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.ScheduledMessage;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.MessagePostProcessor;
import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.SimpleMessageConverter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.*;

@Service("producer")
public class Producer  {//extends SimpleMessageConverter { 设置延迟发送


    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;
    public void sendMsg(String destinationName, String message) {
        System.out.println("============>>>>> 发送queue消息 " + message);
        Destination destination = new ActiveMQQueue(destinationName);
        jmsMessagingTemplate.convertAndSend(destination, message);
    }

    //以下延迟不起作用
   /* //    @Override
    public Message toMessage(Object object, Session session) throws JMSException, MessageConversionException {
        Message message = super.toMessage(object, session);
        message.setLongProperty("JMS_JBOSS_SCHEDULED_DELIVERY", System.currentTimeMillis() + 1000*20);
        return message;
    }*/
}