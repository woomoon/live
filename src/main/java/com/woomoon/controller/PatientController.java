package com.woomoon.controller;

import com.woomoon.entitys.PatientEntity;
import com.woomoon.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class PatientController {

    @Autowired
    PatientService patientService;

    @RequestMapping("href_patient")
    public String href_patient(){
        return "patient";
    }

    /**
     * 查询所有病人
     */
    @RequestMapping("queryAllPatient")
    @ResponseBody
    public List<Map<String,Object>> queryAllPatient(){
        return patientService.queryAllPatient();
    }

    /**
     * 模糊查询病人
     */
    @RequestMapping("queryOnePatient")
    @ResponseBody
    public Map<String,Object> queryOnePatient(){
        return patientService.queryOnePatient();
    }

    /**
     * 增加病人
     */
    @RequestMapping("addPatient")
    @ResponseBody
    public void addPatient(PatientEntity patientEntity){
        patientService.addPatient(patientEntity);
    }

    /**
     * 修改病人
     */
    @RequestMapping("updatePatient")
    @ResponseBody
    public void updatePatient(PatientEntity patientEntity){
        patientService.updatePatient(patientEntity);
    }
}
