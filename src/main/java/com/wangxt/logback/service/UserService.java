package com.wangxt.logback.service;

import com.wangxt.logback.dao.UserDao;
import com.wangxt.logback.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserInfo(int userId) {
        User user = userDao.selectById(userId);
        return user;
    }
}
