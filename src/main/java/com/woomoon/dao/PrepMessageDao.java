package com.woomoon.dao;

import com.woomoon.entitys.Prep_messageEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PrepMessageDao {

    //查询所有处方+模糊查询
    public List<Map<String,Object>> queryAllPrep_Message(@Param("pm_entity")Prep_messageEntity prep_messageEntity,@Param("drugs_name") String drugs_name,@Param("begin") int begin,@Param("end") int end);

    //根据ID查询处方
    public Prep_messageEntity queryOnePrep_Message_ID(Integer  prem_id);

    //查询处方的总数+模糊查询
    public int Prep_MessageSum(@Param("pm_entity") Prep_messageEntity prep_messageEntity,@Param("drugs_name") String drugs_name);

    //增加处方
    public void addPrep_Message(Prep_messageEntity prep_messageEntity);

    //修改处方
    public void updatePrep_Message(Prep_messageEntity prep_messageEntity);

    //删除处方
    public void deletePrep_Message(Integer prem_id);
}
