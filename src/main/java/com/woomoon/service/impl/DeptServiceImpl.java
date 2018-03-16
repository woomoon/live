package com.woomoon.service.impl;

import com.woomoon.dao.DeptDao;
import com.woomoon.entitys.DeptEntity;
import com.woomoon.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    DeptDao deptDao;

    @Override
    public List<Map<String, Object>> queryAllDept(DeptEntity deptEntity, int begin, int end) {
        return deptDao.queryAllDept(deptEntity,begin,end);
    }

    @Override
    public List<Map<String, Object>> queryAllDept_isPatent() {
        return deptDao.queryAllDept_isPatent();
    }

    @Override
    public int queryAllDept_isPatent_ID(Integer dept_id) {
        return deptDao.queryAllDept_isPatent_ID(dept_id);
    }

    @Override
    public DeptEntity queryOneDept_ID(Integer dept_id) {
        return deptDao.queryOneDept_ID(dept_id);
    }

    @Override
    public List<DeptEntity> queryAllSubclass() {
        return deptDao.queryAllSubclass();
    }

    @Override
    public int DeptSum(DeptEntity deptEntity) {
        return deptDao.DeptSum(deptEntity);
    }

    @Override
    public void addDept(DeptEntity deptEntity) {
        deptDao.addDept(deptEntity);
    }

    @Override
    public void updateDept(DeptEntity deptEntity) {
        deptDao.updateDept(deptEntity);
    }

    @Override
    public void deleteDept(Integer dept_id) {
        deptDao.deleteDept(dept_id);
    }
}
