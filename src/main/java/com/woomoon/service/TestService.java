package com.woomoon.service;

import com.woomoon.entitys.StuEntity;

import java.util.List;
import java.util.Map;

public interface TestService {

    public List<Map<String,Object>> object ();

    public Map<String,Object> queryOne(int stu_id);

    public void addStu(StuEntity stuEntity);

}
