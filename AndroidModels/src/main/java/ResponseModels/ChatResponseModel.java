package ResponseModels;

import androidx.annotation.Nullable;

import java.util.Date;
import java.util.List;

public class ChatResponseModel {
    @Nullable
    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    private String ChatName;

    public String getChatName() {
        return ChatName;
    }

    public void setChatName(String chatName) {
        ChatName = chatName;
    }

    private int CreatorId;

    public int getCreatorId() {
        return CreatorId;
    }

    public void setCreatorId(int creatorId) {
        CreatorId = creatorId;
    }

    private Date DateOfCreation;

    public Date getDateOfCreation() {
        return DateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        DateOfCreation = dateOfCreation;
    }

    private List<ChatUserResponseModel> ChatUsers;

    public List<ChatUserResponseModel> getChatUsers() {
        return ChatUsers;
    }

    public void setChatUsers(List<ChatUserResponseModel> chatUsers) {
        ChatUsers = chatUsers;
    }
}
