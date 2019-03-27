package com.liuxi.lxdubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liuxi.liuxidubboapi.dubbo.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: liuxi
 * @Date: 2019/3/26 17:29
 * @Description:
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Reference(version = "1.0.0")
    private HelloService helloService;

    @RequestMapping("/say")
    public String sayHello(@RequestParam("name") String name){

        return helloService.hello(name);
    }
}
