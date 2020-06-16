package com.demo.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.dubbo.service.Common;

/**
 * Created by chenxyz on 2020/6/11.
 */
@Service
public class CommonImpl  implements Common{
    @Override
    public String eat(String param) {
        for (int i = 0; i < 10000; i++) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("CommonImpl eat");
        return "CommonImpl eat";
    }
}
