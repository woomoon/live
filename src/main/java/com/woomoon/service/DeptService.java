package com.woomoon.service;

import com.woomoon.entitys.DeptEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DeptService {
    //查询所有科室+模糊查询
    public List<Map<String,Object>> queryAllDept(DeptEntity deptEntity,  int begin, int end);

    //查询所有科室
    public List<Map<String,Object>> queryAllDept_isPatent();

    //查询父类下有没有子类
    public int queryAllDept_isPatent_ID(Integer dept_id);

    //根据ID查询科室
    public DeptEntity queryOneDept_ID(Integer dept_id);

    //查询科室的总数
    public int DeptSum(DeptEntity deptEntity);

    //增加科室
    public void addDept(DeptEntity deptEntity);

    //修改科室
    public void updateDept(DeptEntity deptEntity);

    //删除科室
    public void deleteDept(Integer dept_id);
}
