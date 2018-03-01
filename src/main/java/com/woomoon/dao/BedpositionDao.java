package com.woomoon.dao;

import com.woomoon.entitys.BedpositionEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BedpositionDao {

    //查询所有
    public List<Map<String,Object>> queryAllbedposition();


    //查询单个
    public Map<String,Object> queryOnebedposition(int bed_id);

    //增加
    public void addbedposition(BedpositionEntity bedpositionEntity);

    //删除
    public void delbedposition(int bed_id);

    //修改
    public void updbedposition(BedpositionEntity bedpositionEntity);
}
