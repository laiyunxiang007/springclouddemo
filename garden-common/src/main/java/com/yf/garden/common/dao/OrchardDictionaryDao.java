package com.yf.garden.common.dao;

import com.yf.garden.common.dto.OrchardDictionary;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * OrchardDictionaryDao继承基类
 */
@Repository
public interface OrchardDictionaryDao {

    int deleteByPrimaryKey(Long id);

    int insert(OrchardDictionary record);

    int insertSelective(OrchardDictionary record);

    OrchardDictionary selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrchardDictionary record);

    int updateByPrimaryKey(OrchardDictionary record);

    List<OrchardDictionary> selectAll();

    List<OrchardDictionary> selectByType(String typeCode);

    List<OrchardDictionary> selectByType1(String code);

    List<OrchardDictionary> selectByTypeAll(String dicTypeCode);
}