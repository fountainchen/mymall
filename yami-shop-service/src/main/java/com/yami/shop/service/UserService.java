/*
 * Copyright (c) 2018-2999 广州市蓝海创新科技有限公司 All rights reserved.
 *
 * https://www.mall4j.com/
 *
 * 未经允许，不可做商业用途！
 *
 * 版权所有，侵权必究！
 */

package com.yami.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.bean.model.User;
import com.yami.shop.bean.param.UserRegisterParam;

/**
 *
 * @author lgh on 2018/09/11.
 */
public interface UserService extends IService<User> {
    /**
     * 根据用户id获取用户信息
     * @param userId
     * @return
     */
    User getUserByUserId(String userId);

    /**
     * 校验验证码
     * @param userRegisterParam
     * @param checkRegisterSmsFlag
     */
    void validate(UserRegisterParam userRegisterParam, String checkRegisterSmsFlag);
}
