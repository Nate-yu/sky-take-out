package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService {
    /**
     * 新增菜品和对应的口味
     * @author yubin
     * @date 2025/4/20 14:26
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);

    /**
     * 分页查询菜品
     * @author yubin
     * @date 2025/4/21 20:46
     * @param dishPageQueryDTO
     * @return com.sky.result.PageResult
     */
    PageResult page(DishPageQueryDTO dishPageQueryDTO);

    void deleteBatch(List<Long> ids);

    /**
     * 根据id查询菜品和对应的口味数据
     * @author yubin
     * @date 2025/4/21 22:06
     * @param id
     * @return com.sky.vo.DishVO
     */
    DishVO getByIdWithFlavor(Long id);

    /**
     * 修改菜品
     * @author yubin
     * @date 2025/4/21 22:11
     * @param dishDTO
     */
    void updateWithFlavor(DishDTO dishDTO);
}
