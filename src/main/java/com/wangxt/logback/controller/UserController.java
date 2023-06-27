package com.wangxt.logback.controller;

import com.wangxt.logback.pojo.User;
import com.wangxt.logback.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("userinfo/{uid}")
    @ResponseBody
    public User userinfo(@PathVariable("uid") int userId) {
        log.info("public User userinfo(@PathVariable(\"uid\") int userId)");
        log.debug("public User userinfo(@PathVariable(\"uid\") int userId)");
        return userService.getUserInfo(userId);
    }

    @GetMapping("packagingData")
    @ResponseBody
    public String packagingDataError() {
        String str = null;
        str.length();
        return str;
    }
}
