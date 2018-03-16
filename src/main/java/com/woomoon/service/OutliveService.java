package com.woomoon.service;

import com.woomoon.entitys.OutliveEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OutliveService {
    //查询所有出院信息+模糊查询
    public List<Map<String,Object>> queryAllOutlive(Integer user_name,String pat_name, int begin, int end);

    //查询出院信息表的总数+模糊查询
    public int OutliveSum(Integer user_name,String pat_name);

    //增加出院信息
    public void addOutlive(OutliveEntity outliveEntity);
}
