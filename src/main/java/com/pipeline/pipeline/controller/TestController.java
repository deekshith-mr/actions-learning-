package com.pipeline.pipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        System.out.println("Testing...")
        return "Application is working!";
    }
    @GetMapping("/test2")
    public String test2(){
        return "Application is runnig success fully";
    }
}