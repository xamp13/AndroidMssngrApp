package ResponseModels;

import androidx.annotation.Nullable;

public class NotificationResponseModel {
    @Nullable
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

    private int ToUserId;

    public int getToUserId() {
        return ToUserId;
    }

    public void setToUserId(int toUserId) {
        ToUserId = toUserId;
    }

    private boolean IsAccepted;

    public boolean isAccepted() {
        return IsAccepted;
    }

    public void setAccepted(boolean accepted) {
        IsAccepted = accepted;
    }

}
