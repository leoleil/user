package com.onps.controller.page;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    @RequestMapping(value = "/toHome")
    @RequiresPermissions(value = {"test"})
    String toHome(){
        return "index";
    }

    @RequestMapping(value = "/admin/toAdmin")
    @RequiresPermissions(value = {"test"})
    String toAdmin(){
        return "admin/index";
    }
}
