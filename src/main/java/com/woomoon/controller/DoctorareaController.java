package com.woomoon.controller;

import com.woomoon.dao.DoctorareaDao;
import com.woomoon.service.DoctorareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class DoctorareaController {

    @Autowired
    DoctorareaService service;

    @Autowired
    DoctorareaDao dao;


    @RequestMapping("doctorareaDao")
    @ResponseBody
    public List<Map<String, Object>> doctorareaDao () {
        List<Map<String, Object>> query = dao.queryAllDoctorarea();
        return query;
    }

}
