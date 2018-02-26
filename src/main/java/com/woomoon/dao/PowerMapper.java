package com.woomoon.dao;

import com.woomoon.entitys.PowerEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PowerMapper {

    //查询所有
    public List<PowerEntity> queryAllPower (int psize);

    //查询单个
    public PowerEntity queryOnePower (String treeId);


}
