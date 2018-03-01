package com.woomoon.service.impl;

import com.woomoon.dao.BedpositionDao;
import com.woomoon.entitys.BedpositionEntity;
import com.woomoon.service.BedpositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BedpositionServiceImpl implements BedpositionService{

    @Autowired
    BedpositionDao bedpositionDao;


    @Override
    public List<Map<String, Object>> queryAllbedposition() {
        return bedpositionDao.queryAllbedposition();
    }

    @Override
    public Map<String, Object> queryOnebedposition(int bed_id) {
        return bedpositionDao.queryOnebedposition(bed_id);
    }

    @Override
    public void addbedposition(BedpositionEntity bedpositionEntity) {
        bedpositionDao.addbedposition(bedpositionEntity);
    }

    @Override
    public void delbedposition(int bed_id) {
        bedpositionDao.delbedposition(bed_id);
    }

    @Override
    public void updbedposition(BedpositionEntity bedpositionEntity){
        bedpositionDao.updbedposition(bedpositionEntity);
    }

}
