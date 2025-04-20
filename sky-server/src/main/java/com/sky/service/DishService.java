package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.entity.Dish;

public interface DishService {
    /**
     * 新增菜品和对应的口味
     * @author yubin
     * @date 2025/4/20 14:26
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
