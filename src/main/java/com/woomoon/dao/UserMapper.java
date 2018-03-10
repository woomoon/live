package com.woomoon.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {

    //查询所有用户
    List<Map<String,String>> queryAllUser(@Param("user_name") String user_name, @Param("begin") int begin, @Param("end")int end);

    int queryAllUserCount(@Param("user_name") String user_name);

}
