package com.onps.model.entity;

import com.onps.model.AbstractNode;
import com.onps.model.po.NodePO;
import com.onps.model.vo.NodeVO;

/**
 * 基本的节点类型
 * @author 陈雷雨
 * @since 2019/3/13
 */
public class CommonNode extends AbstractNode {

    //构建者
    public static class Builder {
        private String basicID;//每一个节点都有的UUID
        private String nodeName;//节点名称
        private int id;//数据库中的主键
        private double longitude;//经度
        private double latitude;//纬度
        private double bitErrorRate;//比特错误
        private double usingYears;//使用年限
        private boolean supportShortWave;//节点是否支持短波通信
        private boolean supportSatellite;//节点是否支持卫星通信
        private int projectID;//用于存放工程的ID
        private String type;//节点的类型
        private String region;//区域
        private String grade;//等级
        private String department;//部门
        private boolean isNew;//用来标记是否修改过 true为修改过
        private boolean canGrant;//用来标记是否能更新 true为可以更新
        private boolean canDelete;//用来标记是否可以删除 true为可以删除
        private boolean canDisplay;//用来标记是否可见 true为可见
        public Builder(String basicID){
            this.basicID = basicID;
        }
        public Builder nodeName(String val){
            this.nodeName = val;
            return this;
        }
        public Builder id(int val){
            this.id = val;
            return this;
        }
        public Builder longitude(double val){
            this.longitude = val;
            return this;
        }
        public Builder latitude(double val){
            this.latitude = val;
            return this;
        }
        public Builder bitErrorRate(double val){
            this.bitErrorRate = val;
            return this;
        }
        public Builder usingYears(int val){
            this.usingYears = val;
            return this;
        }
        public Builder supportShortWave(boolean val){
            this.supportShortWave = val;
            return this;
        }
        public Builder supportSatellite(boolean val){
            this.supportSatellite = val;
            return this;
        }
        public Builder projectID(int val){
            this.projectID = val;
            return this;
        }
        public Builder type(String val){
            this.type = val;
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
        public CommonNode build(){
            return new CommonNode(this);
        }
    }
    private CommonNode(Builder builder){
        this.basicID = builder.basicID;//每一个节点都有的UUID
        this.nodeName = builder.nodeName;//节点名称
        this.id = builder.id;//数据库中的主键
        this.longitude = builder.longitude;//经度
        this.latitude = builder.latitude;//纬度
        this.bitErrorRate = builder.bitErrorRate;//比特错误
        this.usingYears = builder.usingYears;//使用年限
        this.supportShortWave = builder.supportShortWave;//节点是否支持短波通信
        this.supportSatellite = builder.supportSatellite;//节点是否支持卫星通信
        this.projectID = builder.projectID;//用于存放工程的ID
        this.type = builder.type;//节点类型
        this.department = builder.department;//部门
        this.grade = builder.grade;//等级
        this.region = builder.region;//区域
        this.isNew = builder.isNew;//用来标记是否修改过 true为修改过
        this.canDelete = builder.canDelete;//用来标记是否可以删除 true为可以删除
        this.canDisplay = builder.canDisplay;//用来标记是否可见 true为可见
        this.canGrant = builder.canGrant;//用来标记是否能更新 true为可以更新
    }

    /**
     * 获取节点视图数据类
     *
     * @return 返回为经过处理过的适合于前台展示的数据结构
     */
    @Override
    public NodeVO createViewModel() {
        return null;
    }

    /**
     * 创建节点的PO对象
     *
     * @return
     */
    @Override
    public NodePO createPOModel() {
        return null;
    }
}
