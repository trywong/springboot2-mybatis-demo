package com.charging.service.user;

import com.github.pagehelper.PageInfo;
import com.charging.model.User;

/**
 */
public interface IUserService {

    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);
}
