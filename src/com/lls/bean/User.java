package com.lls.bean;

public class User {
    private String userName;
    private String userSex;
    private String userId;
    private String userClass;
    private Pet pet;

    public User(String userName, Pet pet) {
        System.out.println("String,Pet");
        this.userName = userName;
        this.pet = pet;
    }

    public User(String userName, String userSex, String userId, String userClass, Pet pet) {
        this.userName = userName;
        this.userSex = userSex;
        this.userId = userId;
        this.userClass = userClass;
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

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

    public User() {
        System.out.println("User构造方法");
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
