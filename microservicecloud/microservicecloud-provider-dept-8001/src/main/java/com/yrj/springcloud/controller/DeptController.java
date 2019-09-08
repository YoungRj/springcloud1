package com.yrj.springcloud.controller;

import com.yrj.springcloud.entities.Dept;
import com.yrj.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
//    @Autowired
//    private DiscoveryClient client;

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.list();
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return deptService.get(id);
    }

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public  boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }
}
