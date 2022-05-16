package com.javacto.service.Impl;

import com.javacto.mapper.UserMapper;
import com.javacto.po.User;
import com.javacto.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * liu
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    public int delete(int id) {
        return userMapper.delete(id);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public List<User> query() {
        return userMapper.query();
    }

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }
}
