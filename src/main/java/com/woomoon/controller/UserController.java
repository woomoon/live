package com.woomoon.controller;

import com.woomoon.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    //查询用户，带名称模糊查询，带查询数据条数
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
        //查询用户表的总条数
        int i = userMapper.queryAllUserCount(queryCondition);

        List<Map<String, String>> maps = userMapper.queryAllUser(queryCondition, begin, end);

        Map<String, Object> map = new HashMap<>();
        map.put("total", i);
        map.put("user_list", maps);
        return map;
    }

    //查询用户对应的角色
    @RequestMapping("queryUserCoRole")
    @ResponseBody
    public List<Map<String, String>> queryUserCoRole(String user_id) {
        List<Map<String, String>> maps = userMapper.queryUserCoRole(user_id);
        return maps;
    }

    //添加用户对应的角色
    @RequestMapping("addUserCoRole")
    @ResponseBody
    public boolean addUserCoRole(String user_id, String ids) {
        delUserCoRole(user_id);
        try {
            String[] split = ids.split(",");
            for (String s : split) {
                if (!"".equals(s) && s != null) {
                    userMapper.addUserCoRole(Integer.parseInt(user_id), Integer.parseInt(s));
                }
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //删除用户对应的角色
    @RequestMapping("delUserCoRole")
    @ResponseBody
    public boolean delUserCoRole(String user_id) {
        try {
            userMapper.delUserCoRole(user_id);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //用户登录
    @RequestMapping("user_login")
    @ResponseBody
    public boolean user_login(HttpServletRequest request, String user_name, String user_pwd) {
        List<Map<String, String>> maps = userMapper.user_login(user_name, user_pwd);
        try {
            Map<String, String> userMap = maps.get(0);
            request.getSession().setAttribute("user", userMap);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
