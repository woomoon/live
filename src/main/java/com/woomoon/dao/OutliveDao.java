package com.woomoon.dao;

import com.woomoon.entitys.OutliveEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OutliveDao {

    //查询所有出院信息+模糊查询
    public List<Map<String,Object>> queryAllOutlive(@Param("user_name")Integer user_name,@Param("pat_name")String pat_name,@Param("begin") int begin, @Param("end") int end);

    //查询出院信息表的总数+模糊查询
    public int OutliveSum(@Param("user_name")Integer user_name,@Param("pat_name")String pat_name);

    //增加出院信息
    public void addOutlive(OutliveEntity outliveEntity);
}
