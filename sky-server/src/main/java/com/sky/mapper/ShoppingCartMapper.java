package com.sky.mapper;

import com.sky.entity.ShoppingCart;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {


    /**
     * 动态条件查询购物车
     * @author yubin
     * @date 2025/8/23 14:50
     * @param shoppingCart
     * @return java.util.List<com.sky.entity.ShoppingCart>
     */
    List<ShoppingCart> list(ShoppingCart shoppingCart);


    /**
     * 根据id修改商品数量
     * @author yubin
     * @date 2025/8/23 15:00
     * @param shoppingCart
     */
    @Update("update shopping_cart set number = #{number} where id = #{id}")
    void updateNumberById(ShoppingCart shoppingCart);

    /**
     * 插入购物车数据
     * @author yubin
     * @date 2025/8/23 15:15
     * @param shoppingCart 
     */
    @Insert("insert into shopping_cart (name, user_id, dish_id, setmeal_id, dish_flavor, number, amount, image, create_time)"
    + "values (#{name}, #{userId}, #{dishId}, #{setmealId}, #{dishFlavor}, #{number}, #{amount}, #{image}, #{createTime})")
    void insert(ShoppingCart shoppingCart);
}
