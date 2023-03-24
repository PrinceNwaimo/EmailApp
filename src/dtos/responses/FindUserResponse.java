package dtos.responses;

import data.models.User;

import java.util.ArrayList;
import java.util.List;

public class FindUserResponse {
    private String username;
    private String fullName;
    private String dateRegistered;


    private String emailAddress;
    private List<User> users = new ArrayList<>();

    @Override
    public String toString() {
        return "" +
                "username :'" + emailAddress + '\'' +
                ", fullName :'" + fullName + '\'' +
                ", dateRegistered='" + dateRegistered + '\'' +
                '}';
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
