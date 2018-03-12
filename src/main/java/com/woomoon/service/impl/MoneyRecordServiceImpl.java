package com.woomoon.service.impl;

import com.woomoon.dao.Money_recordDao;
import com.woomoon.entitys.Money_recordEntity;
import com.woomoon.entitys.UserEntity;
import com.woomoon.service.MoneyRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MoneyRecordServiceImpl implements MoneyRecordService{

    @Autowired
    Money_recordDao money_recordDao;

    @Override
    public List<Map<String, Object>> queryAllMoney_record(Money_recordEntity money_recordEntity, String user_name, int begin, int end) {
        return money_recordDao.queryAllMoney_record(money_recordEntity,user_name,begin,end);
    }

    @Override
    public Money_recordEntity queryOneMoney_record_ID(Integer record_id) {
        return money_recordDao.queryOneMoney_record_ID(record_id);
    }

    @Override
    public int Money_recordSum(Money_recordEntity money_recordEntity, String user_name) {
        return money_recordDao.Money_recordSum(money_recordEntity,user_name);
    }

    @Override
    public void addMoney_record(Money_recordEntity money_recordEntity) {
        money_recordDao.addMoney_record(money_recordEntity);
    }

    @Override
    public void updateMoney_record(Money_recordEntity money_recordEntity) {
        money_recordDao.updateMoney_record(money_recordEntity);
    }

    @Override
    public void deleteMoney_record(Integer record_id) {
        money_recordDao.deleteMoney_record(record_id);
    }
}
