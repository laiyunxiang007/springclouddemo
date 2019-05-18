package com.example.client.hytrix;

import com.example.client.providerService;
import org.springframework.stereotype.Component;

/**
 * 创建者 bee
 * 类名称
 * 类说明
 * 创建时间 2019/4/12
 */
@Component
public  class providerServiceHystrix implements providerService {
    @Override
    public  String getProvider(Integer id) {
        return "对不起，服务出错了";
    }

}
