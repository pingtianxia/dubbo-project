package com.hyp.spring.service;
import com.hyp.spring.bean.UserInfo;
import com.hyp.spring.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @作者 霍云平
 * @包名 com.hyp.spring.service
 * @日期 2018/11/5 19:17
 * @描述 11
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public UserInfo getUserInfoById(Integer id) {
        return userMapper.getUserInfoById(id);
    }
}
