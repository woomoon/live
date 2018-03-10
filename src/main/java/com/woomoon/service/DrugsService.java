package com.woomoon.service;

import com.woomoon.entitys.DrugsEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DrugsService {
    //查询所有药品+模糊查询
    public List<Map<String,Object>> queryAllDrugs(@Param("d_entity")DrugsEntity drugsEntity, @Param("begin") int begin, @Param("end") int end);

    //查询所有药品
    public List<DrugsEntity> queryDrugs();

    //根据ID查询药品
    public DrugsEntity queryOneDrugs_ID(Integer drugs_id);

    //查询药品的总数
    public int DrugsSum(DrugsEntity drugsEntity);

    //增加药品
    public void addDrugs(DrugsEntity drugsEntity);

    //修改药品
    public void updateDrugs(DrugsEntity drugsEntity);

    //删除药品
    public void deleteDrugs(Integer drugs_id);
}
