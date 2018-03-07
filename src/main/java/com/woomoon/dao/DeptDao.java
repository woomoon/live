package com.woomoon.dao;

import com.woomoon.entitys.DeptEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DeptDao {
    //查询所有科室+模糊查询
    public List<Map<String,Object>> queryAllDept(@Param("d_entity") DeptEntity deptEntity, @Param("begin") int begin, @Param("end") int end);

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
