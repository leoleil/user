package com.onps.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/home/")
public class HomePageController {

    @RequestMapping(value = "toHome")
    String toHome(){
        return "index";
    }
}
