package com.woomoon.dao;

import com.woomoon.entitys.Money_recordEntity;
import com.woomoon.entitys.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface Money_recordDao {

    //查询所有押金记录+模糊查询
    public List<Map<String,Object>> queryAllMoney_record(@Param("mr_entity") Money_recordEntity money_recordEntity, @Param("user_name") String user_name,@Param("pat_name") String pat_name, @Param("begin") int begin, @Param("end") int end);

    //根据ID查询押金记录
    public Money_recordEntity queryOneMoney_record_ID(Integer  record_id);

    //查询押金记录的总数+模糊查询
    public int Money_recordSum(@Param("mr_entity") Money_recordEntity money_recordEntity,@Param("user_name") String user_name,@Param("pat_name") String pat_name);

    //增加押金记录
    public void addMoney_record(Money_recordEntity money_recordEntity);
}
