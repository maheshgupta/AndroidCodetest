package com.android.codetest;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.List;

import javax.inject.Inject;

import framework.core.BaseActivity;
import framework.model.jsonplaceholder.User;
import framework.retrofit.services.UsersService;
import retrofit2.Call;
import retrofit2.Retrofit;

public class LoginActivity extends BaseActivity {

    @Inject
    Retrofit retrofit;

    @Inject
    SharedPreferences prefs;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.pullUsers();
    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_login;
    }

    private void pullUsers() {
        UsersService users = retrofit.create(UsersService.class);
        Call<List<User>> response = users.getUsers();
        Log.i("", "pullUsers: ");
    }

}
