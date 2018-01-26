package com.woomoon.service.impl;

import com.woomoon.dao.TestDao;
import com.woomoon.entitys.StuEntity;
import com.woomoon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    public List<Map<String,Object>> object () {
        return testDao.query();
    }


    public Map<String,Object> queryOne(int stu_id){
        return testDao.queryOne(stu_id);
    }


    public void addStu(StuEntity stuEntity) {
        testDao.addStu(stuEntity);
    }


}
