package com.woomoon.controller;

import com.woomoon.dao.PatientDao;
import com.woomoon.entitys.PatientEntity;
import com.woomoon.service.PatientService;
import com.woomoon.utils.Generate;
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

    @Autowired
    PatientDao dao;

    @RequestMapping("href_patient")
    public String href_patient(){
        return "patient";
    }

    //测试查询
    @RequestMapping("testQuery")
    @ResponseBody
    public List<Map<String, Object>> testQuery(String pat_num) {
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setPat_num(pat_num);
        System.out.println(pat_num);
        List<Map<String, Object>> maps = dao.testQuery(patientEntity, 1, 3);
        return maps;
    }




    /**
     * 查询所有+模糊查询病人
     * String pat_num,String pat_name,String pat_birthday,Integer pat_sex,String pat_time,String pat_address,String pat_tel,String pat_occupaction
     *      PatientEntity patientEntity=new PatientEntity();
             patientEntity.setPat_num(pat_num);
             patientEntity.setPat_name(pat_name);
             patientEntity.setPat_birthday(pat_birthday);
             patientEntity.setPat_sex(pat_sex);
             patientEntity.setPat_time(pat_time);
             patientEntity.setPat_address(pat_address);
             patientEntity.setPat_tel(pat_tel);
             patientEntity.setPat_occupaction(pat_occupaction);
     */
//    limit #{begin,jdbcType=Integer},#{end,jdbcType=Integer}
    @RequestMapping("queryAllPatient")
    @ResponseBody
    public List<Map<String, Object>> queryAllPatient(PatientEntity patientEntity,String pageIndex,String current_sum){

        System.out.println(patientEntity);
        System.out.println(pageIndex);
        System.out.println(current_sum);


        int begin=1;
        int end=1;
        int index=1;
        if(current_sum!=null&&current_sum!=""){
            end= Integer.parseInt(current_sum);
        }
        if(pageIndex!=""&&pageIndex!=null){
           index=Integer.parseInt(pageIndex);
        }
        begin=(index-1)*end;

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
     * 查询页数
     */
    @RequestMapping("PatientSum")
    @ResponseBody
    public int PatientSum(PatientEntity patientEntity,String current_sum){

        int sum=patientService.PatientSum(patientEntity);
        int end=1;
        if(current_sum!=null&&current_sum!=""){
            end=Integer.parseInt(current_sum);
        }
        int page_count=sum/end;
        if(sum%end!=0){
            page_count++;
        }
        return page_count;
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
