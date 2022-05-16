package com.javacto.service;

import com.javacto.po.User;

import java.util.List;

/**
 * liu
 **/
public interface UserService {
    int add(User user);
    int delete(int id);
    int update(User user);
    List<User> query();
    User findById(int id);
}
