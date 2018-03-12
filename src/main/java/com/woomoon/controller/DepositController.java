package com.woomoon.controller;

import com.woomoon.entitys.DepositEntity;
import com.woomoon.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

public class DepositController {

    @Autowired
    DepositService depositService;

    //测试
    @RequestMapping("href_deposit")
    public String href_deposit(){
        return "demo\\deposit";
    }

    //查询所有押金+模糊查询
    @RequestMapping("queryAllDeposit")
    @ResponseBody
    public List<Map<String,Object>> queryAllDeposit(DepositEntity depositEntity, String pat_name,String pageIndex,String current_sum){
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

        return depositService.queryAllDeposit(depositEntity,pat_name,begin,end);
    }

    //根据ID查询押金
    @RequestMapping("queryOneDeposit")
    @ResponseBody
    public DepositEntity queryOneDeposit(Integer  deposit_id){
        return depositService.queryOneDeposit(deposit_id);
    }

    //查询押金的总数+模糊查询
    @RequestMapping("DepositSum")
    @ResponseBody
    public int DepositSum( DepositEntity depositEntity, String pat_name,String current_sum){
        int sum=depositService.DepositSum(depositEntity,pat_name);
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
