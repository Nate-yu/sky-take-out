package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

public interface UserService {
    /**
     * 微信登录
     * @author yubin
     * @date 2025/8/19 15:47
     * @param userLoginDTO
     * @return com.sky.entity.User
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
