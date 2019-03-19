package com.org.pattern.adapterExercise;

public class LoginByPhone extends LoginManage {

    private String phoneNumberStore = "13865476987";
    private String passwordStore = "123456";
    @Override
    public boolean login(String phoneNumber, String password) {
        boolean flag = phoneNumberStore.equals(phoneNumber) && passwordStore.equals(password);
        if (!flag){
            System.out.println("手机号:"+phoneNumber+",密码:"+password+",登录失败,返回false");
            return false;
        }
        System.out.println("手机号:"+phoneNumber+",密码:"+password+",登录成功,返回true");
        return true;
    }

    @Override
    public boolean register(String username, String password) {
        return super.register(username, password);
    }
}
