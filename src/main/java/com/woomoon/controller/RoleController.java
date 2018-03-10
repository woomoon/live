package com.woomoon.controller;

import com.woomoon.dao.PowerMapper;
import com.woomoon.dao.RoleMapper;
import com.woomoon.entitys.PowerEntity;
import com.woomoon.entitys.RoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class RoleController {

    @Autowired
    RoleMapper roleMapper;

    //进入角色管理界面
    @RequestMapping(value = "href_role")
    public String href_power() {
        return "roleCRUD";
    }

    //进入角色授权界面
    @RequestMapping(value = "href_roleGrant")
    public String href_roleGrant() {
        return "demo\\roleGrant";
    }

    //查询角色对应的权限
    @RequestMapping(value = "queryRoleCoPower")
    @ResponseBody
    public List<Map<String, String>> queryRoleCoPower(String treeId) {
        List<Map<String, String>> maps = roleMapper.queryRoleCoPower(treeId);
        return maps;
    }

    //删除角色对应的权限
    @RequestMapping(value = "delRoleCoPower")
    @ResponseBody
    public boolean deleteRoleCoPower(String treeId) {
        try {
            roleMapper.delRoleCoPower(treeId);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //添加角色对应的权限
    @RequestMapping("addRoleCoPower")
    @ResponseBody
    public boolean addRoleCoPower(String rid, String ids) {
        deleteRoleCoPower(rid);
        try {
            String[] strIds = ids.split(",");
            for (String strId : strIds) {
                insRoleCoPower(rid, strId);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean insRoleCoPower(String rid, String pid) {
        try {
            if (!"".equals(pid)) {
                roleMapper.addRoleCoPower(Integer.parseInt(rid), Integer.parseInt(pid));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    //查询数据
    @RequestMapping(value = "queryAllRole")
    @ResponseBody
    public List<RoleEntity> queryAllRole() {
        List<RoleEntity> roleEntities = roleMapper.queryAllRole(3);
        return roleEntities;
    }

    //查询单个
    @RequestMapping(value = "queryOneRole")
    @ResponseBody
    public RoleEntity queryOneRole(String treeId) {
        if (treeId != null && treeId != "") {
            RoleEntity roleEntity = roleMapper.queryOneRole(treeId);
            return roleEntity;
        }
        return null;
    }

    //修改当前节点
    @RequestMapping(value = "updRole")
    @ResponseBody
    public boolean updRole(String p_name, String p_id) {
        try {
            roleMapper.updRole(p_name, p_id);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //添加节点
    @RequestMapping("addRole")
    @ResponseBody
    public boolean addRole(String role_name, int role_pid) {
        try {
            RoleEntity roleEntity = new RoleEntity();
            roleEntity.setRole_pid(role_pid);
            roleEntity.setRole_name(role_name);
            roleEntity.setIsParent("e");
            roleEntity.setRole_url("test");
            roleEntity.setRole_size("1");
            roleMapper.addRole(roleEntity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @RequestMapping("delRole")
    @ResponseBody
    public boolean delRole(int p_id) {
        try {
            roleMapper.delRole(p_id);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


}
