package com.woomoon.service;

import com.woomoon.entitys.Money_recordEntity;
import com.woomoon.entitys.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MoneyRecordService {
    //查询所有押金+模糊查询
    public List<Map<String,Object>> queryAllMoney_record( Money_recordEntity money_recordEntity, String user_name,String pat_name, int begin,  int end);

    //根据ID查询押金
    public Money_recordEntity queryOneMoney_record_ID(Integer  record_id);

    //查询押金的总数+模糊查询
    public int Money_recordSum( Money_recordEntity money_recordEntity,String user_name,String pat_name);

    //增加押金
    public void addMoney_record(Money_recordEntity money_recordEntity);
}
