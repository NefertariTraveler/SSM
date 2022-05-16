package com.javacto.mapper;

import com.javacto.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * liu
 **/
@Mapper
public interface UserMapper {
    int add(User user);
    int delete(int id);
    int update(User user);
    List<User> query();
    User findById(int id);
}
