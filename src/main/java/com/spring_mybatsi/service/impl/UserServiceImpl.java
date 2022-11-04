package com.spring_mybatsi.service.impl;

import com.spring_mybatsi.domain.User;
import com.spring_mybatsi.mapper.UserMapper;
import com.spring_mybatsi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int save(User user) {
        return userMapper.save(user);
    }
}
