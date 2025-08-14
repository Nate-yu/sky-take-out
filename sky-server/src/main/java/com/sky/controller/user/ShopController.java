package com.sky.controller.user;

import com.sky.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @author yubin
 * @date 2025年08月14日 19:48
 */
@RestController("userShopController")
@RequestMapping("/user/shop")
@Api(tags = "店铺相关接口")
@Slf4j
public class ShopController {

    public static final String KEY = "SHOP_STATUS";

    // 自动注入redis模板对象
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 获取店铺状态
     * @author yubin
     * @date 2025/8/14 19:59
     * @return com.sky.result.Result<java.lang.Integer>
     */
    @GetMapping("/status")
    @ApiOperation(value = "获取店铺状态")
    public Result<Integer> getStatus() {
        Integer status = (Integer) redisTemplate.opsForValue().get(KEY);
        log.info("获取店铺营业状态为：{}",status == 1 ? "营业" : "打烊");
        return Result.success(status);
    }
}
