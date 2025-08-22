package com.sai.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping(value = "/greeting")
    public String greeting(Map<String, Object> model){
        model.put("message", "Hello Sai");
        return "greeting";
    }

    @GetMapping(value = "/thyme")
    public String thyme(Map<String, Object> model){
        model.put("message", "Hello Thymeleaf");
        return "thyme";
    }
}