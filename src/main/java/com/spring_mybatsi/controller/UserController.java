package com.spring_mybatsi.controller;

import com.spring_mybatsi.domain.User;
import com.spring_mybatsi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("save")
    public User save(){
        User user = new User();
        user.setUserName("abc");
        user.setPwd("12y37");
        userService.save(user);
        // int i=1/0;
        return user;
    }
}
