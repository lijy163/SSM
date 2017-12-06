package com.basics.mapper;

import com.basics.model.User;

public interface IUserDao {

    User selectUser(long id);

}