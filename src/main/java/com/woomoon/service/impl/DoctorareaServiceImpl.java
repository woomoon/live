package com.woomoon.service.impl;

import com.woomoon.entitys.DoctorareaEntity;
import com.woomoon.dao.DoctorareaDao;
import com.woomoon.service.DoctorareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DoctorareaServiceImpl implements DoctorareaService{

    @Autowired
    DoctorareaDao doctorareaDao;


    @Override
    public List<Map<String, Object>> queryAllDoctorarea() {
        return doctorareaDao.queryAllDoctorarea();
    }

    @Override
    public Map<String, Object> queryOneDoctorarea(int area_id) {
        return doctorareaDao.queryOneDoctorarea(area_id);
    }

    @Override
    public void addDoctorarea(DoctorareaEntity doctorareaEntity) {
        doctorareaDao.addDoctorarea(doctorareaEntity);
    }

    @Override
    public void delDoctorarea(int area_id) {
        doctorareaDao.delDoctorarea(area_id);
    }

    @Override
    public void updDoctorarea(DoctorareaEntity doctorareaEntity) {
        doctorareaDao.updDoctorarea(doctorareaEntity);
    }
}
