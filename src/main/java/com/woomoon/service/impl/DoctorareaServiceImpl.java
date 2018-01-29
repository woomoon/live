package com.woomoon.service.impl;

import com.woomoon.dao.DoctorareaDao;
import com.woomoon.service.DoctorareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DoctorareaServiceImpl implements DoctorareaService{

    @Autowired
    private DoctorareaDao doctorareaDao;

    public List<Map<String, Object>> queryAllDoctorarea() {
        return doctorareaDao.queryAllDoctorarea();
    }
}
