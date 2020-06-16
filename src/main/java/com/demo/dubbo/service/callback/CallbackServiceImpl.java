package com.demo.dubbo.service.callback;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by chenxyz on 2020/6/11.
 */
@Service("callbackService")
public class CallbackServiceImpl implements CallbackService {

    private  final Map<String,CallbackListener> listenerMap=new ConcurrentHashMap<>();


    public CallbackServiceImpl() {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                       for(Map.Entry<String,CallbackListener> entry:listenerMap.entrySet()){
                           try {
                               entry.getValue().change(getChanged(entry.getKey()));
                           }catch (Throwable t){
                               listenerMap.remove(entry.getKey());
                           }
                       }
                       Thread.sleep(5000);
                    }catch (Throwable t){
                        t.printStackTrace();
                    }
                }
            }
        });
        t.setDaemon(true);
        t.start();
    }

    @Override
    public void addListener(String key, CallbackListener listener) {
        listenerMap.put(key,listener);
        listener.change(getChanged(key));

    }

    private String getChanged(String key){
        return  "Changed: "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
