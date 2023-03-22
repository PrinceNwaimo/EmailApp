package dtos.responses;

public class LoginUserResponse {
    private int userId;

    private  String username;

    private String password;

    private String fullName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    private String dateRegistered;

    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    @Override
    public String toString() {
        return "LoginUserResponse{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateRegistered='" + dateRegistered + '\'' +
                '}';
    }
}

