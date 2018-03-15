package com.woomoon.controller;

import com.woomoon.entitys.OutliveEntity;
import com.woomoon.service.LiveService;
import com.woomoon.service.OutliveService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class OutliveController {
    @Autowired
    OutliveService outliveService;

    @Autowired
    LiveService liveService;

    //测试
    @RequestMapping("href_outlive")
    public String href_outlive(){
        return "demo\\outlive";
    }

    //查询所有出院信息+模糊查询
    @RequestMapping("queryAllOutlive")
    @ResponseBody
    public List<Map<String,Object>> queryAllOutlive(Integer user_name,String pat_name,String pageIndex,String current_sum){
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
        return outliveService.queryAllOutlive(user_name,pat_name,begin,end);
    }

    //查询出院信息表的总数+模糊查询
    @RequestMapping("OutliveSum")
    @ResponseBody
    public int OutliveSum(Integer user_name,String pat_name,String current_sum){
        int sum=outliveService.OutliveSum(user_name,pat_name);
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

    //增加出院信息
    @RequestMapping("addOutlive")
    @ResponseBody
    public void addOutlive(OutliveEntity outliveEntity){
        outliveService.addOutlive(outliveEntity);
    }

    //查询所有的住院ID及患者姓名
    @RequestMapping("queryLive_Patient")
    @ResponseBody
    public List<Map<String,Object>> queryLive_Patient(){
        return liveService.queryLive_Patient();
    }
}
