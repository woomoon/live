package com.woomoon.dao;

import com.woomoon.entitys.NursingEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface NursingDao {


    //查询所有sadf、
    public List<Map<String,Object>> queryAllNursing(@Param("N_entity") NursingEntity nursingEntity,@Param("begin") int begin,@Param("end")int end);

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
