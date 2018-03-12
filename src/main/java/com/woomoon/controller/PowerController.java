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

    //不带条件、查询数据
    @RequestMapping(value = "queryAllPower")
    @ResponseBody
    public List<PowerEntity> queryAllPower() {
        List<PowerEntity> powerEntities = powerMapper.queryAllPowers("");
        return powerEntities;
    }




    //查询单个
    @RequestMapping(value = "queryOnePower")
    @ResponseBody
    public PowerEntity showAndHide(String treeId) {
        if (treeId != null && treeId != "") {
            PowerEntity powerEntity = powerMapper.queryOnePower(treeId);
            return powerEntity;
        }
        return null;
    }

    //修改当前节点
    @RequestMapping(value = "updPower")
    @ResponseBody
    public boolean updPower(String p_name, String p_id) {
        try {
            powerMapper.updPower(p_name, p_id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    //添加节点
    @RequestMapping("addPower")
    @ResponseBody
    public boolean addPower(PowerEntity entity) {
        try {
            if ("8".equals(entity.getIcon())) {//8 按钮   0 按钮
                entity.setIsParent("false");
                entity.setPower_size("0");
                entity.setPower_url("test");
                entity.setIcon("../../plugins/zTree/css/diy/9.png");
            } else {
                entity.setIsParent("true");
                entity.setPower_size("1");
                entity.setPower_url("test");
                entity.setIcon("../../plugins/zTree/css/diy/8.png");
            }
            powerMapper.addPower(entity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @RequestMapping("delPower")
    @ResponseBody
    public boolean delPower(int p_id) {
        try {
            powerMapper.delPower(p_id);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


}
