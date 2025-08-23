package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    /**
     * 添加购物车
     * @author yubin
     * @date 2025/8/23 14:28
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);

    /**
     * 查看购物车
     * @author yubin
     * @date 2025/8/23 15:40
     * @return java.util.List<com.sky.entity.ShoppingCart>
     */
    List<ShoppingCart> showShoppingCart();

    /**
     * 清空购物车
     * @author yubin
     * @date 2025/8/23 15:46
     */
    void cleanShoppingCart();

    /**
     * 删除购物车中的一个商品
     * @author yubin
     * @date 2025/8/23 15:51
     * @param shoppingCartDTO
     */
    void subShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
