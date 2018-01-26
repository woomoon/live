package com.woomoon.controller;

import com.woomoon.dao.TestDao;
import com.woomoon.entitys.StuEntity;
import com.woomoon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    @Autowired
    TestService service;

    @Autowired
    TestDao dao;

    //hzf


    //success

    @RequestMapping("testDao")
    public void testDao () {
        System.out.println(dao.query());
    }

    @RequestMapping("queryForList")
    @ResponseBody
    public List<Map<String,Object>> queryObject(){
        return  service.object();
    }

    @RequestMapping("queryForOne")
    @ResponseBody
    public Map<String,Object> queryOne (){
        return service.queryOne(2);
    }

    @RequestMapping("addStu")
    public String addStu () {
        StuEntity stu = new StuEntity();
        stu.setStu_name("罗伊人3");
        stu.setStu_sex("2");
        service.addStu(stu);
        return "index";
    }

    @RequestMapping("href_user")
    public String href_user () {
        return "user";
    }


}
