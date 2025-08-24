package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    /**
     * 插入订单数据
     * @author yubin
     * @date 2025/8/24 14:43
     * @param orders 
     */
    void insert(Orders orders);
}
