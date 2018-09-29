package com.davidmendano.kanban.Repos;

import android.os.Parcel;
import android.os.Parcelable;

class ExplorerItemModel implements Parcelable, ItemComponentModelInterface {

    String repoName;
    String repoAuthor;

    public ExplorerItemModel() {
    }

    public ExplorerItemModel(String repoName, String repoAuthor) {
        this.repoName = repoName;
        this.repoAuthor = repoAuthor;
    }

    protected ExplorerItemModel(Parcel in) {
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

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public void setRepoAuthor(String repoAuthor) {
        this.repoAuthor = repoAuthor;
    }

    @Override
    public String toString() {
        return "ExplorerItemModel{" +
                "repoName='" + repoName + '\'' +
                ", repoAuthor='" + repoAuthor + '\'' +
                '}';
    }

    public static final Creator<ExplorerItemModel> CREATOR = new Creator<ExplorerItemModel>() {
        @Override
        public ExplorerItemModel createFromParcel(Parcel in) {
            return new ExplorerItemModel(in);
        }

        @Override
        public ExplorerItemModel[] newArray(int size) {
            return new ExplorerItemModel[size];
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
