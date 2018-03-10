package com.woomoon.service.impl;

import com.woomoon.dao.DrugsDao;
import com.woomoon.entitys.DrugsEntity;
import com.woomoon.service.DrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DrugsServiceImpl implements DrugsService{

    @Autowired
    DrugsDao drugsDao;

    @Override
    public List<Map<String, Object>> queryAllDrugs(DrugsEntity drugsEntity, int begin, int end) {
        return drugsDao.queryAllDrugs(drugsEntity,begin,end);
    }

    @Override
    public List<DrugsEntity> queryDrugs() {
        return drugsDao.queryDrugs();
    }

    @Override
    public DrugsEntity queryOneDrugs_ID(Integer drugs_id) {
        return drugsDao.queryOneDrugs_ID(drugs_id);
    }

    @Override
    public int DrugsSum(DrugsEntity drugsEntity) {
        return drugsDao.DrugsSum(drugsEntity);
    }

    @Override
    public void addDrugs(DrugsEntity drugsEntity) {
        drugsDao.addDrugs(drugsEntity);
    }

    @Override
    public void updateDrugs(DrugsEntity drugsEntity) {
        drugsDao.updateDrugs(drugsEntity);
    }

    @Override
    public void deleteDrugs(Integer drugs_id) {
        drugsDao.deleteDrugs(drugs_id);
    }
}
