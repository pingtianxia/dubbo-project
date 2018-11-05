package com.hyp.spring.dao;
import com.hyp.spring.bean.UserInfo;

/**
 * @作者 霍云平
 * @包名 com.hyp.spring.dao
 * @日期 2018/11/5 19:16
 * @描述 11
 */
public interface UserMapper {
    public UserInfo getUserInfoById(Integer id);
}
