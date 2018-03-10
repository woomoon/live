package com.woomoon.service.impl;

import com.woomoon.dao.PrepMessageDao;
import com.woomoon.entitys.Prep_messageEntity;
import com.woomoon.service.PrepMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PrepMessageServiceImpl implements PrepMessageService{

    @Autowired
    PrepMessageDao prepMessageDao;

    @Override
    public List<Map<String, Object>> queryAllPrep_Message(Prep_messageEntity prep_messageEntity, String drugs_name, int begin, int end) {
        return prepMessageDao.queryAllPrep_Message(prep_messageEntity,drugs_name,begin,end);
    }

    @Override
    public Prep_messageEntity queryOnePrep_Message_ID(Integer prem_id) {
        return prepMessageDao.queryOnePrep_Message_ID(prem_id);
    }

    @Override
    public int Prep_MessageSum(Prep_messageEntity prep_messageEntity, String drugs_name) {
        return prepMessageDao.Prep_MessageSum(prep_messageEntity,drugs_name);
    }

    @Override
    public void addPrep_Message(Prep_messageEntity prep_messageEntity) {
         prepMessageDao.addPrep_Message(prep_messageEntity);
    }

    @Override
    public void updatePrep_Message(Prep_messageEntity prep_messageEntity) {
         prepMessageDao.updatePrep_Message(prep_messageEntity);
    }

    @Override
    public void deletePrep_Message(Integer prem_id) {
         prepMessageDao.deletePrep_Message(prem_id);
    }
}
