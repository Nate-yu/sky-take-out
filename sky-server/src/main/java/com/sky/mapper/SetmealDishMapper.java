package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    /**
     * 根据菜品id集合查询对应套餐id集合
     * @author yubin
     * @date 2025/4/21 21:27
     * @param dishIds
     * @return java.util.List<java.lang.Long>
     */
    List<Long> getSetmealDishIds(List<Long> dishIds);
}
