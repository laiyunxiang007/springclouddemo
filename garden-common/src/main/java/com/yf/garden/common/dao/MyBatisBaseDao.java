package com.yf.garden.common.dao;

import com.yf.garden.common.dto.QueryCondition;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/**
 * DAO公共基类，请勿修改
 * @param <Model> The Model Class 这里是泛型不是Model类
 * @param <PK> The Primary Key Class 如果是无主键，则可以用Model来跳过，如果是多主键则是Key类
 */
public interface MyBatisBaseDao<Model, PK extends Serializable> {

    int deleteByPrimaryKey(PK id);

    int insert(Model record);

    int insertSelective(Model record);

    List<Model> selectByCondition(Model condition);

    Model selectByPrimaryKey(PK id);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);

    int insertList(List<Model> list);

    int updateByPrimaryKeyList(@Param("record") Model record, @Param("pkList") List<PK> pkList);

    List<Model> listByCondition(QueryCondition condition);
}