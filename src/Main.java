import controller.EmailAccountController;
import controller.UserController;
import dtos.request.CreateEmailAccountRequest;
import dtos.request.ComposeMailRequest;
import dtos.request.LoginUser;
import dtos.responses.FindUserResponse;

import javax.swing.*;

public class Main {
    private static UserController userController = new UserController();

    private static EmailAccountController emailController = new EmailAccountController();
    public static void main(String[] args) {
        startApp();




    }
    private static void startApp(){
        String message = """
                Ababa Email APP
                1>>> Register
                2>>> Login
                3>>> Find Account
                4>>>Exit Application
                """;
        String input = input(message);
        switch (input.charAt(0)){
            case '1'-> register();
            case '2'-> login();
            case '3'-> findEmailAccount();
            case '4'-> exitApplication();
            default -> {
                display("Wrong selection");
                startApp();
                composeMail();

            }
        }

            }


            private static void displayAfterLogin(){

                String message = input("""
                        1 = Compose Mail
                        2 = Inbox
                        3 = Home Page
                        4 = Logout
                        5 = Close App""");

                switch (message.charAt(0)) {
                    case '1' -> composeMail();
                    case '2' -> inbox();
                    case '3', '4' -> startApp();
//                    case '5'--> trash();
                    case '5' -> exitApplication();
                }



            }

    private static  void display(String message){
        JOptionPane.showMessageDialog(null,message);

    }
    private static void register(){
        CreateEmailAccountRequest request = new CreateEmailAccountRequest();
        request.setFirstName(input("First name"));
        request.setLastName(input("Last Name"));
        request.setEmailAddress(input("Enter preferred email address"));
        request.setPassword(input("Enter your password"));
        request.getLocalDateTime();
        var user = userController.register(request);
//        display(user.toString());
        display(request.toString());
        display("Account created successfully");
        startApp();
    }
    public static String input (String prompt){return JOptionPane.showInputDialog(prompt);}

    private static void login(){
        LoginUser request = new LoginUser();
        request.setEmailAddress(input("Enter your email address"));
        request.setPassword(input("Enter your password"));
        var pick = userController.login(request);
        display("Welcome to your Email Box");
        displayAfterLogin();

    }
    private static void composeMail(){
        ComposeMailRequest compose = new ComposeMailRequest();
        compose.setTitle(input("Subject of Email"));
        compose.setBody(input("Type your Mail"));
        compose.setReceiverEmailAddress(input("Receiver's Email Address"));
        var message = emailController.composeMail(compose);
        display(compose.toString());
        display("Email has been sent ");
        displayAfterLogin();
    }
    private static void inbox() {
        EmailAccountController service = new EmailAccountController();
        var mail = emailController.inbox("Inbox");
//        services.inbox();
        display((String) emailController.inbox(String.valueOf(service)));
        displayAfterLogin();
    }
    private static void findEmailAccount(){
       String firstName = input("Please enter your first name");
        String lastName = input("Please enter your lastName");

        var userAccount = userController.findUser(firstName, lastName);
        display(userAccount.toString());
        login();

    }
    private static void trash(){

    }
    private static void exitApplication() {
       display("Thanks for using this application.");
        System.exit(1);
    }
}