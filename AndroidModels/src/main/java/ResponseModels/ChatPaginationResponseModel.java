package ResponseModels;

public class ChatPaginationResponseModel {
    private int ChatId ;
    private int Page ;

    public void setPage(int page) {
        Page = page;
    }

    public int getPage() {
        return Page;
    }

    public void setChatId(int chatId) {
        ChatId = chatId;
    }

    public int getChatId() {
        return ChatId;
    }
}
