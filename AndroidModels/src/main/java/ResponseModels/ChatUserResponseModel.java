package ResponseModels;

public class ChatUserResponseModel {
    public int UserId;

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int ChatId;

    public void setChatId(int chatId) {
        ChatId = chatId;
    }

    public int getChatId() {
        return ChatId;
    }
}
