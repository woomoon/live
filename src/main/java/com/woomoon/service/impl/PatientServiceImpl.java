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
    public List<Map<String, Object>> queryAllPatient(PatientEntity patientEntity) {
        return patientDao.queryAllPatient(patientEntity);
    }

    @Override
    public Map<String, Object> queryOnePatient() {
        return patientDao.queryOnePatient();
    }

    @Override
    public void addPatient(PatientEntity patientEntity) {
        patientDao.addPatient(patientEntity);
    }

    @Override
    public void updatePatient(PatientEntity patientEntity) {
        patientDao.updatePatient(patientEntity);
    }
}
