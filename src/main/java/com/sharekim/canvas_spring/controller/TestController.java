package com.sharekim.canvas_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @GetMapping("/api/hello")
    public String hello(){
        return "변경함! 현재 서버시간은"+new Date()+"입니다\n";
    }

}
