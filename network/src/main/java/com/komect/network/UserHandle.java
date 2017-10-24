package com.komect.network;

/**
 * Created by lsl on 2017/9/26.
 */
public class UserHandle {
    private User mUser;


    public UserHandle(User user) {
        mUser = user;
        getName();
        getAge();
    }


    public User getUser() {
        return mUser;
    }


    public void setUser(User user) {
        mUser = user;
    }


    public String getName() {
        return mUser == null ? null : mUser.getName();
    }


    public int getAge() {
        return mUser == null ? 0 : mUser.getAge();
    }
}
