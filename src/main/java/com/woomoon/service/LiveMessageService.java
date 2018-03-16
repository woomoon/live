package com.woomoon.service;

import com.woomoon.entitys.Live_messageEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface LiveMessageService {
    //查询所有入院+分页
    public List<Map<String,Object>> queryAllLiveMessage(Live_messageEntity live_messageEntity,String pat_name,int begin, int end);

    //根据你选择的住院ID查询出病人的性别
    public String querysex(String live_num);

    //查询出入院的总人数+分页
    public int LiveMessageSum(Live_messageEntity live_messageEntity,String pat_name);

    //增加入院
    public void addLiveMessage(Live_messageEntity live_messageEntity);
}
