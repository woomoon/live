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
    public List<Map<String, Object>> queryAllBedposition(BedpositionEntity bedpositionEntity,int begin,int end) {
        return bedpositionDao.queryAllBedposition(bedpositionEntity,begin,end);
    }

    @Override
    public Map<String, Object> queryOneBedposition(int bed_id) {
        return bedpositionDao.queryOneBedposition(bed_id);
    }

    @Override
    public int BedpositionSum(BedpositionEntity bedpositionEntity) {
        return bedpositionDao.BedpositionSum(bedpositionEntity);
    }

    @Override
    public void addBedposition(BedpositionEntity bedpositionEntity) {
        bedpositionDao.addBedposition(bedpositionEntity);
    }

    @Override
    public void delBedposition(int bed_id) {
        bedpositionDao.delBedposition(bed_id);
    }

    @Override
    public void updBedposition(BedpositionEntity bedpositionEntity){
        bedpositionDao.updBedposition(bedpositionEntity);
    }

}
