package com.jt.srpingbootserver.example;

import com.jt.srpingbootserver.api1.example.ExampleService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {
    private static final Logger log = LoggerFactory.getLogger(ExampleServiceImpl.class);
    @Override
    @Transactional
    public String getData(String name){
        System.out.println("duboo起作用了");
        log.debug("dubbo成功了");
        return name+"您好您好您好您好您好";
    }
}
