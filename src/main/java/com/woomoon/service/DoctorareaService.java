package com.woomoon.service;

import com.woomoon.entitys.DoctorareaEntity;
import java.util.List;
import java.util.Map;

public interface DoctorareaService {

    //查询所有病区
    public List<Map<String,Object>> queryAllDoctorarea();

    //查询单个病区
    public Map<String,Object> queryOneDoctorarea(int area_id);

    //增加病区
    public void addDoctorarea(DoctorareaEntity doctorareaEntity);

    //删除病区
    public void delDoctorarea(int area_id);

    //修改病区
    public void updDoctorarea(DoctorareaEntity doctorareaEntity);


}
