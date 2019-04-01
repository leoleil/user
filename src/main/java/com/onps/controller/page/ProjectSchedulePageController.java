package com.onps.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/project/schedule")
public class ProjectSchedulePageController {
    @RequestMapping(value = "/home")
    public String toScheduleIndexPage(){
        String returnUrl = "schedule/index";
        return returnUrl;
    }
    @RequestMapping(value = "/view")
    public String toScheduleViewPage(){
        String returnUrl = "schedule/view";
        return returnUrl;
    }
    @RequestMapping(value = "/new")
    public String toScheduleNewPage(){
        String returnUrl = "schedule/new";
        return returnUrl;
    }
    @RequestMapping(value = "/form")
    public String toScheduleFormPage(){
        String returnUrl = "schedule/form";
        return returnUrl;
    }
}
