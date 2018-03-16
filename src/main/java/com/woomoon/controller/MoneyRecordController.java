package com.woomoon.controller;

import com.woomoon.entitys.Money_recordEntity;
import com.woomoon.entitys.UserEntity;
import com.woomoon.service.MoneyRecordService;
import com.woomoon.service.OutprepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class MoneyRecordController {

    @Autowired
    MoneyRecordService moneyRecordService;

    //测试
    @RequestMapping("href_Money_record")
    public String href_Money_record(){
        return "demo\\money_Record";
    }

    //查询所有押金+模糊查询
    @RequestMapping("queryAllMoney_record")
    @ResponseBody
    public List<Map<String,Object>> queryAllMoney_record(Money_recordEntity money_recordEntity, String user_name,String pat_name,String pageIndex,String current_sum){

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

        return moneyRecordService.queryAllMoney_record(money_recordEntity,user_name,pat_name,begin,end);
    }


    //根据ID查询押金
    @RequestMapping("queryOneMoney_record_ID")
    @ResponseBody
    public Money_recordEntity queryOneMoney_record_ID(Integer  record_id){
        return moneyRecordService.queryOneMoney_record_ID(record_id);
    }

    //查询押金的总数+模糊查询
    @RequestMapping("Money_recordSum")
    @ResponseBody
    public int Money_recordSum( Money_recordEntity money_recordEntity,String user_name,String current_sum,String pat_name){
        int sum=moneyRecordService.Money_recordSum(money_recordEntity,user_name,pat_name);
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

}
