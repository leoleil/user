package com.onps.model;

import com.onps.model.po.NodePO;
import com.onps.model.vo.NodeVO;

/**
 * 节点的抽象基类
 * @author 陈雷雨
 * @since 2019/3/13
 */
public abstract class AbstractNode {
    protected String basicID;//每一个节点都有的UUID
    protected String nodeName;//节点名称
    protected int id;//数据库中的主键
    protected double longitude;//经度
    protected double latitude;//纬度
    protected double bitErrorRate;//比特错误
    protected double usingYears;//使用年限
    protected boolean supportShortWave;//节点是否支持短波通信
    protected boolean supportSatellite;//节点是否支持卫星通信
    protected int projectID;//用于存放工程的ID
    protected String type;//节点类型
    protected String region;//区域
    protected String grade;//等级
    protected String department;//部门

    //权限控制
    protected boolean isNew;//用来标记是否修改过 true为修改过
    protected boolean canGrant;//用来标记是否能更新 true为可以更新
    protected boolean canDelete;//用来标记是否可以删除 true为可以删除
    protected boolean canDisplay;//用来标记是否可见 true为可见

    /**
     * 获取节点视图数据类
     * @return 返回为经过处理过的适合于前台展示的数据结构
     */
    public abstract NodeVO createViewModel();

    /**
     * 创建节点的PO对象
     * @return
     */
    public abstract NodePO createPOModel();
    /**
     * 覆盖equals（）方法
     */
    @Override
    public final boolean equals(Object o){
        //提高性能，相同索引直接判断为相等
        if(this == o){
            return true;
        }
        //类型监测
        if(!(o instanceof AbstractNode)){
            return false;
        }
        //类型转换
        AbstractNode node = (AbstractNode)o;
        //只要是basicID一样的链路就是相等的
        if(node.basicID.equals(this.basicID)){
            return true;
        }
        return false;
    }
    /**
     * 覆盖hashCode（）方法
     * Tips：如果覆盖equals（）方法，必须覆盖hashCode（）方法
     */
    @Override
    public final int hashCode(){
        int result = basicID.hashCode();
        return result;
    }
}
