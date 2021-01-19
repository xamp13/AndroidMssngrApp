package ReceiveModels;

import java.util.List;

public class ChatReceiveModel {
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

    private int CountUsers;

    public int getCountUsers() {
        return CountUsers;
    }

    public void setCountUsers(int countUsers) {
        CountUsers = countUsers;
    }

    private List<ChatUserReceiveModel> ChatUsers;

    public List<ChatUserReceiveModel> getChatUsers() {
        return ChatUsers;
    }

    public void setChatUsers(List<ChatUserReceiveModel> chatUsers) {
        ChatUsers = chatUsers;
    }
}
