package com.davidmendano.kanban.Repos;

import android.os.Parcel;
import android.os.Parcelable;

public class LocalItemModel implements Parcelable, ItemComponentModelInterface {

    String repoName;
    String repoAuthor;

    public LocalItemModel() {
    }

    protected LocalItemModel(Parcel in) {
        repoName = in.readString();
        repoAuthor = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(repoName);
        dest.writeString(repoAuthor);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<LocalItemModel> CREATOR = new Creator<LocalItemModel>() {
        @Override
        public LocalItemModel createFromParcel(Parcel in) {
            return new LocalItemModel(in);
        }

        @Override
        public LocalItemModel[] newArray(int size) {
            return new LocalItemModel[size];
        }
    };

    @Override
    public String getRepoName() {
        return repoName;
    }

    @Override
    public String getRepoAuthor() {
        return repoAuthor;
    }
}
