package com.example.provider;

import com.example.provider.mapper.GardenMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 创建者 bee
 * 类名称
 * 类说明
 * 创建时间 2019/4/12
 */
@Service
public class gardenSerivce {
    @Autowired
    private GardenMapper gardenMapper;

    public Map<String, Object> getGarden(Integer id) throws InterruptedException {
        Thread.sleep(5000);
     return   gardenMapper.selectByPrimaryKey(id);
    }
}
