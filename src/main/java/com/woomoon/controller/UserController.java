package com.woomoon.controller;

import com.woomoon.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "queryAllUser")
    @ResponseBody
    public Map<String, Object> queryAllUser(String queryCondition, String pageNum, String pageSize) {
        int begin = 0;
        int end = 5;
        if (!"".equals(pageNum) && !"".equals(pageSize) && pageNum != null && pageSize != null) {
            begin = Integer.parseInt(pageNum);
            end = Integer.parseInt(pageSize);
        }
        if (begin == 0) {
            begin = 0;
        } else {
            begin = (begin - 1) * end;
        }
        int i = userMapper.queryAllUserCount(queryCondition);
        List<Map<String, String>> maps = userMapper.queryAllUser(queryCondition, begin, end);
        Map<String,Object> map = new HashMap<>();
        map.put("total",i);
        map.put("user_list",maps);
        return map;
    }


}
