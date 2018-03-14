package com.woomoon.dao;

import com.woomoon.entitys.PatientEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PatientDao {

    //测试查询+
    public List<Map<String,Object>> testQuery (@Param("p_entity") PatientEntity patientEntity,@Param("begin") int begin,@Param("end") int end);

    //查询所有+模糊查询病人
    public List<Map<String,Object>> queryAllPatient(@Param("p_entity") PatientEntity patientEntity,@Param("begin") int begin,@Param("end") int end);

    //查询最后一个病人的ID
    public String queryOnePatient();

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
