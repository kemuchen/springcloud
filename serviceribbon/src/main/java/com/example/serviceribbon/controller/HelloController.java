package com.example.serviceribbon.controller;

import com.example.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Desc
 * @Author 柯雷
 * @Date 2021/4/19 9:57
 * @Version 1.0
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hello")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
