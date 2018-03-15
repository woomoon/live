package com.woomoon.service.impl;

import com.woomoon.dao.LiveDao;
import com.woomoon.entitys.LiveEntity;
import com.woomoon.service.LiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

@Controller
public class LiveServiceImpl implements LiveService {
    @Autowired
    LiveDao liveDao;

    @Override
    public List<Map<String, Object>> queryAllLive(LiveEntity liveEntity, String pat_name, int begin, int end) {
        return liveDao.queryAllLive(liveEntity,pat_name,begin,end);
    }

    @Override
    public List<Map<String, Object>> queryLive_Patient() {
        return liveDao.queryLive_Patient();
    }

    @Override
    public String queryOneLive() {
        return liveDao.queryOneLive();
    }

    @Override
    public LiveEntity CountLive_pat(String pat_num) {
        return liveDao.CountLive_pat(pat_num);
    }

    @Override
    public int CountLive(String live_num) {
        return liveDao.CountLive(live_num);
    }

    @Override
    public int LiveSum(LiveEntity liveEntity, String pat_name) {
        return liveDao.LiveSum(liveEntity,pat_name);
    }

    @Override
    public void addLive(LiveEntity liveEntity) {
        liveDao.addLive(liveEntity);
    }

    @Override
    public void updateLive(LiveEntity liveEntity) {
        liveDao.updateLive(liveEntity);
    }
}
