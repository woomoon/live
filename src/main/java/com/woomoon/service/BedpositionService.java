package com.woomoon.service;

import com.woomoon.entitys.BedpositionEntity;

import java.util.List;
import java.util.Map;

public interface BedpositionService {

    //查询所有+模糊查询
    public List<Map<String,Object>> queryAllBedposition(BedpositionEntity bedpositionEntity,int begin,int end);

    //查询单个
    public Map<String,Object> queryOneBedposition(int bed_id);

    //查询总数
    public int BedpositionSum(BedpositionEntity bedpositionEntity);

    //增加
    public void addBedposition(BedpositionEntity bedpositionEntity);

    //删除
    public void delBedposition(int bed_id);

    //修改
    public void updBedposition(BedpositionEntity bedpositionEntity);
}
