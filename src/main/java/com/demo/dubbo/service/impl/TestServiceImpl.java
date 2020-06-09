package com.demo.dubbo.service.impl;

import com.demo.dubbo.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by chenxyz on 2020/6/9.
 */
@Service("testService")
public class TestServiceImpl implements TestService {
    @Override
    public String test(String test) {
        System.out.println(test + " __________");
        return "test success";
    }
}
