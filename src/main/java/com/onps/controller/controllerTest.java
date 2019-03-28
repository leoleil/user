package com.onps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller/")
public class controllerTest{
    @RequestMapping("jump")
    String junp(){
        System.out.println("in");
        return "jump";
    }
}
