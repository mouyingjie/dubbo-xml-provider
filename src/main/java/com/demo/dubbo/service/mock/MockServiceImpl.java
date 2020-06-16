package com.demo.dubbo.service.mock;


/**
 * Created by chenxyz on 2020/6/11.
 */
public class MockServiceImpl implements MockService {
    @Override
    public String mock(String param) {
        System.out.println("provider MockServiceImpl mock");
        return "provider MockServiceImpl mock";
    }
}
