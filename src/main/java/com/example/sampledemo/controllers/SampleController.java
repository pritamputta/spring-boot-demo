package com.example.sampledemo.controllers;


import com.example.sampledemo.modules.DataConfiguration;
import com.example.sampledemo.modules.SampleData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class SampleController {

    @Value("${default.data.data}")
    private String data;
    @Value("${default.data.number}")
    private int number;

    @Autowired
    private DataConfiguration dataConfiguration;

    @RequestMapping("/sample")
    public String getSample(){
        return  "Sample Demo...";
    }

    @RequestMapping("/data")
    public SampleData getSampledata(){
        return new SampleData(data, number);
    }

    @RequestMapping("/configured-data")
    public HashMap<String, Object> getConfiguredData(){

        HashMap<String, Object> map = new HashMap<>();
        map.put("data", dataConfiguration.getData());
        map.put("number", dataConfiguration.getNumber());
        return map;
    }
}
