package com.demo.dubbo.service.callback;

/**
 * Created by chenxyz on 2020/6/11.
 */
public interface CallbackService {
    public void addListener(String key,CallbackListener listener);
}
