package com.davidmendano.kanban.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class UserModel implements Parcelable, UserModelInterface{

    String userId;

    public UserModel() {
        this.userId = userId;
    }


    protected UserModel(Parcel in) {
        userId = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(userId);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "userId='" + userId + '\'' +
                '}';
    }

    public static final Creator<UserModel> CREATOR = new Creator<UserModel>() {
        @Override
        public UserModel createFromParcel(Parcel in) {
            return new UserModel(in);
        }

        @Override
        public UserModel[] newArray(int size) {
            return new UserModel[size];
        }
    };

    @Override
    public void setUserModel(String userId) {
        this.userId = userId;
    }

    @Override
    public String getUserId() {
        return userId;
    }
}
