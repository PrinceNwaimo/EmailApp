package dtos.request;

public class ComposeMailRequest {


    private String title;

    private String body;

    private String receiverEmailAddress;




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

    public Object getReceiverEmailAddress() {
        return receiverEmailAddress;
    }

    public void setReceiverEmailAddress(String receiverEmailAddress) {
        this.receiverEmailAddress = receiverEmailAddress;

    }

    @Override
    public String toString() {
        return "composeMailRequest{" +

                "\n Subject: " + title + '\'' +

                "\n Body: " + body + '\'' +

                "\n Receiver'sEmailAddress: " + receiverEmailAddress + '\'' +

                '}';
    }



}
