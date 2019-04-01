package com.onps.controller.page;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminPageController {
    @RequestMapping("/toAdmin")
    @RequiresRoles(value = "admin")
    public String toAdmin(){
        return "admin/index";
    }

    @RequestMapping("/userManagement")
    @RequiresRoles(value = "admin")
    public String toUserManagement(){
        return "admin/user";
    }

    @RequestMapping("/roleManagement")
    @RequiresRoles(value = "admin")
    public String toRoleMangement(){
        return "admin/role";
    }

    @RequestMapping("/permissionManagement")
    @RequiresRoles(value = "admin")
    public String toPermissionMangement(){
        return "admin/permission";
    }
}
