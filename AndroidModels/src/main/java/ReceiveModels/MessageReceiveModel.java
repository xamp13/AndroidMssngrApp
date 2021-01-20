package ReceiveModels;

import java.util.Date;

public class MessageReceiveModel {
    private int Id;

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    private int UserId;

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    private int ChatId;

    public int getChatId() {
        return ChatId;
    }

    public void setChatId(int chatId) {
        ChatId = chatId;
    }

    private String UserMassage;

    public String getUserMassage() {
        return UserMassage;
    }

    public void setUserMassage(String userMassage) {
        UserMassage = userMassage;
    }

    private Date Date;

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    private FileModel File;

    public FileModel getFile() {
        return File;
    }

    public void setFile(FileModel file) {
        File = file;
    }
}
