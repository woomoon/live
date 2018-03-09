package com.woomoon.controller;

import com.woomoon.dao.PowerMapper;
import com.woomoon.entitys.PowerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PublicController {

    @Autowired
    PowerMapper mapper;

    @RequestMapping("href_indexREM")
    public String href_index () {
        return "demo\\indexREM";
    }

    @RequestMapping("href_homePage")
    public String href_homePage () {
        return "demo\\homePage";
    }

    @RequestMapping("pubQueryPower")
    @ResponseBody
    public List<PowerEntity> queryAllPower () {
        List<PowerEntity> powerEntities = mapper.queryAllPower(0);
        return powerEntities;
    }

    @RequestMapping("href_table")
    public String href_table () {
        return "demo\\table";
    }

    @RequestMapping("href_back")
    public String href_back () {
        return "demo\\background";
    }

    @RequestMapping("href_userGrant")
    public String href_userGrant() {
        return "demo\\userGrant";
    }

}
