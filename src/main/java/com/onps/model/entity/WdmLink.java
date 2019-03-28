package com.onps.model.entity;

import com.onps.model.AbstractLink;
import com.onps.model.AbstractNode;
import com.onps.model.po.LinkPO;
import com.onps.model.vo.LinkVO;

import java.util.ArrayList;
import java.util.List;

/**
 * WDM链路
 * @author 陈雷雨
 * @since 2019/3/15
 */
public class WdmLink extends AbstractLink {
    //底层承载的fiber链路路由
    private List<FiberLink> fiberLinkList = new ArrayList<FiberLink>();


    //构建者类
    public static class Builder{
        private String basicID;//后台自定义的主键UUID
        private int id;//数据库中的主键
        private String type;//链路类型
        private String name;//链路名称
        private AbstractNode fromNode;//起节点
        private AbstractNode toNode;//终节点
        private double length;//链路长度
        private String SRLG;//共享风险链路组
        private int remainResource;//剩余的资源数
        private int resources;//配置的资源数
        private int projectID;//存放主键的ID
        private String region;//区域
        private String grade;//等级
        private String department;//部门
        private boolean isNew;//用来标记是否修改过 true为修改过
        private boolean canGrant;//用来标记是否能更新 true为可以更新
        private boolean canDelete;//用来标记是否可以删除 true为可以删除
        private boolean canDisplay;//用来标记是否可见 true为可见
        public Builder (String basicID){
            this.basicID = basicID;
        }
        public Builder type(String val){
            this.type = val;
            return this;
        }
        public Builder name(String val){
            this.name = val;
            return this;
        }
        public Builder fromNode(AbstractNode val){
            this.fromNode = val;
            return this;
        }
        public Builder toNode(AbstractNode val){
            this.toNode = val;
            return this;
        }
        public Builder length(double val){
            this.length = val;
            return this;
        }
        public Builder SRLG(String val){
            this.SRLG = val;
            return this;
        }
        public Builder remainResource(int val){
            this.remainResource = val;
            return this;
        }
        public Builder resource(int val){
            this.resources = val;
            return this;
        }
        public Builder projectID(int val){
            this.projectID = val;
            return this;
        }
        public Builder id(int val){
            this.id = val;
            return this;
        }
        public Builder region(String val){
            this.region = val;
            return this;
        }
        public Builder grade(String val){
            this.grade = val;
            return this;
        }
        public Builder department(String val){
            this.department = val;
            return this;
        }
        public Builder isNew(boolean val){
            this.isNew = val;
            return this;
        }
        public Builder canGrant(boolean val){
            this.canGrant = val;
            return this;
        }
        public Builder canDelete(boolean val){
            this.canDelete = val;
            return this;
        }
        public Builder canDisplay(boolean val){
            this.canDisplay = val;
            return this;
        }
        public WdmLink build(){
            return new WdmLink(this);
        }
    }
    //私有化构造器
    private WdmLink(Builder builder){
        this.basicID = builder.basicID;//后台自定义的主键UUID
        this.id = builder.id;//数据库中的主键
        this.type = builder.type;//链路类型
        this.name = builder.name;//链路名称
        this.fromNode = builder.fromNode;//起节点
        this.toNode = builder.toNode;//终节点
        this.length = builder.length;//链路长度
        this.SRLG = builder.SRLG;//共享风险链路组
        this.remainResource = builder.remainResource;//剩余的资源数
        this.resources = builder.resources;//配置的资源数
        this.projectID = builder.projectID;//存放主键的ID
        this.department = builder.department;//部门
        this.grade = builder.grade;//等级
        this.region = builder.region;//区域
        this.isNew = builder.isNew;//用来标记是否修改过 true为修改过
        this.canDelete = builder.canDelete;//用来标记是否可以删除 true为可以删除
        this.canDisplay = builder.canDisplay;//用来标记是否可见 true为可见
        this.canGrant = builder.canGrant;//用来标记是否能更新 true为可以更新
    }
    /**
     * 获取链路视图数据类
     *
     * @return 返回为经过处理过的适合于前台展示的数据结构
     */
    @Override
    public LinkVO createViewModel() {
        return null;
    }

    /**
     * 获取链路的PO对象
     *
     * @return
     */
    @Override
    public LinkPO createPOModel() {
        return null;
    }

}
