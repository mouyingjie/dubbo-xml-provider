package com.demo.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by chenxyz on 2020/6/10.
 */
@Service(version = "1.0")
public class AnnotionServiceVersionImpl implements AnnotionService {
    @Override
    public String anno(String param) {
        System.out.println("annotion version1.0");
        return param+" annotion version1.0";
    }
}
