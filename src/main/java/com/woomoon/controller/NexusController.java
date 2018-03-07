package com.woomoon.controller;

import com.woomoon.entitys.NexusEntity;
import com.woomoon.entitys.PatientEntity;
import com.woomoon.service.NexusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class NexusController {

    @Autowired
    NexusService nexusService;

    @RequestMapping("hool")
    private String hool(){
        return "demo\\nexus";
    }

    /**
     * 查询所有社会关系
     */
    @RequestMapping("queryAllNexus")
    @ResponseBody
    public List<Map<String,Object>> queryAllNexus(NexusEntity nexusEntity,String pageIndex,String current_sum){
        System.out.println(nexusEntity);

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

        List<Map<String, Object>> maps = nexusService.queryAllNexus(nexusEntity,begin,end);
        System.out.println(maps);
        return maps;
    }

    /**
     * 根据ID查询社会关系
     */
    @RequestMapping("queryOneNexus_ID")
    @ResponseBody
    public NexusEntity queryOneNexus_ID(String nexus_id){
        return nexusService.queryOneNexus_ID(Integer.parseInt(nexus_id));
    }

    /**
     *查询病人的总数
     * 查询页数
     */
    @RequestMapping("NexusSum")
    @ResponseBody
    public int NexusSum(NexusEntity nexusEntity,String current_sum){

        int sum=nexusService.NexusSum(nexusEntity);
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

    /**
     * 增加社会关系
     */
    @RequestMapping("addNexus")
    @ResponseBody
    public void addPatient(NexusEntity nexusEntity){
        nexusService.addNexus(nexusEntity);
    }

    /**
     * 修改社会关系
     */
    @RequestMapping("updateNexus")
    @ResponseBody
    public void updateNexus(NexusEntity nexusEntity){
        nexusService.updateNexus(nexusEntity);
    }

}
