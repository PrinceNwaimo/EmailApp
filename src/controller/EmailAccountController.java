package controller;

import dtos.request.ComposeMailRequest;
import dtos.request.LoginUser;
import services.EmailAccountServiceImplementation;
import services.EmailAccountServices;

public class EmailAccountController {

    private EmailAccountServices emailAccountServices= new EmailAccountServiceImplementation();

    public Object composeMail(ComposeMailRequest request){
        return emailAccountServices.composeMail(request);
    }

    public Object inbox(String title){
        return emailAccountServices.inbox(title);
    }





}
