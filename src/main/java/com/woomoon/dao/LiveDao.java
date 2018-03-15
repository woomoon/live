package com.woomoon.dao;

import com.woomoon.entitys.DepositEntity;
import com.woomoon.entitys.LiveEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface LiveDao {
    //查询所有住院+模糊查询
    public List<Map<String,Object>> queryAllLive(@Param("l_entity") LiveEntity liveEntity, @Param("pat_name") String pat_name, @Param("begin") int begin, @Param("end") int end);

    //查询最后一个病人的ID
    public String queryOneLive();

    //查询所有的住院ID及患者姓名
    public List<Map<String,Object>> queryLive_Patient();

    //根据ID查询住院人是否存在
    public int CountLive(String live_num);

    //根据患者ID查询住院人是否存在
    public LiveEntity CountLive_pat(String pat_num);

    //查询住院的总数+模糊查询
    public int LiveSum(@Param("l_entity") LiveEntity liveEntity,@Param("pat_name") String pat_name);

    //增加住院
    public void addLive(LiveEntity liveEntity);

    //修改住院
    public void updateLive(LiveEntity liveEntity);

}
