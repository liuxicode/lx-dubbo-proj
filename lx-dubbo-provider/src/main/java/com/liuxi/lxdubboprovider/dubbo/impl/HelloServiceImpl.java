package com.liuxi.lxdubboprovider.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.liuxi.liuxidubboapi.dubbo.HelloService;


/**
 * @Auther: liuxi
 * @Date: 2019/3/26 17:01
 * @Description:
 */
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hello:"+name;
    }
}
