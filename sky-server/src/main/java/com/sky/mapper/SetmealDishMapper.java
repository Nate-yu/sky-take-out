package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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

    /**
     * 批量保存套餐和菜品的关联关系
     * @author yubin
     * @date 2025/8/22 10:19
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);

    /**
     * 根据套餐id删除套餐和菜品的关联关系
     * @author yubin
     * @date 2025/8/22 10:52
     * @param setmealId
     */
    @Delete("delete from setmeal_dish where setmeal_id = #{setmealId}")
    void deleteBySetmealId(Long setmealId);

    /**
     * 根据套餐id查询套餐和菜品的关联关系
     * @author yubin
     * @date 2025/8/22 14:27
     * @param id
     * @return java.util.List<com.sky.entity.SetmealDish>
     */
    @Select("select * from setmeal_dish where setmeal_id = #{id}")
    List<SetmealDish> getBySetmealId(Long id);
}
