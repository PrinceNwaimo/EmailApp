package data.models;

import java.time.LocalDateTime;

public class Messages{

    private int id;

    private String title;
    private String body;

    private int receiverEmailAddress;


    public int getId() {
        return id;
    }

    public int getReceiverEmailAddress() {
        return receiverEmailAddress;
    }

    public void setReceiverEmailAddress(int receiverEmailAddress) {
        this.receiverEmailAddress = receiverEmailAddress;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    public LocalDateTime getTimeReceived() {
        return timeReceived;
    }

    public void setTimeReceived(LocalDateTime timeReceived) {
        this.timeReceived = timeReceived;
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


    private String mail;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;

    }

    private LocalDateTime timeCreated = LocalDateTime.now();
    private LocalDateTime timeReceived = LocalDateTime.now();

    public void setUserID(int id) {
    }


    public void setReceiverEmailAddress(Object receiverEmailAddress) {
    }
}