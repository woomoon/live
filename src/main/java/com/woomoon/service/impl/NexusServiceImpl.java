package com.woomoon.service.impl;

import com.woomoon.dao.NexusDao;
import com.woomoon.entitys.NexusEntity;
import com.woomoon.service.NexusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NexusServiceImpl implements NexusService {

    @Autowired
    NexusDao nexusDao;

    @Override
    public List<Map<String, Object>> queryAllNexus(NexusEntity nexusEntity, int begin, int end) {
        return nexusDao.queryAllNexus(nexusEntity,begin,end);
    }

    @Override
    public NexusEntity queryOneNexus_ID(Integer nexus_id) {
        return nexusDao.queryOneNexus_ID(nexus_id);
    }

    @Override
    public int NexusSum(NexusEntity nexusEntity) {
        return nexusDao.NexusSum(nexusEntity);
    }

    @Override
    public void addNexus(NexusEntity nexusEntity) {
        nexusDao.addNexus(nexusEntity);
    }

    @Override
    public void updateNexus(NexusEntity nexusEntity) {
        nexusDao.updateNexus(nexusEntity);
    }


}
