package com.jt.srpingbootserver.example;

import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.stereotype.Service;

import javax.jms.ConnectionFactory;

@Service
public class Subscriber {

    @JmsListener(destination = "publish1", containerFactory = "myJmsContainerFactory")
    public void subscribe(String text) {
        System.out.println("===========<<<<<<<<收到订阅的消息" + text);
    }
/*    @JmsListener(destination = "publish", containerFactory = "myJmsContainerFactory")
    public void subscribe1(String text) {
        System.out.println("===========<<<<<<<<收到订阅的消息" + text);
    }
    @JmsListener(destination = "publish", containerFactory = "myJmsContainerFactory")
    public void subscribe2(String text) {
        System.out.println("===========<<<<<<<<收到订阅的消息" + text);
    }*/
    /*@JmsListener(destination = "publish3", containerFactory = "myJmsContainerFactory")
    public void subscribe3(String text) {
        System.out.println("===========<<<<<<<<收到订阅的消息" + text);
    }
    @JmsListener(destination = "publish4", containerFactory = "myJmsContainerFactory")
    public void subscribe4(String text) {
        System.out.println("===========<<<<<<<<收到订阅的消息" + text);
    }
    @JmsListener(destination = "publish5", containerFactory = "myJmsContainerFactory")
    public void subscribe5(String text) {
        System.out.println("===========<<<<<<<<收到订阅的消息" + text);
    }
    @JmsListener(destination = "publish6", containerFactory = "myJmsContainerFactory")
    public void subscribe6(String text) {
        System.out.println("===========<<<<<<<<收到订阅的消息" + text);
    }
    @JmsListener(destination = "publish7", containerFactory = "myJmsContainerFactory")
    public void subscribe7(String text) {
        System.out.println("===========<<<<<<<<收到订阅的消息" + text);
    }
    @JmsListener(destination = "publish8", containerFactory = "myJmsContainerFactory")
    public void subscribe8(String text) {
        System.out.println("===========<<<<<<<<收到订阅的消息" + text);
    }*/

    @Bean
    JmsListenerContainerFactory<?> myJmsContainerFactory(ConnectionFactory connectionFactory){
        SimpleJmsListenerContainerFactory factory = new SimpleJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setPubSubDomain(true);
        return factory;
    }
}