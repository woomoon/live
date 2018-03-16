package com.woomoon.service.impl;

import com.woomoon.dao.LiveMessageDao;
import com.woomoon.entitys.Live_messageEntity;
import com.woomoon.service.LiveMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LiveMessageServiceImpl implements LiveMessageService{

    @Autowired
    LiveMessageDao liveMessageDao;

    @Override
    public List<Map<String, Object>> queryAllLiveMessage(Live_messageEntity live_messageEntity, String pat_name, int begin, int end) {
        return liveMessageDao.queryAllLiveMessage(live_messageEntity,pat_name,begin,end);
    }

    @Override
    public String querysex(String live_num) {
        return liveMessageDao.querysex(live_num);
    }

    @Override
    public int LiveMessageSum(Live_messageEntity live_messageEntity, String pat_name) {
        return liveMessageDao.LiveMessageSum(live_messageEntity,pat_name);
    }

    @Override
    public void addLiveMessage(Live_messageEntity live_messageEntity) {
            liveMessageDao.addLiveMessage(live_messageEntity);
    }
}
