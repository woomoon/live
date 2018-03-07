package com.woomoon.controller;

import com.woomoon.entitys.DeptEntity;
import com.woomoon.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class DeptController {

    @Autowired
    DeptService deptService;

    @RequestMapping("deptsele")
    public String deptsele(){
        return "demo\\dept";
    }

    //查询所有科室+模糊查询
    @RequestMapping("queryAllDept")
    @ResponseBody
    public List<Map<String,Object>> queryAllDept(DeptEntity deptEntity,String pageIndex,String current_sum){

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

        return deptService.queryAllDept(deptEntity,begin,end);
    }

    //根据ID查询科室
    @RequestMapping("queryOneDept_ID")
    @ResponseBody
    public DeptEntity queryOneDept_ID(Integer dept_id){
        return deptService.queryOneDept_ID(dept_id);
    }

    //查询科室的总数
    @RequestMapping("DeptSum")
    @ResponseBody
    public int DeptSum(DeptEntity deptEntity,String current_sum){
        int sum=deptService.DeptSum(deptEntity);
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

    //增加科室
    @RequestMapping("addDept")
    @ResponseBody
    public void addDept(DeptEntity deptEntity){
        deptService.addDept(deptEntity);
    }

    //修改科室
    @RequestMapping("updateDept")
    @ResponseBody
    public void updateDept(DeptEntity deptEntity){
        deptService.updateDept(deptEntity);
    }

    //删除科室
    @RequestMapping("deleteDept")
    @ResponseBody
    public void deleteDept(Integer dept_id){
        deptService.deleteDept(dept_id);
    }
}
