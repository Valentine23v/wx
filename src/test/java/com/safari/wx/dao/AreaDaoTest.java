package com.safari.wx.dao;

import com.safari.wx.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void getArea() throws Exception {
        List<Area> list = areaDao.getArea();
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getAreaId()+list.get(i).getAreaName()+list.get(i).getPriority());
        }
        assertEquals(2,list.size());
    }

    @Test
    public void getAreaById() {
        Area area = areaDao.getAreaById(1);
        System.out.println(area.getAreaName());
        assertEquals("东苑",area.getAreaName());
    }

    @Test
    @Ignore
    public void insertArea() {
        Area area = new Area();
        area.setAreaId(3);
        area.setAreaName("南苑");
        area.setPriority(1);
        int effectedNum = areaDao.insertArea(area);//影响行数
        assertEquals(1,effectedNum);//插入一行影响行数为1
    }

    @Test
    @Ignore
    public void updateArea() {
        Area area = new Area();
        area.setAreaId(3);
        area.setAreaName("西苑");
        area.setLastEditTime(new Date());
        int effectedNum = areaDao.updateArea(area);//影响行数
        assertEquals(1,effectedNum);//插入一行影响行数为1
    }

    @Test
    @Ignore
    public void deleteArea() {
        int effectedNum = areaDao.deleteArea(3);//影响行数
        assertEquals(1,effectedNum);//插入一行影响行数为1
    }
}