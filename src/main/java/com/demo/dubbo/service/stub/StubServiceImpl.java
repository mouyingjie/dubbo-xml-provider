package com.demo.dubbo.service.stub;


/**
 * Created by chenxyz on 2020/6/11.
 */
public class StubServiceImpl implements StubService {
    @Override
    public String stub(String param) {
        System.out.println("provider StubServiceImpl stub");
        return "provider StubServiceImpl stub";
    }
}
