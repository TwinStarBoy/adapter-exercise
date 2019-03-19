package com.org.pattern.adapterExercise;

public class LoginManage {

    private String usernameStore = "Allen";
    private String passwordStore = "123456";
    public boolean login (String username , String password){

        boolean flag = usernameStore.equals(username) && passwordStore.equals(password);
        if (!flag){
            System.out.println("用户名:"+username+",密码:"+password+",登录失败,返回false");
            return false;
        }
        System.out.println("用户名:"+username+",密码:"+password+",登录成功,返回true");
        return true;
    }

    public boolean register (String username , String password){
        System.out.println("注册用户名:"+username+"注册密码:"+password);
        return login(username,password);
    }
}
