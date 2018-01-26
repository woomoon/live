package com.woomoon.dao;

import com.woomoon.entitys.StuEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TestDao {

    public List<Map<String,Object>> query();

    public Map<String,Object> queryOne(int stu_id);

    public void addStu(StuEntity stuEntity);

    public void updateStu(StuEntity stuEntity);


}
