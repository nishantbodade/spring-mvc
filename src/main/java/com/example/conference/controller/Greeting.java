package com.example.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class Greeting {
    @GetMapping("greeting")
    public String greeting(Map<String,Object> model){
        model.put("message","Hello Nishant");
        return "greeting";

    }
}
