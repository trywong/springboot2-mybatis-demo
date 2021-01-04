package com.charging.mapper;


import com.charging.model.User;

import java.util.List;

public interface UserMapper {


    int insert(User record);



    List<User> selectUsers();
}