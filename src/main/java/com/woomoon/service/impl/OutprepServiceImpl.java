package com.woomoon.service.impl;

import com.woomoon.dao.OutprepDao;
import com.woomoon.entitys.DrugsEntity;
import com.woomoon.entitys.OutprepEntity;
import com.woomoon.entitys.UserEntity;
import com.woomoon.service.OutprepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OutprepServiceImpl implements OutprepService{

    @Autowired
    OutprepDao outprepDao;


    @Override
    public List<Map<String, Object>> queryAllOutprep(OutprepEntity outprepEntity,String user_name, int begin, int end) {
        return outprepDao.queryAllOutprep(outprepEntity,user_name,begin,end);
    }

    @Override
    public OutprepEntity queryOneOutprep_ID(Integer out_id) {
        return outprepDao.queryOneOutprep_ID(out_id);
    }


    @Override
    public List<UserEntity> queryUser() {
        return outprepDao.queryUser();
    }

    @Override
    public int OutprepSum(OutprepEntity outprepEntity,String user_name) {
        return outprepDao.OutprepSum(outprepEntity,user_name);
    }

    @Override
    public void addOutprep(OutprepEntity outprepEntity) {
        outprepDao.addOutprep(outprepEntity);
    }

    @Override
    public void updateOutprep(OutprepEntity outprepEntity) {
        outprepDao.updateOutprep(outprepEntity);
    }

    @Override
    public void deleteOutprep(Integer out_id) {
        outprepDao.deleteOutprep(out_id);
    }
}
