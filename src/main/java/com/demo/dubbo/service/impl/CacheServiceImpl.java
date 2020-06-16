package com.demo.dubbo.service.impl;

import com.demo.dubbo.service.CacheService;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by chenxyz on 2020/6/10.
 */
@Service("cacheService")
public class CacheServiceImpl implements CacheService {

    private final  AtomicInteger i=new AtomicInteger();

    @Override
    public String findCode(String param) {
        return "request "+param+" , response "+i.getAndIncrement();
    }
}
