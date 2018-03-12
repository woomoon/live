package com.woomoon.controller;

import com.woomoon.entitys.DrugsEntity;
import com.woomoon.entitys.Prep_messageEntity;
import com.woomoon.service.DrugsService;
import com.woomoon.service.OutprepService;
import com.woomoon.service.PrepMessageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class Prep_MessageController {

    @Autowired
    PrepMessageService prepMessageService;

    @Autowired
    DrugsService drugsService;

    //测试
    @RequestMapping("prem_hool")
    public String prem_hool(){
        return "demo\\prep_Message";
    }

    //查询所有处方+模糊查询
    @RequestMapping("queryAllPrep_Message")
    @ResponseBody
    public List<Map<String,Object>> queryAllPrep_Message(Prep_messageEntity prep_messageEntity,String drugs_name,String pageIndex,String current_sum){

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
        return prepMessageService.queryAllPrep_Message(prep_messageEntity,drugs_name,begin,end);
    }

    //查询所有药品
    @RequestMapping("queryDrugs")
    @ResponseBody
    public List<DrugsEntity> queryDrugs(){
        return drugsService.queryDrugs();
    }

    //根据ID查询处方
    @RequestMapping("queryOnePrep_Message_ID")
    @ResponseBody
    public Prep_messageEntity queryOnePrep_Message_ID(Integer  prem_id){
        return prepMessageService.queryOnePrep_Message_ID(prem_id);
    }

    //查询处方的总数+模糊查询
    @RequestMapping("Prep_MessageSum")
    @ResponseBody
    public int Prep_MessageSum(Prep_messageEntity prep_messageEntity,String drugs_name,String current_sum){
        int sum=prepMessageService.Prep_MessageSum(prep_messageEntity,drugs_name);
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

    //增加处方
    @RequestMapping("addPrep_Message")
    @ResponseBody
    public void addPrep_Message(Prep_messageEntity prep_messageEntity){
        prepMessageService.addPrep_Message(prep_messageEntity);
    }

    //修改处方
    @RequestMapping("updatePrep_Message")
    @ResponseBody
    public void updatePrep_Message(Prep_messageEntity prep_messageEntity){
        prepMessageService.updatePrep_Message(prep_messageEntity);
    }

    //删除处方
    @RequestMapping("deletePrep_Message")
    @ResponseBody
    public void deletePrep_Message(Integer prem_id){
        prepMessageService.deletePrep_Message(prem_id);
    }
}
