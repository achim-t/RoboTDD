package net.lebit.robotdd.models;

/**
 * Created by ataeschner on 29.04.2016.
 */
public class Guest {
    private String Name;
    private String PhoneNumber;
    private String EmailAddress;
    private boolean IsCheckedIn;
    private String ProfileImagePath;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public boolean isCheckedIn() {
        return IsCheckedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        IsCheckedIn = checkedIn;
    }

    public String getProfileImagePath() {
        return ProfileImagePath;
    }

    public void setProfileImagePath(String profileImagePath) {
        ProfileImagePath = profileImagePath;
    }
}
