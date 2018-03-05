package com.woomoon.dao;

import com.woomoon.entitys.PowerEntity;
import com.woomoon.entitys.RoleEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {

    //查询所有
    public List<RoleEntity> queryAllRole(int psize);

    //查询单个
    public RoleEntity queryOneRole(String treeId);

    //修改名称
    public void updRole(@Param("p_name") String p_name, @Param("p_id") String p_id);

    //添加节点
    public void addRole(RoleEntity role);

    //删除节点
    public void delRole(int role_id);

}
