package com.woomoon.controller;

import com.woomoon.dao.TestDao;
import com.woomoon.entitys.PowerEntity;
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


    //    AOP 日志记录   nginx

    //热加载     自动生成类


    //命名规则：
    //添加： addDept
    //删除： delEntity
    //修改： updEntity
    //查询所有： queryAllEntity
    //查询单个： queryOneEntity

    @RequestMapping("testDao")
    @ResponseBody
    public List<Map<String, Object>> testDao () {
        List<Map<String, Object>> query = dao.query();
        return query;
    }

    @RequestMapping(value = "testButton")
    @ResponseBody
    public PowerEntity testButton() {
        PowerEntity powerEntity = dao.testButton();
        return powerEntity;
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
