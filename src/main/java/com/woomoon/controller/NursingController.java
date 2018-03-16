package com.woomoon.controller;

import com.woomoon.entitys.NursingEntity;
import com.woomoon.service.NursingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class NursingController {

    @Autowired
    NursingService nursingService;

    @RequestMapping("href_nursing")
    public String href_nursing(){
        return "demo\\nursing";
    }

    //查询所有
    @RequestMapping("queryAllNursing")
    @ResponseBody
    public List<Map<String,Object>> queryAllNursing(NursingEntity nursingEntity,String pageIndex,String current_sum){

        int begin=1;
        int end=1;
        int index=1;
        if(current_sum!=null && current_sum!=""){
            end=Integer.parseInt(current_sum);
        }
        if(pageIndex!=null && pageIndex!=""){
            index=Integer.parseInt(pageIndex);
        }
        begin=(index-1)*end;
        List<Map<String,Object>> query=nursingService.queryAllNursing(nursingEntity,begin,end);
        return query;
    }


    //查询单个
    @RequestMapping("queryOneNursing")
    @ResponseBody
    public List<Map<String,Object>> queryOneNursing(int nurse_id){
        List<Map<String,Object>> query=nursingService.queryOneNursing(nurse_id);
        return query;
    }


    /*
    * 查询总数
    * 查询页数
    * */
    @RequestMapping("NursingSum")
    @ResponseBody
    public int NursingSum(NursingEntity nursingEntity,String current_sum){
        int sum=nursingService.NursingSum(nursingEntity);
        int end=1;
        if(current_sum!=null && current_sum!=""){
            end=Integer.parseInt(current_sum);
        }
        int page_count=sum/end;
        if(sum%end!=0){
            page_count++;
        }
        System.out.println("总数"+page_count);
        return page_count;
    }



    //增加
    @RequestMapping("addNursing")
    @ResponseBody
    public void addNursing(NursingEntity nursingEntity){
        nursingService.addNursing(nursingEntity);
    }


    //删除
    @RequestMapping("delNursing")
    @ResponseBody
    public String delNursing(int nurse_id){
        nursingService.delNursing(nurse_id);
        return "delNursing";
    }


    //修改
    @RequestMapping("updNursing")
    @ResponseBody
    public String updNursing(NursingEntity nursingEntity){
        nursingService.updNursing(nursingEntity);
        return "updNursing";
    }


}
