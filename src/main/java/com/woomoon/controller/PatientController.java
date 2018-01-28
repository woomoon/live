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

    /**
     * 查询所有病人
     */
    @RequestMapping("queryAll_patient")
    @ResponseBody
    public List<Map<String,Object>> queryAll_patient(){
        return patientService.queryAll_patient();
    }

    /**
     * 模糊查询病人
     */
    @RequestMapping("queryOne_patient")
    @ResponseBody
    public Map<String,Object> queryOne_patient(){
        return patientService.queryOne_patient();
    }

    /**
     * 增加病人
     */
    @RequestMapping("add_patient")
    @ResponseBody
    public void add_patient(PatientEntity patientEntity){
        patientService.add_patient(patientEntity);
    }

    /**
     * 修改病人
     */
    @RequestMapping("update_patient")
    @ResponseBody
    public void update_patient(PatientEntity patientEntity){
        patientService.update_patient(patientEntity);
    }
}
