package com.safari.wx.service.impl;

import com.safari.wx.dao.AreaDao;
import com.safari.wx.entity.Area;
import com.safari.wx.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AreaServiceImlp implements AreaService {

    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> getArea() {
        return areaDao.getArea();
    }

    @Override
    public Area getAreaById(int areaId) {
        return areaDao.getAreaById(areaId);
    }

    @Override
    @Transactional
    public boolean insertArea(Area area) {
        if (area.getAreaName()!=null&&"".equals(area.getAreaName())){
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try {
                int effectedNum = areaDao.insertArea(area);
                if (effectedNum>0){
                    return true;
                }else{
                    throw new RuntimeException("插入区域信息失败");
                }
            }catch (Exception e){
                throw new RuntimeException("插入区域信息失败"+e.getMessage());
            }
        } else{
            throw new RuntimeException("区域信息不能为空");
        }

    }

    @Override
    @Transactional
    public boolean updateArea(Area area) {
        if (area.getAreaId()!=null&&area.getAreaId()>0){

            area.setLastEditTime(new Date());
            try {
                int effectedNum = areaDao.updateArea(area);
                if (effectedNum>0){
                    return true;
                }else{
                    throw new RuntimeException("更新区域信息失败");
                }
            }catch (Exception e){
                throw new RuntimeException("更新区域信息失败"+e.getMessage());
            }
        } else{
            throw new RuntimeException("区域信息不能为空");
        }
    }

    @Override
    public boolean deleteArea(int areaId) {
        if (areaId>0){
            try {
                int effectedNum = areaDao.deleteArea(areaId);
                if (effectedNum>0){
                    return true;
                }else{
                    throw new RuntimeException("删除区域信息失败");
                }
            }catch (Exception e){
                throw new RuntimeException("删除区域信息失败"+e.getMessage());
            }
        } else{
            throw new RuntimeException("区域ID不能为空");
        }
    }
}
