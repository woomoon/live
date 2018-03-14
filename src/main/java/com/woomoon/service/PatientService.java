package com.woomoon.service;

import com.woomoon.entitys.PatientEntity;

import java.util.List;
import java.util.Map;

public interface PatientService {

    //查询所有+模糊查询病人1
    public List<Map<String,Object>> queryAllPatient(PatientEntity patientEntity,int begin,int end);

    //查询最后一个病人的ID
    public String  queryOnePatient();

    //根据ID查询病人是否存在
    public int CountPatient(String pat_num);
    
    //根据ID查询病人
    public PatientEntity queryOnePatient_ID(String pat_num);

    //查询病人的总数
    public int PatientSum(PatientEntity patientEntity);

    //增加病人
    public void addPatient(PatientEntity patientEntity);

    //修改病人
    public void updatePatient(PatientEntity patientEntity);
}
