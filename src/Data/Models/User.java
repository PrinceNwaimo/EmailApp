package data.models;

import java.lang.constant.Constable;

public class User {
    private int count;
    private String firstName;
    private String lastName;
    private String emailAddress;


    public Constable getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    private String password;

    private String dateRegistered;

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

//    public String getUserName() {
//        return emailAddress;
//    }

//    public void setUserName(String userName) {
//        this.emailAddress = emailAddress;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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



    public void setPassWord(String password) {
    }


    public void setId(int generateUserId) {
    }

    public int getId() {
        return count;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
