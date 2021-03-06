package com.woomoon.dao;

import com.woomoon.entitys.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {

    //查询所有用户
    List<Map<String, String>> queryAllUser(@Param("user_name") String user_name, @Param("begin") int begin, @Param("end") int end);

    //查询所有的门诊医师的名字
    List<UserEntity> queryAllMZ();

    //查询所有的主治医师的名字
    List<UserEntity> queryAllZZ();

    //查询所有的主任医师的名字
    List<UserEntity> queryAllZR();

    //查询此表的总行数
    int queryAllUserCount(@Param("user_name") String user_name);

    //查询用户对应的角色
    List<Map<String, String>> queryUserCoRole(String user_id);

    //添加用户对应的角色
    void addUserCoRole(@Param("user_id") int user_id, @Param("role_id") int role_id);

    //删除用户对应的角色
    void delUserCoRole(String user_id);

    //用户登录
    UserEntity user_login(@Param("user_name") String user_name, @Param("user_pwd") String user_pwd);

    void addUser(UserEntity user);

    void delUser(int user_id);

    void updUser(@Param("user_id") int user_id, @Param("dept_id") int dept_id);

}
