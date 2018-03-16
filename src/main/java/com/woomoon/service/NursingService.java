package com.woomoon.service;

import com.woomoon.entitys.NursingEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface NursingService {

    //查询所有
    public List<Map<String,Object>> queryAllNursing(NursingEntity nursingEntity,int begin,int end);

    //查询单个
    public List<Map<String,Object>> queryOneNursing(int nurse_id);

    //查询总数
    public int NursingSum(NursingEntity nursingEntity);

    //增加
    public void addNursing(NursingEntity nursingEntity);

    //删除
    public void delNursing(int nurse_id);

    //修改
    public void updNursing(NursingEntity nursingEntity);

}
