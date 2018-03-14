package com.woomoon.service;

import com.woomoon.entitys.LiveEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface LiveService {
    //查询所有住院+模糊查询
    public List<Map<String,Object>> queryAllLive( LiveEntity liveEntity, String pat_name, int begin, int end);

    //根据患者ID查询住院人是否存在
    public LiveEntity CountLive_pat(String pat_num);

    //根据ID查询住院人是否存在
    public int CountLive(String live_num);

    //查询住院的总数+模糊查询
    public int LiveSum(LiveEntity liveEntity, String pat_name);

    //增加住院
    public void addLive(LiveEntity liveEntity);

    //修改住院
    public void updateLive(LiveEntity liveEntity);

}
