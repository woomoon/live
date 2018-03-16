package com.woomoon.dao;

import com.woomoon.entitys.BedpositionEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BedpositionDao {

    //查询所有
    public List<Map<String,Object>> queryAllBedposition(@Param("B_entity") BedpositionEntity bedpositionEntity,@Param("begin") int begin,@Param("end") int end);

    //查询所有的空床位
    public List<BedpositionEntity> queryAllBedposition_sky();

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
