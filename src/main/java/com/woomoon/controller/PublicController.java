//package com.woomoon.controller;
//
//import com.woomoon.dao.PowerMapper;
//import com.woomoon.entitys.PowerEntity;
//import com.woomoon.entitys.UserEntity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//@Controller
//public class PublicController {
//
//    @Autowired
//    PowerMapper mapper;
//
//    //进入主页面
//    @RequestMapping("href_indexREM")
//    public String href_index() {
//        return "demo\\indexREM";
//    }
//
//    //主页面，展示图片
//    @RequestMapping("href_homePage")
//    public String href_homePage() {
//        return "demo\\homePage";
//    }
//
//    @RequestMapping("href_table")
//    public String href_table() {
//        return "demo\\table";
//    }
//
//    @RequestMapping("href_back")
//    public String href_back() {
//        return "demo\\background";
//    }
//
//    @RequestMapping("test")
//    public String test() {
//        return "demo\\test";
//    }
//
//
//
//    //退出，注销session
//    @RequestMapping("closeSession")
//    @ResponseBody
//    public boolean closeSession(HttpServletRequest request) {
//        request.getSession().invalidate();
//        return true;
//    }
//
//    //主页面查询菜单
//    @RequestMapping("pubQueryPower")
//    @ResponseBody
//    public List<PowerEntity> queryAllPower(HttpServletRequest request) {
//        UserEntity user = (UserEntity) request.getSession().getAttribute("user");
//        String user_account = user.getUser_account();
//        List<PowerEntity> powerEntities = null;
//        if ("admin".equals(user_account)) {
//            powerEntities = mapper.queryAllPowers("0");
//        } else {
//            powerEntities = mapper.queryAllPower("0", "", user.getUser_id() + "");
//        }
//        return powerEntities;
//    }
//
//    //子页面查询按钮
//    @RequestMapping("queryPowerBtn")
//    @ResponseBody
//    public List<String> queryAllPowerBtn(HttpServletRequest request, String p_pid) {
//        List<String> list = new ArrayList<>();
//        UserEntity user = (UserEntity) request.getSession().getAttribute("user");
//        List<PowerEntity> powerEntities = mapper.queryAllPower("3", p_pid, user.getUser_id() + "");
//        for (PowerEntity powerEntity : powerEntities) {
//            list.add(powerEntity.getPower_url());
//        }
//        return list;
//    }
//
//    //登录页面
//    @RequestMapping("login")
//    public String login() {
//        return "demo\\login";
//    }
//
//    //权限管理
//    @RequestMapping(value = "href_power")
//    public String href_power() {
//        return "powerCRUD";
//    }
//
//    //角色管理
//    @RequestMapping(value = "href_role")
//    public String href_role() {
//        return "roleCRUD";
//    }
//
//    //用户授权
//    @RequestMapping("href_userGrant")
//    public String href_userGrant() {
//        return "demo\\userGrant";
//    }
//
//    //角色授权
//    @RequestMapping(value = "href_roleGrant")
//    public String href_roleGrant() {
//        return "demo\\roleGrant";
//    }
//
//    //用户管理
//    @RequestMapping("href_user")
//    public String userCRUD() {
//        return "demo\\userCRUD";
//    }
//
//
//
//}
