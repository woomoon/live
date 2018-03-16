package com.woomoon.service.impl;

import com.woomoon.dao.OutliveDao;
import com.woomoon.entitys.OutliveEntity;
import com.woomoon.service.OutliveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OutliveServiceImpl implements OutliveService {
    @Autowired
    OutliveDao outliveDao;

    @Override
    public List<Map<String, Object>> queryAllOutlive(Integer user_name,String pat_name, int begin, int end) {
        return outliveDao.queryAllOutlive(user_name,pat_name,begin,end);
    }

    @Override
    public int OutliveSum(Integer user_name,String pat_name) {
        return outliveDao.OutliveSum(user_name,pat_name);
    }

    @Override
    public void addOutlive(OutliveEntity outliveEntity) {
        outliveDao.addOutlive(outliveEntity);
    }
}
