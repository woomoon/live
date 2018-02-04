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
    public List<Map<String, Object>> queryAllNexus(NexusEntity nexusEntity) {
        return nexusDao.queryAllNexus(nexusEntity);
    }

    @Override
    public Map<String, Object> queryOneNexus() {
        return nexusDao.queryOneNexus();
    }

    @Override
    public void addNexus(NexusEntity nexusEntity) {
        nexusDao.addNexus(nexusEntity);
    }

    @Override
    public void updateNexus(NexusEntity nexusEntity) {
        nexusDao.updateNexus(nexusEntity);
    }

    @Override
    public void deleteNexus(int nexus_id) {
        nexusDao.deleteNexus(nexus_id);
    }
}
