package com.demo.dubbo.service.breakpoint;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by chenxyz on 2020/6/11.
 */
@Service
public class BreakpointServiceImpl implements BreakpointService {
    @Override
    public String breakpoint(String param) {
        System.out.println("BreakpointServiceImpl breakpoint");
        return "BreakpointServiceImpl breakpoint";
    }
}
