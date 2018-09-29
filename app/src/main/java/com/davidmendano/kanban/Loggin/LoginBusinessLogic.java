package com.davidmendano.kanban.Loggin;

import android.util.Log;

public class LoginBusinessLogic implements LoginBusinessLogicInterface{

    LoginCallback mLoginCallback;


    public LoginBusinessLogic(LoginCallback loginCallback) {
        mLoginCallback = loginCallback;
    }

    @Override
    public void attemptToLogin(String user, String password) {
        //TODO: Attempt to authenticate on GitHub
        mLoginCallback.succesfullyLoged();
    }
}
