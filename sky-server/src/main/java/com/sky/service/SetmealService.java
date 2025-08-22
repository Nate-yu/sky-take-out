package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.entity.Setmeal;
import com.sky.result.PageResult;
import com.sky.vo.DishItemVO;
import com.sky.vo.SetmealVO;
import java.util.List;

public interface SetmealService {

    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @author yubin
     * @date 2025/8/22 10:16
     * @param setmealDTO
     */
    void saveWithDish(SetmealDTO setmealDTO);

    /**
     * 套餐分页查询
     * @author yubin
     * @date 2025/8/22 10:27
     * @param setmealPageQueryDTO
     * @return com.sky.result.PageResult
     */
    PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    /**
     * 批量删除套餐
     * @author yubin
     * @date 2025/8/22 10:41
     * @param ids
     */
    void deleteBatch(List<Long> ids);

    /**
     * 根据id查询套餐和关联的菜品数据
     * @author yubin
     * @date 2025/8/22 14:19
     * @param id 
     * @return com.sky.vo.SetmealVO
     */
    SetmealVO getByIdWithDish(Long id);

    /**
     * 修改套餐
     * @author yubin
     * @date 2025/8/22 14:21
     * @param setmealDTO
     */
    void update(SetmealDTO setmealDTO);

    /**
     * 套餐启售停售
     * @author yubin
     * @date 2025/8/22 14:45
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

    /**
     * 条件查询
     * @author yubin
     * @date 2025/8/22 15:03
     * @param setmeal
     * @return java.util.List<com.sky.entity.Setmeal>
     */
    List<Setmeal> list(Setmeal setmeal);

    /**
     * 根据id查询菜品选项
     * @author yubin
     * @date 2025/8/22 15:05
     * @param id
     * @return java.util.List<com.sky.vo.DishItemVO>
     */
    List<DishItemVO> getDishItemById(Long id);
}
