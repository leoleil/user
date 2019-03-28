package com.onps.service;

import com.onps.model.vo.TopogyVO;

import java.util.List;

/**
 * 拓扑资源服务接口
 * @author 陈雷雨
 * @since 2019/3/17
 */
public interface TopogyViewService {
    /**
     * 创建Fiber拓扑视图数据
     * @return Fiber拓扑视图数据
     */
    TopogyVO createFiberTopogyVO();

    /**
     * 创建Fiber拓扑视图数据
     * @return Fiber拓扑视图数据
     */
    TopogyVO createWdmTopogyVO();

    /**
     * 创建WDM拓扑视图数据
     * @return WDM拓扑视图数据
     */
    TopogyVO createOtnTopogyVO();

    /**
     * 创建SDH拓扑视图数据
     * @return SDH拓扑视图数据
     */
    TopogyVO createSdhTopogyVO();

    /**
     * 创建整个拓扑视图数据
     * @return 拓扑视图数据链表
     */
    List<TopogyVO> createTopogyVOList();
}
