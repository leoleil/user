package com.onps.controller;

import com.onps.model.User;
import com.onps.model.po.PermissionPO;
import com.onps.model.po.RolePO;
import com.onps.model.po.UserPO;
import com.onps.service.AdminManageService;
import com.onps.utils.ConstantString;
import com.onps.utils.resultUtils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminManageService adminManageService;
    @RequestMapping("/createUser")
    @ResponseBody
    public BaseResult<UserPO> insertUser(UserPO userPO){
        BaseResult<UserPO> info = new BaseResult<UserPO>();
        if(userPO == null){
            info.setMessage("传入用户为null");
            info.setStatus(ConstantString.STATUS_FAIL);
            return info;
        }
        try {
            adminManageService.insertUser(userPO);
            info.setMessage("用户创建成功");
            info.setStatus(ConstantString.STATUS_SUCCESS);
            info.setEntity(userPO);
            return info;
        } catch (Exception e) {
            info.setMessage("创建用户失败");
            info.setStatus(ConstantString.STATUS_FAIL);
            return info;
        }
    }
    @RequestMapping("/deleteUser")
    @ResponseBody
    public BaseResult<UserPO> deleteUser(String username){
        BaseResult<UserPO> info = new BaseResult<UserPO>();
        if(username == null){
            info.setMessage("传入用户名为空");
            info.setStatus(ConstantString.STATUS_FAIL);
            return info;
        }
        User user = adminManageService.getUserByUserName(username);
        UserPO userPO = new UserPO();
        userPO.setId(user.getUserId());
        try {
            adminManageService.deleteUser(userPO);
            info.setMessage("删除"+username+"成功");
            info.setStatus(ConstantString.STATUS_SUCCESS);
            info.setEntity(userPO);
            return info;
        } catch (Exception e) {
            info.setMessage("创建用户失败");
            info.setStatus(ConstantString.STATUS_FAIL);
            return info;
        }
    }
    @RequestMapping("/getUserList")
    @ResponseBody
    public BaseResult<UserPO> getUserList(){
        BaseResult<UserPO> info = new BaseResult<UserPO>();
        info.setMessage("用户列表");
        info.setStatus(ConstantString.STATUS_SUCCESS);
        info.setList(adminManageService.getUserList());
        return info;
    }
    @RequestMapping("/updateUser")
    @ResponseBody
    public BaseResult<UserPO> updateUser(UserPO userPO){
        BaseResult<UserPO> info = new BaseResult<UserPO>();
        if(userPO == null){
            info.setMessage("更新用户对象为空");
            info.setStatus(ConstantString.STATUS_FAIL);
            return info;
        }
        try {
            adminManageService.updateUser(userPO);
            info.setMessage("更新用户成功");
            info.setStatus(ConstantString.STATUS_SUCCESS);
            info.setEntity(userPO);
            return info;
        } catch (Exception e) {
            info.setMessage("更新用户失败");
            info.setStatus(ConstantString.STATUS_FAIL);
            return info;
        }

    }
    @RequestMapping("/getPermissionList")
    @ResponseBody
    public BaseResult<PermissionPO> getPermissionList(){
        BaseResult<PermissionPO> info = new BaseResult<PermissionPO>();
        info.setMessage("权限列表");
        info.setStatus(ConstantString.STATUS_SUCCESS);
        info.setList(adminManageService.getPermissionList());
        return info;
    }
    @RequestMapping("/getRoleList")
    @ResponseBody
    public BaseResult<RolePO> getRoleList(){
        BaseResult<RolePO> info = new BaseResult<RolePO>();
        info.setMessage("角色列表");
        info.setStatus(ConstantString.STATUS_SUCCESS);
        info.setList(adminManageService.getRoleList());
        return info;
    }
    @RequestMapping("/saveUserRole")
    @ResponseBody
    public BaseResult<Object> saveUserRole(String userName, String roleName){
        BaseResult<Object> info = new BaseResult<>();
        try {
            adminManageService.saveUserRole(userName, roleName);
            info.setStatus(ConstantString.STATUS_SUCCESS);
            info.setMessage("创建成功");
            return info;
        } catch (Exception e) {
            info.setStatus(ConstantString.STATUS_FAIL);
            info.setMessage("创建失败");
            return info;
        }
    }
    @RequestMapping("/saveRolePermission")
    @ResponseBody
    public BaseResult<Object> saveRolePermission(String roleName, String permissionName){
        BaseResult<Object> info = new BaseResult<>();
        try {
            adminManageService.saveRolePermission(roleName, permissionName);
            info.setMessage("创建成功");
            info.setStatus(ConstantString.STATUS_SUCCESS);
            return info;
        } catch (Exception e) {
            info.setMessage("创建失败");
            info.setStatus(ConstantString.STATUS_FAIL);
            return info;
        }
    }
    @RequestMapping("/removeUserRole")
    @ResponseBody
    public BaseResult<Object> removeUserRole(String userName, String roleName){
        BaseResult<Object> info = new BaseResult<>();
        try {
            adminManageService.removeUserRole(userName,roleName);
            info.setMessage("移除成功");
            info.setStatus(ConstantString.STATUS_SUCCESS);
            return info;
        } catch (Exception e) {
            info.setMessage("移除失败");
            info.setStatus(ConstantString.STATUS_FAIL);
            return info;
        }
    }
    @RequestMapping("/removeRolePermission")
    @ResponseBody
    public BaseResult<Object> removeRolePermission(String roleName, String permissionName){
        BaseResult<Object> info = new BaseResult<>();
        try {
            adminManageService.removeRolePermission(roleName, permissionName);
            info.setMessage("移除成功");
            info.setStatus(ConstantString.STATUS_SUCCESS);
            return info;
        } catch (Exception e) {
            info.setMessage("移除失败");
            info.setStatus(ConstantString.STATUS_FAIL);
            return info;
        }
    }
    @RequestMapping("/getPermissionByUsername")
    @ResponseBody
    public BaseResult<PermissionPO>getPermissionByUsername(String username){
        BaseResult<PermissionPO> info = new BaseResult<>();
        List<PermissionPO> permissionPOList = adminManageService.getPermissionByUsername(username);
        info.setStatus(ConstantString.STATUS_SUCCESS);
        info.setMessage(username+"的权限列表");
        info.setList(permissionPOList);
        return info;
    }
    @RequestMapping("/getRoleByUsername")
    @ResponseBody
    public BaseResult<RolePO> getRoleByUsername(String username){
        BaseResult<RolePO> info = new BaseResult<>();
        List<RolePO> rolePOList = adminManageService.getRoleByUsername(username);
        info.setStatus(ConstantString.STATUS_SUCCESS);
        info.setMessage(username+"的角色列表");
        info.setList(rolePOList);
        return info;
    }
    @RequestMapping("/getPermissionByRolename")
    @ResponseBody
    public BaseResult<PermissionPO> getPermissionByRolename(String rolename){
        BaseResult<PermissionPO> info = new BaseResult<>();
        List<PermissionPO> permissionPOList = adminManageService.getPermissionByRolename(rolename);
        info.setStatus(ConstantString.STATUS_SUCCESS);
        info.setMessage(rolename+"的权限列表");
        info.setList(permissionPOList);
        return info;
    }
}
