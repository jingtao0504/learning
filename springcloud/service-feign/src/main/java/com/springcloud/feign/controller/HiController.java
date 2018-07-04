package com.springcloud.feign.controller;

import com.springcloud.feign.service.SchedualServicdHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HiController
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/6/4  18:05
 * Version 1.0
 **/
@RestController
public class HiController {
    @Autowired
    SchedualServicdHi schedualServicdHi;
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "name") String name){
        return schedualServicdHi.sayHiFromClientOne(name);
    }
}
