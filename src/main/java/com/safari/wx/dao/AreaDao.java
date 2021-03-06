package com.safari.wx.dao;

import com.safari.wx.entity.Area;

import java.util.List;

public interface AreaDao {
    /**
     * 查询所有区域
     */
    List<Area> getArea();

    /**
     * 根据id查询区域
     */
    Area getAreaById(int areaId);

    /**
     * 新增区域信息
     */
    int insertArea(Area area);

    /**
     * 修改区域信息
     */
    int updateArea(Area area);

    /**
     * 根据id删除区域
     */
    int deleteArea(int areaId);

}

