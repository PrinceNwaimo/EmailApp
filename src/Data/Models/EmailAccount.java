package data.models;

import java.time.LocalDateTime;
import java.util.List;

public class EmailAccount {

    private LocalDateTime  dateCreated = LocalDateTime.now();

    private int id;

    private String title;

    private String body;

    List<EmailAccount> emailAccounts;

    public List<EmailAccount> getEmailAccounts() {
        return emailAccounts;
    }

    public void setEmailAccounts(List<EmailAccount> emailAccounts) {
        this.emailAccounts = emailAccounts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
}
