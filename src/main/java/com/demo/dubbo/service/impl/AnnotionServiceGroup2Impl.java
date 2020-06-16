package com.demo.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by chenxyz on 2020/6/10.
 */
@Service(group = "group2")
public class AnnotionServiceGroup2Impl implements   AnnotionService {
    @Override
    public String anno(String param) {
        System.out.println(param+" annotion group1");
        return param+" annotion group2";
    }
}
