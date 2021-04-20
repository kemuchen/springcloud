package com.example.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName SchedualServiceHiHystric
 * @Desc
 * @Author 柯雷
 * @Date 2021/4/20 9:14
 * @Version 1.0
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry, " + name;
    }
}
