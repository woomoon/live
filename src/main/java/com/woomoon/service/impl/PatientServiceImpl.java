package com.woomoon.service.impl;

import com.woomoon.dao.PatientDao;
import com.woomoon.entitys.PatientEntity;
import com.woomoon.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientDao patientDao;

    @Override
    public List<Map<String, Object>> queryAll_patient() {
        return patientDao.queryAll_patient();
    }

    @Override
    public Map<String, Object> queryOne_patient() {
        return patientDao.queryOne_patient();
    }

    @Override
    public void add_patient(PatientEntity patientEntity) {
        patientDao.add_patient(patientEntity);
    }

    @Override
    public void update_patient(PatientEntity patientEntity) {
        patientDao.update_patient(patientEntity);
    }
}
