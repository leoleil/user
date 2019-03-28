package com.onps.base.topogy;

import com.onps.model.Topogy;
import com.onps.model.impl.*;

public class TopogyFactory {
    public final static String FIBER = "Fiber";//fiber
    public final static String WDM = "WDM";//wdm
    public final static String OTN = "OTN";//otn
    public final static String SDH = "SDH";//sdh
    public final static String SW = "SW";//短波
    public final static String SATELLITE = "Satellite";//卫星
    private TopogyFactory(){}//构造器私有化，限制实例化

    /**
     * 创建拓扑资源
     * @param type 传入拓扑类型
     * @return 返回拓扑实例 不支持的拓扑类型返回null
     */
    public final static Topogy create(String type){
        switch (type){
            case FIBER:
                return new FiberTopogy();
            case WDM:
                return new WdmTopogy();
            case OTN:
                return new OtnTopogy();
            case SDH:
                return new SdhTopogy();
            case SW:
                return new SWTopogy();
            case SATELLITE:
                return new SatelliteTopogy();
            default:
                return null;
        }
    }

}
