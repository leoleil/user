package com.onps.controller.page;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    @RequestMapping(value = "/toHome")
    @RequiresRoles(value = "user")
    public String toHome(){
        return "index";
    }

}
