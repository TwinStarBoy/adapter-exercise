package com.org.pattern.adapterExercise;

public class LoginManageAdapterTest {
    public static void main(String[] args) {
        LoginManage loginManage = new LoginByEmail();

        loginManage.login("1234@1634.com","123456");

        loginManage = new LoginByPhone();

        loginManage.login("13865476987","123456");

    }
}
