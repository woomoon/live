package com.woomoon.service;

import com.woomoon.entitys.OutprepEntity;
import com.woomoon.entitys.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OutprepService {
    //查询所有退回处方+模糊查询
    public List<Map<String, Object>> queryAllOutprep(OutprepEntity outprepEntity,String user_name,int begin,int end);

    //根据ID查询退回处方
    public OutprepEntity queryOneOutprep_ID(Integer out_id);

    //查询所有的医师
    public List<UserEntity> queryUser();

    //查询退回处方的总数
    public int OutprepSum(OutprepEntity outprepEntity,String user_name);

    //增加退回处方
    public void addOutprep(OutprepEntity outprepEntity);

    //修改退回处方
    public void updateOutprep(OutprepEntity outprepEntity);

    //删除退回处方
    public void deleteOutprep(Integer out_id);
}
