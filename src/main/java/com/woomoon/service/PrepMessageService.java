package com.woomoon.service;

import com.woomoon.entitys.Prep_messageEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PrepMessageService {
    public List<Map<String,Object>> queryAllPrep_Message(Prep_messageEntity prep_messageEntity, String drugs_name, int begin, int end);

    //根据ID查询处方
    public Prep_messageEntity queryOnePrep_Message_ID(Integer  prem_id);

    //查询处方的总数+模糊查询
    public int Prep_MessageSum(Prep_messageEntity prep_messageEntity, String drugs_name);

    //增加处方
    public void addPrep_Message(Prep_messageEntity prep_messageEntity);

    //修改处方
    public void updatePrep_Message(Prep_messageEntity prep_messageEntity);

    //删除处方
    public void deletePrep_Message(Integer prem_id);
}
