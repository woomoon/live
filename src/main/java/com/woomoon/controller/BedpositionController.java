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
        return "bedposition";
    }


    //查询所有
    @RequestMapping("queryAllbedposition")
    @ResponseBody
    public List<Map<String,Object>> queryAllbedposition(){
        List<Map<String,Object>> query =bedpositionService.queryAllbedposition();
        return query;
    }


    //查询单个
    @RequestMapping("queryOnebedposition")
    @ResponseBody
    public Map<String,Object> queryOnebedposition(int bed_id){
        return bedpositionService.queryOnebedposition(bed_id);
    }


    //增加
    @RequestMapping("addbedposition")
    @ResponseBody
    public void addbedposition(BedpositionEntity bedpositionEntity){
        bedpositionService.addbedposition(bedpositionEntity);
    }


    //删除
    @RequestMapping("delbedposition")
    @ResponseBody
    public void delbedposition(int bed_id){
        bedpositionService.delbedposition(bed_id);
    }

    //修改
    @RequestMapping("updbedposition")
    public String updbedposition(BedpositionEntity bedpositionEntity){
        bedpositionService.updbedposition(bedpositionEntity);
        return "index";
    }

}
