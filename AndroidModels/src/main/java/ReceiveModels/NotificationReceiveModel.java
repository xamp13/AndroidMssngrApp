package ReceiveModels;

public class NotificationReceiveModel {
    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    private String Message;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    private int FromUserId;

    public int getFromUserId() {
        return FromUserId;
    }

    public void setFromUserId(int fromUserId) {
        FromUserId = fromUserId;
    }

    private String FromUserName;

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    private FileModel UserPicture;

    public FileModel getUserPicture() {
        return UserPicture;
    }

    public void setUserPicture(FileModel userPicture) {
        UserPicture = userPicture;
    }
}
