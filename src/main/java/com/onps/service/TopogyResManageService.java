package com.onps.service;

import com.onps.model.entity.*;

public interface TopogyResManageService {
    //增
    boolean addFiberLink(FiberLink fiberLink);
    boolean addWdmLink(WdmLink wdmLink);
    boolean addOtnLink(OtnLink otnLink);
    boolean addSdhLink(SdhLink sdhLink);
    boolean addSWLink(SWLink swLink);
    boolean addSatelliteLink(SatelliteLink satelliteLink);
    boolean addCommondNode(CommonNode commonNode);

    //删
    boolean deleteFiberLink(FiberLink fiberLink);
    boolean deleteWdmLink(WdmLink wdmLink);
    boolean deleteOtnLink(OtnLink otnLink);
    boolean deleteSdhLink(SdhLink sdhLink);
    boolean deleteSWLink(SWLink swLink);
    boolean deleteSatelliteLink(SatelliteLink satelliteLink);
    boolean deleteCommondNode(CommonNode commonNode);

    //改
}
