package ReceiveModels;

public class UserListReceiveModel {
    private int UserId ;

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getUserId() {
        return UserId;
    }

    private String UserName ;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    private FileModel Picture ;

    public FileModel getPicture() {
        return Picture;
    }

    public void setPicture(FileModel picture) {
        Picture = picture;
    }

    private boolean IsOnline ;

    public void setOnline(boolean online) {
        IsOnline = online;
    }

    public boolean isOnline() {
        return IsOnline;
    }
}
