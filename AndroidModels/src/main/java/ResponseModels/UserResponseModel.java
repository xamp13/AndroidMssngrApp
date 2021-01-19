package ResponseModels;

import androidx.annotation.Nullable;

import com.example.androidmodels.Enums.City;
import com.example.androidmodels.Enums.Country;
import com.example.androidmodels.Enums.Gender;

import ReceiveModels.FileModel;

public class UserResponseModel {
    @Nullable
    private int Id ;

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    private String UserName ;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    private String Login;

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    private String Password;

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword() {
        return Password;
    }

    private String Name;

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    private String SecondName;

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public String getSecondName() {
        return SecondName;
    }

    @Nullable
    private Gender Gender;

    @Nullable
    public Gender getGender() {
        return Gender;
    }

    public void setGender(@Nullable Gender gender) {
        Gender = gender;
    }

    private String PhoneNumber;

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    @Nullable
    private Country Country;

    @Nullable
    public Country getCountry() {
        return Country;
    }

    public void setCountry(@Nullable Country country) {
        Country = country;
    }

    @Nullable
    private City City;

    @Nullable
    public City getCity() {
        return City;
    }

    public void setCity(@Nullable City city) {
        City = city;
    }

    private FileModel File;

    public void setFile(FileModel file) {
        File = file;
    }

    public FileModel getFile() {
        return File;
    }

    @Nullable
    private boolean IsOnline;

    public void setOnline(boolean online) {
        IsOnline = online;
    }

    public boolean isOnline() {
        return IsOnline;
    }
}
