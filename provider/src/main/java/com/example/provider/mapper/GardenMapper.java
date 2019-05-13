package com.example.provider.mapper;

import com.example.provider.pojo.Garden;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface GardenMapper {
    int deleteByPrimaryKey(Integer gardenId);

    int insert(Garden record);

    Map<String, Object> selectByPrimaryKey(Integer gardenId);

    List<Garden> selectAll();

    int updateByPrimaryKey(Garden record);
}