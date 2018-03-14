package com.woomoon.dao;

import com.woomoon.entitys.DepositEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DepositDao {
    //查询所有押金+模糊查询
    public List<Map<String,Object>> queryAllDeposit(@Param("d_entity") DepositEntity depositEntity, @Param("pat_name") String pat_name, @Param("begin") int begin, @Param("end") int end);

    //根据ID查询押金
    public DepositEntity queryOneDeposit(Integer  deposit_id);

    //根据住院ID查询住院人是否存在于押金
    public DepositEntity countDeposit(String live_num);

    //查询押金的总数+模糊查询
    public int DepositSum(@Param("d_entity") DepositEntity depositEntity,@Param("pat_name") String pat_name);

    //增加押金
    public void addDeposit(DepositEntity depositEntity);

    //修改押金
    public void updateDeposit(DepositEntity depositEntity);

    //删除押金
    public void deleteDeposit(Integer deposit_id);
}
