package com.jt.springbootweb;

import com.jt.srpingbootserver.api1.example.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@EnableAutoConfiguration
public class StartController {
    @Autowired
    private ExampleService exampleService;
    @Autowired
    private Producer producer;
    @Resource
    private Publisher publish;
    @Value("${ddd}")//获取application.yml文件中名为port的value值,并且自动完成数据类型转换
    private Integer ddd;
    @RequestMapping("/hhh")
    String sayHi(HttpServletRequest request, HttpServletResponse response){
        String name=request.getParameter("name");
        //return name+"你好"+ddd;

        for(int i=0;i<5;i++){
            //publish.publish("publish"+i,"发布完成"+i);
            producer.sendMsg("producer"+i,"生产者"+i);
        }
        return exampleService.getData(name);
    }
}
