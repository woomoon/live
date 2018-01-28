package com.woomoon.service;

import com.woomoon.entitys.PatientEntity;

import java.util.List;
import java.util.Map;

public interface PatientService {

    //查询所有病人
    public List<Map<String,Object>> queryAll_patient();

    //模糊查询病人
    public Map<String,Object> queryOne_patient();

    //增加病人
    public void add_patient(PatientEntity patientEntity);

    //修改病人
    public void update_patient(PatientEntity patientEntity);
}
