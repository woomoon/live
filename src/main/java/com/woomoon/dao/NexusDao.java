package com.woomoon.dao;

import com.woomoon.entitys.NexusEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface NexusDao {

    //查询所有社会关系+模糊查询
    public List<Map<String,Object>> queryAllNexus(@Param("n_entity") NexusEntity nexusEntity,@Param("begin") int begin,@Param("end") int end);

    //根据ID查询病人
    public NexusEntity queryOneNexus_ID(Integer nexus_id);

    //查询病人的总数
    public int NexusSum(NexusEntity nexusEntity);

    //增加社会关系
    public void addNexus(NexusEntity nexusEntity);

    //修改社会关系
    public void updateNexus(NexusEntity nexusEntity);

}
