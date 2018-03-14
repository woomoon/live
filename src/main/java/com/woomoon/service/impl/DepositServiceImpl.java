package com.woomoon.service.impl;

import com.woomoon.dao.DepositDao;
import com.woomoon.entitys.DepositEntity;
import com.woomoon.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DepositServiceImpl implements DepositService{
    @Autowired
    DepositDao depositDao;

    @Override
    public List<Map<String, Object>> queryAllDeposit(DepositEntity depositEntity, String pat_name, int begin, int end) {
        return depositDao.queryAllDeposit(depositEntity,pat_name,begin,end);
    }

    @Override
    public DepositEntity queryOneDeposit(Integer deposit_id) {
        return depositDao.queryOneDeposit(deposit_id);
    }

    @Override
    public DepositEntity countDeposit(String live_num) {
        return depositDao.countDeposit(live_num);
    }

    @Override
    public int DepositSum(DepositEntity depositEntity, String pat_name) {
        return depositDao.DepositSum(depositEntity,pat_name);
    }

    @Override
    public void addDeposit(DepositEntity depositEntity) {
        depositDao.addDeposit(depositEntity);
    }

    @Override
    public void updateDeposit(DepositEntity depositEntity) {
        depositDao.updateDeposit(depositEntity);
    }

    @Override
    public void deleteDeposit(Integer deposit_id) {
        depositDao.deleteDeposit(deposit_id);
    }
}
