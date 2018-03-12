package com.woomoon.controller;

import com.woomoon.entitys.DrugsEntity;
import com.woomoon.service.DrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class DrugsController {

    @Autowired
    DrugsService drugsService;

    //测试
    @RequestMapping("test")
    private String te(){
        return "demo\\drugs";
    }

    //查询所有药品+模糊查询
    @RequestMapping("queryAllDrugs")
    @ResponseBody
    public List<Map<String,Object>> queryAllDrugs(DrugsEntity drugsEntity,String pageIndex,String current_sum){

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

        return drugsService.queryAllDrugs(drugsEntity,begin,end);
    }

    //根据ID查询药品
    @RequestMapping("queryOneDrugs_ID")
    @ResponseBody
    public DrugsEntity queryOneDrugs_ID(Integer drugs_id){
        return drugsService.queryOneDrugs_ID(drugs_id);
    }

    //查询药品的总数
    @RequestMapping("DrugsSum")
    @ResponseBody
    public int DrugsSum(DrugsEntity drugsEntity,String current_sum){
        int sum=drugsService.DrugsSum(drugsEntity);
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

    //增加药品
    @RequestMapping("addDrugs")
    @ResponseBody
    public void addDrugs(DrugsEntity drugsEntity){
        drugsService.addDrugs(drugsEntity);
    }

    //修改药品
    @RequestMapping("updateDrugs")
    @ResponseBody
    public void updateDrugs(DrugsEntity drugsEntity){
        drugsService.updateDrugs(drugsEntity);
    }

    //删除药品
    @RequestMapping("deleteDrugs")
    @ResponseBody
    public void deleteDrugs(Integer drugs_id){
        drugsService.deleteDrugs(drugs_id);
    }
}
