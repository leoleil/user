package com.onps.model.vo;

import java.util.List;

/**
 * 角色的基本操作
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/05/21
 */
public class RoleVo {
    private String id;
    private String name;

    private List<PermissionVo> permissionVoList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PermissionVo> getPermissionVoList() {
        return permissionVoList;
    }

    public void setPermissionVoList(List<PermissionVo> permissionVoList) {
        this.permissionVoList = permissionVoList;
    }
}
