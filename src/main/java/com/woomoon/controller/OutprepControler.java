package com.woomoon.controller;

import com.woomoon.entitys.OutprepEntity;
import com.woomoon.entitys.UserEntity;
import com.woomoon.service.OutprepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class OutprepControler {

    @Autowired
    OutprepService outprepService;

    @RequestMapping("href_Outprep")
    public String href_Outprep(){
        return "demo\\outprep";
    }

    //查询所有退回处方+模糊查询
    @RequestMapping("queryAllOutprep")
    @ResponseBody
    public List<Map<String, Object>> queryAllOutprep(OutprepEntity outprepEntity,String user_name,String pageIndex,String current_sum){

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
        List<Map<String, Object>> lsit=outprepService.queryAllOutprep(outprepEntity,user_name,begin,end);
        System.out.println(lsit.toString());
        return lsit;
    }

    //根据ID查询退回处方
    @RequestMapping("queryOneOutprep_ID")
    @ResponseBody
    public OutprepEntity queryOneOutprep_ID(Integer out_id){
        return outprepService.queryOneOutprep_ID(out_id);
    }

    //查询所有的医师
    @RequestMapping("queryUser")
    @ResponseBody
    public List<UserEntity> queryUser(){
        return outprepService.queryUser();
    }

    //查询退回处方的总数
    @RequestMapping("OutprepSum")
    @ResponseBody
    public int OutprepSum(OutprepEntity outprepEntity,String user_name,String current_sum){
        int sum=outprepService.OutprepSum(outprepEntity,user_name);
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

    //增加退回处方
    @RequestMapping("addOutprep")
    @ResponseBody
    public void addOutprep(OutprepEntity outprepEntity){
       outprepService.addOutprep(outprepEntity);
    }

    //修改退回处方
    @RequestMapping("updateOutprep")
    @ResponseBody
    public void updateOutprep(OutprepEntity outprepEntity){
        outprepService.updateOutprep(outprepEntity);
    }

    //删除退回处方
    @RequestMapping("deleteOutprep")
    @ResponseBody
    public void deleteOutprep(Integer out_id){
        outprepService.deleteOutprep(out_id);
    }
}
