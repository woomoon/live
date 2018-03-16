package com.woomoon.controller;

import com.woomoon.entitys.BedpositionEntity;
import com.woomoon.service.BedpositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class BedpositionController {


    @Autowired
    BedpositionService bedpositionService;


    @RequestMapping("href_bedposition")
    public String href_bedposition(){
        return "demo\\bedposition";
    }


    //查询所有
    @RequestMapping("queryAllBedposition")
    @ResponseBody
    public List<Map<String,Object>> queryAllBedposition(BedpositionEntity bedpositionEntity,String pageIndex,String current_sum){

        int begin=1;
        int end=1;
        int index=1;
        if(current_sum!=null && current_sum !=""){
            end=Integer.parseInt(current_sum);
        }
        if(pageIndex!=null && pageIndex!=""){
            index=Integer.parseInt(pageIndex);
        }
        begin=(index-1)*end;
        List<Map<String,Object>> query =bedpositionService.queryAllBedposition(bedpositionEntity,begin,end);
        return query;
    }

     

    //查询单个
    @RequestMapping("queryOneBedposition")
    @ResponseBody
    public Map<String,Object> queryOneBedposition(int bed_id){
        return bedpositionService.queryOneBedposition(bed_id);
    }


    /**
     *查询病人的总数
     * 查询页数
     */
    @RequestMapping("BedpositionSum")
    @ResponseBody
    public int BedpositionSum(BedpositionEntity bedpositionEntity,String current_sum){
        int sum=bedpositionService.BedpositionSum(bedpositionEntity);
        int end=1;
        if(current_sum!=null && current_sum!=""){
            end=Integer.parseInt(current_sum);
        }
        int page_count=sum/end;
        if(sum%end!=0){
            page_count++;
        }
        return page_count;
    }



    //增加
    @RequestMapping("addBedposition")
    @ResponseBody
    public void addBedposition(BedpositionEntity bedpositionEntity){
        bedpositionService.addBedposition(bedpositionEntity);
    }


    //删除
    @RequestMapping("delBedposition")
    @ResponseBody
    public void delBedposition(int bed_id){
        bedpositionService.delBedposition(bed_id);
    }

    //修改
    @RequestMapping("updBedposition")
    @ResponseBody
    public void updBedposition(BedpositionEntity bedpositionEntity){
        bedpositionService.updBedposition(bedpositionEntity);

    }

}
