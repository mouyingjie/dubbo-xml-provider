package com.demo.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by chenxyz on 2020/6/10.
 */
@Service(version = "2.0")
public class AnnotionServiceVersion2Impl implements AnnotionService {
    @Override
    public String anno(String param) {
        System.out.println("annotion version2.0");
        return param+" annotion version2.0";
    }
}
