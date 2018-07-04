package com.springcloud.feign.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName SchedualServiceHiHystrix
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/6/5  10:31
 * Version 1.0
 **/
@Component
public class SchedualServiceHiHystrix implements SchedualServicdHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
