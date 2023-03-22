package utilities;

import data.models.EmailAccount;
import data.models.Messages;
import dtos.request.CreateEmailAccountRequest;
import dtos.request.ComposeMailRequest;
import dtos.request.LoginUser;
import dtos.responses.LoginUserResponse;
import data.models.User;

import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Mapper {
    public static User map(CreateEmailAccountRequest registerRequest){
        User user = new User();
        user.setFirstName(registerRequest.getFirstName());
        user.setLastName(registerRequest.getLastName());
        user.getDateRegistered();
        user.setPassword(registerRequest.getPassword());
        user.setEmailAddress(registerRequest.getEmailAddress());
        return user;
    }
//    public static void map(CreateEmailAccountRequest registerRequest, User user){
//        user.setFirstName(registerRequest.getFirstName());
//        user.setLastName(registerRequest.getLastName());
//        user.getDateRegistered();
//        user.setPassword(registerRequest.getPassword());
//    }

    public static void mapAccount(User foundUser, LoginUser request){
        request.setEmailAddress(foundUser.getEmailAddress());
        request.getPassword();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, dd/MM/yyyy, hh:mm a");
//        request.getDateRegistered(formatter.format((TemporalAccessor) foundUser.getDateRegistered()));
    }

    public static void mapMessage(ComposeMailRequest createMessageRequest, EmailAccount emailAccount) {
        Messages messages = new Messages();
        messages.setBody(createMessageRequest.getBody());
        messages.setTitle(createMessageRequest.getTitle());
        messages.setReceiverEmailAddress(createMessageRequest.getReceiverEmailAddress());
    }

    private static String input(String type_your_message) {
        return "Thanks";
    }

    private static void mapInbox(String title,String body){
        Messages emailAccount = new Messages();
        emailAccount.setTitle(title);
        emailAccount.setBody(body);


    }
}
