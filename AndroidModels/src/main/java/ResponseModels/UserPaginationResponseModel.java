package ResponseModels;

public class UserPaginationResponseModel {
    private int UserId ;

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    private int Page;

    public int getPage() {
        return Page;
    }

    public void setPage(int page) {
        Page = page;
    }

    private String SearchingUserName;

    public String getSearchingUserName() {
        return SearchingUserName;
    }

    public void setSearchingUserName(String searchingUserName) {
        SearchingUserName = searchingUserName;
    }
}
