package com.woomoon.service;

import com.woomoon.entitys.NexusEntity;
import com.woomoon.entitys.PatientEntity;

import java.util.List;
import java.util.Map;

public interface NexusService {

    //查询所有社会关系+模糊查询
    public List<Map<String,Object>> queryAllNexus(NexusEntity nexusEntity,int begin,int end);

    //根据ID查询病人
    public NexusEntity queryOneNexus_ID(Integer nexus_id);

    //查询病人的总数
    public int NexusSum(NexusEntity nexusEntity);

    //增加社会关系
    public void addNexus(NexusEntity nexusEntity);

    //修改社会关系
    public void updateNexus(NexusEntity nexusEntity);

}
