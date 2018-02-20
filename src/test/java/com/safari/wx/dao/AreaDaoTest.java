package com.safari.wx.dao;

import com.safari.wx.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryArea() throws Exception {
        List<Area> list = areaDao.queryArea();
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getAreaId()+list.get(i).getAreaName()+list.get(i).getPriority());
        }
        assertEquals(2,list.size());
    }

    @Test
    public void queryAreaById() {
    }

    @Test
    public void insertArea() {
    }

    @Test
    public void updateArea() {
    }

    @Test
    public void deleteArea() {
    }
}