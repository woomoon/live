package com.woomoon.controller;

import com.woomoon.entitys.LiveEntity;
import com.woomoon.service.LiveService;
import com.woomoon.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class LiveController {
    @Autowired
    LiveService liveService;

    @Autowired
    PatientService patientService;

    //测试
    @RequestMapping("href_live")
    public String href_live(){
        return "demo\\live";
    }

    //查询所有住院+模糊查询
    @RequestMapping("queryAllLive")
    @ResponseBody
    public List<Map<String,Object>> queryAllLive(LiveEntity liveEntity,String pat_name,String pageIndex,String current_sum){

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
        return liveService.queryAllLive(liveEntity,pat_name,begin,end);
    }

    //根据ID查询住院人是否存在
    @RequestMapping("CountLive_pat")
    @ResponseBody
    public LiveEntity CountLive_pat(String pat_num){
        return liveService.CountLive_pat(pat_num);
    }

    //根据ID查询住院人是否存在
    @RequestMapping("CountLive")
    @ResponseBody
    public int CountLive(String live_num){
        return liveService.CountLive(live_num);
    }


    //查询住院的总数+模糊查询
    @RequestMapping("LiveSum")
    @ResponseBody
    public int LiveSum(LiveEntity liveEntity, String pat_name){
        return liveService.LiveSum(liveEntity,pat_name);
    }

    //增加住院
    @RequestMapping("addLive")
    @ResponseBody
    public void addLive(LiveEntity liveEntity){
        liveService.addLive(liveEntity);
    }

    //修改住院
    @RequestMapping("updateLive")
    @ResponseBody
    public void updateLive(LiveEntity liveEntity){
        liveService.updateLive(liveEntity);
    }
}
