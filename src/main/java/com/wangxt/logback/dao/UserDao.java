package com.wangxt.logback.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wangxt.logback.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends BaseMapper<User> {

}
