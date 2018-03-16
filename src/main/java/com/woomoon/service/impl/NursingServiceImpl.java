package com.woomoon.service.impl;

import com.woomoon.dao.NursingDao;
import com.woomoon.entitys.NursingEntity;
import com.woomoon.service.NursingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NursingServiceImpl implements NursingService{

    @Autowired
    NursingDao nursingDao;

    @Override
    public List<Map<String,Object>> queryAllNursing(NursingEntity nursingEntity,int begin,int end){
        return nursingDao.queryAllNursing(nursingEntity,begin,end);
    }

    @Override
    public List<Map<String, Object>> queryOneNursing(int nurse_id) {
        return nursingDao.queryOneNursing(nurse_id);
    }

    @Override
    public List<NursingEntity> queryAllNursingB() {
        return nursingDao.queryAllNursingB();
    }

    @Override
    public int NursingSum(NursingEntity nursingEntity) {
        return nursingDao.NursingSum(nursingEntity);
    }


    @Override
    public void addNursing(NursingEntity nursingEntity) {
        nursingDao.addNursing(nursingEntity);
    }

    @Override
    public void delNursing(int nurse_id) {
        nursingDao.delNursing(nurse_id);
    }

    @Override
    public void updNursing(NursingEntity nursingEntity) {
        nursingDao.updNursing(nursingEntity);
    }


}
