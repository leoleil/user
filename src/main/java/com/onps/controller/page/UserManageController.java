package com.onps.controller.page;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user/")
public class UserManageController {
    @RequestMapping(value = "toLogin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping(value = "login")
    public String login(String name, String password, Model model){
        /**
         * 使用shiro进行认证
         */
        //1.获取Subject
        Subject subject = SecurityUtils.getSubject();
        //2.封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(name,password);
        //3.执行登录操作
        try{
            subject.login(token);
            return "/user/index";
        }catch (UnknownAccountException e){
            //登录失败 用户名不存在
            return "login";
        }catch (IncorrectCredentialsException e){
            //登录失败 密码错误
            return "login";
        }

    }
}
