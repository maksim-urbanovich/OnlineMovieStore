package com.maximus.jwd.dao.repository;

import com.maximus.jwd.dao.domain.User;
import com.maximus.jwd.dao.domain.UserDto;
import com.maximus.jwd.dao.exception.DaoException;

import java.util.List;

public interface UserDao {
    List<UserDto> getAllUsers();
    UserDto findUserById(long id);
    UserDto findUser(User user);
    UserDto saveUser(User user) throws DaoException;


}
