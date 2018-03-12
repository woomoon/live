package com.woomoon.dao;

import com.woomoon.entitys.OutprepEntity;
import com.woomoon.entitys.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OutprepDao {
    //查询所有退回处方+模糊查询
    public List<Map<String, Object>> queryAllOutprep(@Param("o_entity")OutprepEntity outprepEntity,@Param("user_name") String user_name, @Param("begin") int begin, @Param("end") int end);

    //根据ID查询退回处方
    public OutprepEntity queryOneOutprep_ID(Integer out_id);

    //查询所有的医师
    public List<UserEntity> queryUser();

    //查询退回处方的总数
    public int OutprepSum(@Param("o_entity") OutprepEntity outprepEntity,@Param("user_name") String user_name);

    //增加退回处方
    public void addOutprep(OutprepEntity outprepEntity);

    //修改退回处方
    public void updateOutprep(OutprepEntity outprepEntity);

    //删除退回处方
    public void deleteOutprep(Integer out_id);
}
