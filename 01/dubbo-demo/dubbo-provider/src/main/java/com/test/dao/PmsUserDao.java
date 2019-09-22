package com.test.dao;

import com.test.entity.PmsUser;

public interface PmsUserDao {
    /**
     * 根据用户登录名获取用户信息.
     *
     * @param loginName
     *            .
     * @return user .
     */
    PmsUser findByUserNo(String userNo);
}
