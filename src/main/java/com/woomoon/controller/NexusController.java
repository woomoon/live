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

    /**
     * 查询所有社会关系
     */
    @RequestMapping("queryAllNexus")
    @ResponseBody
    public List<Map<String,Object>> queryAllNexus(NexusEntity nexusEntity){
        System.out.println(nexusEntity);

        List<Map<String, Object>> maps = nexusService.queryAllNexus(nexusEntity);
        System.out.println(maps);
        return maps;
    }

    /**
     * 模糊查询社会关系
     */
    @RequestMapping("queryOneNexus")
    @ResponseBody
    public Map<String,Object> queryOneNexus(){
        return nexusService.queryOneNexus();
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

    /**
     * 删除社会关系
     */
    @RequestMapping("deleteNexus")
    @ResponseBody
    public void deleteNexus(int nexus_id){
        nexusService.deleteNexus(nexus_id);
    }
}
