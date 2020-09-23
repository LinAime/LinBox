package com.example.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        return "你好，SpringBoots";
    }
}
