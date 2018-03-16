package com.woomoon.dao;

import com.woomoon.entitys.Live_messageEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface LiveMessageDao {

    //查询所有入院+分页
    public List<Map<String,Object>> queryAllLiveMessage(@Param("lm_entity")Live_messageEntity live_messageEntity,@Param("pat_name")String pat_name,@Param("begin") int begin, @Param("end") int end);

    //根据你选择的住院ID查询出病人的性别
    public String querysex(String live_num);

    //查询出入院的总人数+分页
    public int LiveMessageSum(@Param("lm_entity")Live_messageEntity live_messageEntity,@Param("pat_name")String pat_name);

    //增加入院
    public void addLiveMessage(Live_messageEntity live_messageEntity);
}
