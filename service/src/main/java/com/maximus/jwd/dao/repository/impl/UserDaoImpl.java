package com.maximus.jwd.dao.repository.impl;

import com.maximus.jwd.dao.domain.User;
import com.maximus.jwd.dao.domain.UserDto;
import com.maximus.jwd.dao.exception.DaoException;
import com.maximus.jwd.dao.repository.UserDao;

import java.util.List;

public class UserDaoImpl implements UserDao  {
    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }

    @Override
    public UserDto findUserById(long id) {
        return null;
    }

    @Override
    public UserDto findUser(User user) {
        return null;
    }

    @Override
    public UserDto saveUser(User user) throws DaoException {
        return null;
    }
}
