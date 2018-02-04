package com.woomoon.service;

import com.woomoon.entitys.PatientEntity;

import java.util.List;
import java.util.Map;

public interface PatientService {

    //查询所有病人
    public List<Map<String,Object>> queryAllPatient(PatientEntity patientEntity);

    //模糊查询病人
    public Map<String,Object> queryOnePatient();

    //增加病人
    public void addPatient(PatientEntity patientEntity);

    //修改病人
    public void updatePatient(PatientEntity patientEntity);
}
