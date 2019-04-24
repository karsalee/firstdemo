package com.lls.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


//<bean name="user" class="com.lls.bean.User"> 与下面这个注解功能相同
//@Component("user")
@Service("user")//service层注解
//@Controller("user")web层注解
//@Repository("user")dao层注解
public class User2 {
    @Value(value = "老毛")//使用暴力反射的方式来进行赋值，破坏了封装性，一般不推荐
    private String userName;
    private String userSex;
    private String userId;
    private String userClass;
    private Pet pet;

    public Pet getPet() {
        return pet;
    }

//    自动装配：存在一些问题，如果容器中不止一个该类对象，那么将会不知道装配哪个对象而报错
    @Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userId='" + userId + '\'' +
                ", userClass='" + userClass + '\'' +
                ", pet=" + pet +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    //一般使用在set方法上进行注解的方式来进行赋值
    @Value(value = "男")
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }
}
