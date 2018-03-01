package com.woomoon.controller;

import com.woomoon.entitys.PatientEntity;
import com.woomoon.service.PatientService;
import com.woomoon.utils.Generate;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
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
     * 查询所有+模糊查询病人
     */
//    limit #{begin,jdbcType=Integer},#{end,jdbcType=Integer}
    @RequestMapping("queryAllPatient")
    @ResponseBody
    public List<Map<String, Object>> queryAllPatient(@Param("patient") PatientEntity patientEntity, int pageIndex){
        System.out.println(patientEntity);
        System.out.println(pageIndex);


        int begin=1;
        int end=5;
        int index=1;
        if(pageIndex!=0){
           index=pageIndex;
        }
        begin=(index-1)*end;

        int sum=PatientSum(patientEntity);


        List<Map<String, Object>> maps = patientService.queryAllPatient(patientEntity,begin,end);
        System.out.println(maps);
        return maps;
    }

    /**
     * 查询最后一个病人的ID
     */
    @RequestMapping("queryOnePatient")
    @ResponseBody
    public String queryOnePatient(){
        return patientService.queryOnePatient();
    }

    /**
     * 根据ID查询病人
     */
    @RequestMapping("queryOnePatient_ID")
    @ResponseBody
    public PatientEntity queryOnePatient_ID(String pat_num){
       PatientEntity list= patientService.queryOnePatient_ID(pat_num);
        System.out.println(list);
        return list;
    }

    /**
     *查询病人的总数
     */
    @RequestMapping("PatientSum")
    @ResponseBody
    public int PatientSum(PatientEntity patientEntity){
        int sum=patientService.PatientSum(patientEntity);
        System.out.println(sum);
        return sum;
    }

    /**
     * 增加病人
     */
    @RequestMapping("addPatient")
    @ResponseBody
    public void addPatient(PatientEntity patientEntity){
         String id=queryOnePatient();
         String pat_num=Generate.testGenerate(id);
         patientEntity.setPat_num(pat_num);
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
