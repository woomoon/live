package com.woomoon.controller;

import com.woomoon.dao.PowerMapper;
import com.woomoon.entitys.PowerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PowerController {

    @Autowired
    PowerMapper powerMapper;


    //进入界面
    @RequestMapping(value = "href_power")
    public String href_power() {
        return "powerCRUD";
    }

    //查询数据
    @RequestMapping(value = "queryAllPower")
    @ResponseBody
    public List<PowerEntity> queryAllPower () {
        List<PowerEntity> powerEntities = powerMapper.queryAllPower(3);
        System.out.println(powerEntities);
        return powerEntities;
    }

    //查询单个
    @RequestMapping(value = "queryOnePower")
    @ResponseBody
    public PowerEntity showAndHide (String treeId) {
        if (treeId != null && treeId != "") {
            PowerEntity powerEntity = powerMapper.queryOnePower(treeId);
            System.out.println(powerEntity);
            return powerEntity;
        }
        return null;
    }

    //


}
