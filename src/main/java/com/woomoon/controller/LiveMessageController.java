package com.woomoon.controller;

import com.woomoon.entitys.Live_messageEntity;
import com.woomoon.service.LiveMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class LiveMessageController {

    @Autowired
    LiveMessageService liveMessageService;

    //测试
    @RequestMapping("href_liveMessage")
    public String href_liveMessage(){
        return "demo\\liveMessage";
    }

    //查询所有入院+分页
    @RequestMapping("queryAllLiveMessage")
    @ResponseBody
    public List<Map<String, Object>> queryAllLiveMessage(Live_messageEntity live_messageEntity, String pat_name, String pageIndex, String current_sum) {

        int begin = 1;
        int end = 1;
        int index = 1;
        if (current_sum != null && current_sum != "") {
            end = Integer.parseInt(current_sum);
        }
        if (pageIndex != "" && pageIndex != null) {
            index = Integer.parseInt(pageIndex);
        }
        begin = (index - 1) * end;

        List<Map<String, Object>> query=liveMessageService.queryAllLiveMessage(live_messageEntity, pat_name, begin, end);
        System.out.println(query);
        return query;
    }

    //根据你选择的住院ID查询出病人的性别
    @RequestMapping("querysex")
    @ResponseBody
    public String querysex(String live_num){
        return liveMessageService.querysex(live_num);
    }

    //查询出入院的总人数+分页
    @RequestMapping("LiveMessageSum")
    @ResponseBody
    public int LiveMessageSum(Live_messageEntity live_messageEntity, String pat_name,String current_sum) {
        int sum=liveMessageService.LiveMessageSum(live_messageEntity,pat_name);
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

    //增加入院
    @RequestMapping("addLiveMessage")
    @ResponseBody
    public void addLiveMessage(Live_messageEntity live_messageEntity){
            liveMessageService.addLiveMessage(live_messageEntity);
    }
}
