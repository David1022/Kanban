package com.davidmendano.kanban.Loggin;

import com.davidmendano.kanban.KanbanApplication;
import com.davidmendano.kanban.Model.UserModel;
import com.davidmendano.kanban.Model.UserModelInterface;

/**
 * Will contain the business logic to log in the user
 */

public class LoginBusinessLogic implements LoginBusinessLogicInterface {

    LoginCallback mLoginCallback;
    UserModelInterface mUserModelInterface;

    public LoginBusinessLogic(LoginCallback loginCallback) {
        mLoginCallback = loginCallback;
    }

    @Override
    public void attemptToLogin(String user, String password) {
        //TODO: Attempt to authenticate on GitHub
        mUserModelInterface = new UserModel();
        mUserModelInterface.setUserModel(user);
        //TODO: First aprox. to save the current user loginw
        KanbanApplication.setUser(mUserModelInterface.getUserId());

        mLoginCallback.succesfullyLoged();
    }
}
