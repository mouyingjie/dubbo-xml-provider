package com.demo.dubbo.service.impl;


import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by chenxyz on 2020/6/10.
 */
@Service
public class AnnotionServiceImpl implements AnnotionService {
    @Override
    public String anno(String param) {
        System.out.println("annotionservice method");
        return param+"annotionservice";
    }
}
