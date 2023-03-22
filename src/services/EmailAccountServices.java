package services;

import dtos.request.ComposeMailRequest;
import dtos.request.CreateEmailAccountRequest;
import data.models.EmailAccount;
import dtos.request.LoginUser;

public interface EmailAccountServices {

    EmailAccount composeMail(ComposeMailRequest createMessageRequest);
    EmailAccount inbox(String title);
    EmailAccount trash(String title);
    EmailAccount draft(String title);




}
