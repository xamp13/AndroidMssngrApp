package ReceiveModels;

import androidx.annotation.Nullable;

import com.example.androidmodels.Enums.City;
import com.example.androidmodels.Enums.Country;
import com.example.androidmodels.Enums.Gender;

public class UserReceiveModel {
    private int UserId;

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    private String UserName;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private String SecondName;

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
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

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Nullable
    private Country Country ;

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

    public FileModel getFile() {
        return File;
    }

    public void setFile(FileModel file) {
        File = file;
    }

    @Nullable
    private boolean IsOnline;

    public boolean isOnline() {
        return IsOnline;
    }

    public void setOnline(boolean online) {
        IsOnline = online;
    }
}
