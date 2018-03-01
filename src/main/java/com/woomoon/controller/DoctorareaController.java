package com.woomoon.controller;

import com.woomoon.entitys.DoctorareaEntity;
import com.woomoon.dao.DoctorareaDao;
import com.woomoon.service.DoctorareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class DoctorareaController {

    @Autowired
    DoctorareaService doctorareaService;


    @RequestMapping("href_doctorarea")
    public String href_doctorarea(){
        return "doctorarea";
    }

    /**
     * 查询所有病区
     */
    @RequestMapping("queryAllDoctorarea")
    @ResponseBody
    public List<Map<String, Object>> queryAllDoctorarea () {
        List<Map<String, Object>> query = doctorareaService.queryAllDoctorarea();
        return query;
    }

    /*
    * 查询单个病区
    * */
    @RequestMapping("queryOneDoctorarea")
    @ResponseBody
    public Map<String,Object> queryOneDoctorarea(int area_id){
        return doctorareaService.queryOneDoctorarea(area_id);
    }


    /*
    * 增加病区
    * */
    @RequestMapping("addDoctorarea")
    @ResponseBody
    public void addDoctorarea(DoctorareaEntity doctorareaEntity){
        doctorareaService.addDoctorarea(doctorareaEntity);
    }


    /*
    * 删除病区
    * */
    @RequestMapping("delDoctorarea")
    @ResponseBody
    public void delDoctorarea(int area_id){
        doctorareaService.delDoctorarea(area_id);
    }


    /*
    * 修改病区
    * */
    @RequestMapping("updDoctorarea")
    @ResponseBody
    public void updDoctorarea(DoctorareaEntity doctorareaEntity){
        doctorareaService.updDoctorarea(doctorareaEntity);
    }

}
