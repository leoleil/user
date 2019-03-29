package com.onps.controller.page;

import com.onps.model.User;
import com.onps.utils.ConstantString;
import com.onps.utils.resultUtils.BaseResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user/")
public class UserManageController {
    @RequestMapping(value = "toLogin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping(value = "login")
    @ResponseBody
    public BaseResult<User> login(String userName, String password){
        //返回的数据信息
        BaseResult<User> baseResult = new BaseResult<>();

        /**
         * 使用shiro进行认证
         */
        //1.获取Subject
        Subject subject = SecurityUtils.getSubject();
        //2.封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(userName,password);
        //3.执行登录操作
        try{
            subject.login(token);
            baseResult.setMessage("登录成功");
            baseResult.setStatus(ConstantString.STATUS_SUCCESS);
            return baseResult;
        }catch (UnknownAccountException e){
            //登录失败 用户名不存在
            System.err.println("用户名不存在");
            baseResult.setMessage("用户名不存在");
            baseResult.setStatus(ConstantString.STATUS_FAIL);
            return baseResult;
        }catch (IncorrectCredentialsException e){
            //登录失败 密码错误
            System.err.println("密码错误");
            baseResult.setMessage("密码错误");
            baseResult.setStatus(ConstantString.STATUS_FAIL);
            return baseResult;
        }
    }
}
