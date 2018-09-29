package com.davidmendano.kanban;

import android.app.Application;

import com.davidmendano.kanban.Model.UserModel;

public class KanbanApplication extends Application {

    private static String mCurrentUser;

    public static void setUser(String user) {
        mCurrentUser = user;
    }
}
