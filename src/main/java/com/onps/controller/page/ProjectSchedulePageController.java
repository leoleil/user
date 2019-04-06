package com.onps.controller.page;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/schedule")
public class ProjectSchedulePageController {
    @RequestMapping(value = "/home")
    @RequiresRoles("user")
    public String toScheduleIndexPage(){
        String returnUrl = "schedule/index";
        return returnUrl;
    }
    @RequestMapping(value = "/view")
    @RequiresRoles("user")
    public String toScheduleViewPage(){
        String returnUrl = "schedule/view";
        return returnUrl;
    }
    @RequestMapping(value = "/form")
    @RequiresRoles("user")
    public String toScheduleFormPage(){
        String returnUrl = "schedule/form";
        return returnUrl;
    }
}
