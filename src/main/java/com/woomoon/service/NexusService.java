package com.woomoon.service;

import com.woomoon.entitys.NexusEntity;
import com.woomoon.entitys.PatientEntity;

import java.util.List;
import java.util.Map;

public interface NexusService {

    //查询所有社会关系
    public List<Map<String,Object>> queryAllNexus(NexusEntity nexusEntity);

    //模糊查询社会关系
    public Map<String,Object> queryOneNexus();

    //增加社会关系
    public void addNexus(NexusEntity nexusEntity);

    //修改社会关系
    public void updateNexus(NexusEntity nexusEntity);

    //删除社会关系
    public void deleteNexus(int nexus_id);

}
