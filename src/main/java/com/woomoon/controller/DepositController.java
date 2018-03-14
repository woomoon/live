package com.woomoon.controller;

import com.woomoon.entitys.DepositEntity;
import com.woomoon.entitys.Money_recordEntity;
import com.woomoon.entitys.UserEntity;
import com.woomoon.service.DepositService;
import com.woomoon.service.LiveService;
import com.woomoon.service.MoneyRecordService;
import com.woomoon.service.OutprepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class DepositController {

    @Autowired
    DepositService depositService;

    @Autowired
    LiveService liveService;

    @Autowired
    OutprepService outprepService;

    @Autowired
    MoneyRecordService moneyRecordService;

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

    //根据住院ID查询住院人是否存在
    @RequestMapping("countDeposit")
    @ResponseBody
    public DepositEntity countDeposit(String live_num){
        return depositService.countDeposit(live_num);
    }

    //根据ID查询住院人是否存在
    @RequestMapping("countLive")
    @ResponseBody
    public int CountLive(String live_num){
        return liveService.CountLive(live_num);
    }

    //查询所有用户
    @RequestMapping("queryUserValue")
    @ResponseBody
    public List<UserEntity> queryUser(){
        return outprepService.queryUser();
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

    //增加押金
    @RequestMapping("addDeposit")
    @ResponseBody
    public void addDeposit(DepositEntity depositEntity){
        depositService.addDeposit(depositEntity);
    }

    //增加押金
    @RequestMapping("addMoney_record")
    @ResponseBody
    public void addMoney_record(Money_recordEntity money_recordEntity){
        moneyRecordService.addMoney_record(money_recordEntity);
    }

    //修改押金
    @RequestMapping("updateDeposit")
    @ResponseBody
    public void updateDeposit(DepositEntity depositEntity){
        depositService.updateDeposit(depositEntity);
    }

    //删除押金
    @RequestMapping("deleteDeposit")
    @ResponseBody
    public void deleteDeposit(Integer deposit_id){
        depositService.deleteDeposit(deposit_id);
    }
}
