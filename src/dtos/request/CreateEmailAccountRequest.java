package dtos.request;

import data.models.User;

import java.lang.constant.Constable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CreateEmailAccountRequest {
    private String firstName;

    private String lastName;
    private String username;
    private DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ");


    @Override
    public String toString() {
        return "CreateEmailAccountRequest{" +
                "\nFirstName : " + firstName + '\''+

                "\n LastName : " + lastName + '\''+

                "\n Password : " + password + '\'' +

                "\n EmailAddress : " + emailAddress + '\'' +

                "\n Date and Time Registered : " + dateRegistered +
                '}';
    }

    private String password;

    private String emailAddress;

    private LocalDateTime dateRegistered = LocalDateTime.now();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public LocalDateTime getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(LocalDateTime dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Constable getLocalDateTime() {
        return dateRegistered.format(formatter);
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.dateRegistered = localDateTime;
    }
}
