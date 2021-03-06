package com.woomoon.dao;

import com.woomoon.entitys.PowerEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PowerMapper {

    //查询所有
    public List<PowerEntity> queryAllPowers(String p_size);

    //查询所有power_size,power_pid,user_id
    public List<PowerEntity> queryAllPower(@Param("power_size")String power_size,@Param("power_pid")String power_pid,@Param("user_id") String user_id);

    //查询单个
    public PowerEntity queryOnePower(String treeId);

    //修改名称
    public void updPower(@Param("p_name") String p_name, @Param("p_id") String p_id);

    //添加节点
    public void addPower(PowerEntity power);

    //删除节点
    public void delPower(int power_id);

}
