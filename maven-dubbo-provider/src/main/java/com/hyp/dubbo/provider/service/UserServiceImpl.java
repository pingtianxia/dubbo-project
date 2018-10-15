package com.hyp.dubbo.provider.service;

import com.hyp.dubbo.provider.dao.UserMapper;
import com.hyp.dubbo.provider.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public UserInfo getUserInfoById(Integer id) {
        return userMapper.getUserInfoById(id);
    }
}
