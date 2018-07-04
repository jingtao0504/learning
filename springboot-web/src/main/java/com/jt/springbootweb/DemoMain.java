package com.jt.springbootweb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


public class DemoMain {
 /*   @Autowired
    private Producer producer;
    @Resource
    private Publisher publish;
    @Test
    public void contextLoads() {
        for (int i = 0; i < 10; i++) {
            producer.sendMsg("test.queue", "Queue Message " + i);
            publish.publish("publish-test","jingtaoTest"+i);
        }
    }*/
 public static void main(String[] args) {
     System.out.println(1000/16);
     System.out.println(1000%16);
 }
}
