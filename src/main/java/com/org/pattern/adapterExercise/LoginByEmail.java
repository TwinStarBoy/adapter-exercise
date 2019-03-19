package com.org.pattern.adapterExercise;

public class LoginByEmail extends LoginManage {

    private String emailStore = "1234@163.com";
    private String passwordStore = "123456";
    public boolean login(String email, String password) {
        boolean flag = emailStore.equals(email) && passwordStore.equals(password);
        if (!flag){
            System.out.println("邮箱:"+email+",密码:"+password+",登录失败,返回false");
            return false;
        }
        System.out.println("邮箱:"+email+",密码:"+password+",登录成功,返回true");
        return true;
    }

    @Override
    public boolean register(String email, String password) {
        return super.register(email, password);
    }
}
