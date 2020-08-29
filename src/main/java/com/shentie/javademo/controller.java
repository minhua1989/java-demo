package com.shentie.javademo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: controller
 * @Author huamin
 * @Date: 2020/8/29 16:51
 * @Version 1.0
 */
@RestController
public class controller {
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}