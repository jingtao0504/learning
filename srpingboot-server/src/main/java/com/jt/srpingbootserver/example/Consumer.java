package com.jt.srpingbootserver.example;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @JmsListener(destination = "producer0")
    public void receiveMsg(String text) {
        System.out.println("<<<<<<============ 收到消息： " + text);
    }
 /*   @JmsListener(destination = "producer1")
    public void receiveMsg1(String text) {
        System.out.println("<<<<<<============ 收到消息： " + text);
    }
    @JmsListener(destination = "producer2")
    public void receiveMsg2(String text) {
        System.out.println("<<<<<<============ 收到消息： " + text);
    }
    @JmsListener(destination = "producer3")
    public void receiveMsg3(String text) {
        System.out.println("<<<<<<============ 收到消息： " + text);
    }
    @JmsListener(destination = "producer4")
    public void receiveMsg4(String text) {
        System.out.println("<<<<<<============ 收到消息： " + text);
    }
    @JmsListener(destination = "producer5")
    public void receiveMsg5(String text) {
        System.out.println("<<<<<<============ 收到消息： " + text);
    }*/
}
