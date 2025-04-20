package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper {
    /**
     * 批量插入口味数据
     * @author yubin
     * @date 2025/4/20 14:38
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);
}
