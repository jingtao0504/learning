package com.springcloud.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName SchedualServicdHi
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/6/4  18:02
 * Version 1.0
 **/
@FeignClient(value="service-hi" ,fallback = SchedualServiceHiHystrix.class)
public interface SchedualServicdHi {
    @RequestMapping(value = "/hi",method =  RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
