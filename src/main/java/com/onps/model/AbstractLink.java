package com.onps.model;

import com.onps.model.po.LinkPO;
import com.onps.model.vo.LinkVO;

/**
 * 链路的抽象基类
 * @author 陈雷雨
 * @since 2019/3/13
 */
public abstract class AbstractLink {
    protected String basicID;//后台自定义的主键UUID
    protected int id;//数据库中的主键
    protected String type;//链路类型
    protected String name;//链路名称
    protected AbstractNode fromNode;//起节点
    protected AbstractNode toNode;//终节点
    protected double length;//链路长度
    protected String SRLG;//共享风险链路组
    protected int remainResource;//剩余的资源数
    protected int resources;//配置的资源数
    protected int projectID;//存放主键的ID
    protected String region;//区域
    protected String grade;//等级
    protected String department;//部门

    //权限控制
    protected boolean isNew;//用来标记是否修改过 true为修改过
    protected boolean canGrant;//用来标记是否能更新 true为可以更新
    protected boolean canDelete;//用来标记是否可以删除 true为可以删除
    protected boolean canDisplay;//用来标记是否可见 true为可见

    /**
     * 获取链路视图数据类,这里使用的是抽象的工厂模式
     * @return 返回为经过处理过的适合于前台展示的数据结构
     */
    public abstract LinkVO createViewModel();

    /**
     * 获取链路的PO对象
     * @return
     */
    public abstract LinkPO createPOModel();
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
        if(!(o instanceof AbstractLink)){
            return false;
        }
        //类型转换
        AbstractLink link = (AbstractLink)o;
        //只要是basicID一样的链路就是相等的
        if(link.basicID.equals(this.basicID)){
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
