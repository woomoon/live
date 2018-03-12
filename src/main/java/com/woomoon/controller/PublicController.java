package com.woomoon.controller;

import com.woomoon.dao.PowerMapper;
import com.woomoon.entitys.PowerEntity;
import com.woomoon.entitys.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class PublicController {

    @Autowired
    PowerMapper mapper;

    @RequestMapping("href_indexREM")
    public String href_index() {
        return "demo\\indexREM";
    }

    @RequestMapping("href_homePage")
    public String href_homePage() {
        return "demo\\homePage";
    }

    @RequestMapping("pubQueryPower")
    @ResponseBody
    public List<PowerEntity> queryAllPower(HttpServletRequest request) {

        Map<String, String> userMap = (Map<String, String>) request.getSession().getAttribute("user");
        String user_account = userMap.get("user_account");
        String user_id = "";
        //得到map字符串
        String userStr = userMap.toString();
        //去除前后花括号
        userStr = userStr.substring(1, userStr.length() - 1);
        //去除中间的空格
        userStr = userStr.replace(" ", "");
        //先通过逗号切割
        String[] split = userStr.split(",");
        for (String s : split) {
            if (s.contains("user_id")) {
                System.out.println(s);
                String[] split1 = s.split("=");
                for (String s1 : split1) {
                    if (!"user_id".equals(s1)) {
                        user_id = s1;
                    }
                }
            }
        }

        List<PowerEntity> powerEntities = null;
        if ("admin".equals(user_account)) {
            powerEntities = mapper.queryAllPowers("0");
        } else {
            System.out.println("ssss___" + user_id);
            powerEntities = mapper.queryAllPower(user_id);
            System.out.println("ssss___" + user_id);
        }
        return powerEntities;
    }

    @RequestMapping("href_table")
    public String href_table() {
        return "demo\\table";
    }

    @RequestMapping("href_back")
    public String href_back() {
        return "demo\\background";
    }

    @RequestMapping("href_userGrant")
    public String href_userGrant() {
        return "demo\\userGrant";
    }

    @RequestMapping("login")
    public String login() {
        return "demo\\login";
    }

    @RequestMapping("closeSession")
    @ResponseBody
    public boolean closeSession(HttpServletRequest request) {
        request.getSession().invalidate();
        return true;
    }

}
