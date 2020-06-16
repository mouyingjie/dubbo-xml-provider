package com.demo.dubbo.service.impl;

import com.demo.dubbo.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by chenxyz on 2020/6/10.
 */
@Service("asyncService")
public class AsyncServiceImpl implements AsyncService {

    Logger logger= LoggerFactory.getLogger(AsyncServiceImpl.class);

    @Override
    public String async(String param) {
        try {
            for (int i = 0; i <5 ; i++) {
                System.out.println("async provider received: " + param);
                Thread.sleep(1000);
            }

        }catch (Exception e){
            logger.debug(e.getMessage());
        }

        return "async "+param;
    }
}
