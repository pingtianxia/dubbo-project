package com.hyp.spring.bean;
import java.util.Date;

/**
 * @作者 霍云平
 * @包名 com.hyp.spring.bean
 * @日期 2018/11/5 19:15
 * @描述 11
 */
public class UserInfo {
    private Integer id;
    private String userName;
    private String userCode;
    private Date birthDate;
    private String mobile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userCode='" + userCode + '\'' +
                ", birthDate=" + birthDate +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
