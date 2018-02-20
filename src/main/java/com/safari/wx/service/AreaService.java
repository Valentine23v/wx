package com.safari.wx.service;

import com.safari.wx.entity.Area;

import java.util.List;

public interface AreaService {
    /**
     * 查询所有区域
     * @return
     */
    List<Area> getArea();

    /**
     * 根据id查询区域
     * @param areaId
     * @return
     */
    Area getAreaById(int areaId);

    /**
     * 新增区域信息
     * @param area
     * @return
     */
    boolean insertArea(Area area);

    /**
     * 修改区域信息
     * @param area
     * @return
     */
    boolean updateArea(Area area);

    /**
     * 根据id删除区域
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);

}
