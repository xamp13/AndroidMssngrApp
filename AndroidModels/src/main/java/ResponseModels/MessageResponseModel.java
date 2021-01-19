package ResponseModels;

import androidx.annotation.Nullable;

import java.util.Date;

import ReceiveModels.FileModel;

public class MessageResponseModel {
    @Nullable
    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    private int FromUserId;

    public void setFromUserId(int fromUserId) {
        FromUserId = fromUserId;
    }

    public int getFromUserId() {
        return FromUserId;
    }

    private int ChatId;

    public int getChatId() {
        return ChatId;
    }

    public void setChatId(int chatId) {
        ChatId = chatId;
    }

    private Date Date;

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    private String UserMassage;

    public String getUserMassage() {
        return UserMassage;
    }

    public void setUserMassage(String userMassage) {
        UserMassage = userMassage;
    }

    private boolean IsReaded;

    public boolean isReaded() {
        return IsReaded;
    }

    public void setReaded(boolean readed) {
        IsReaded = readed;
    }

    private FileModel File;

    public void setFile(FileModel file) {
        File = file;
    }

    public FileModel getFile() {
        return File;
    }
}
