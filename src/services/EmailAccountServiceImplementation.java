package services;

import data.repository.EmailRepository;
import data.repository.EmailRepositoryImplementation;
import dtos.request.ComposeMailRequest;
import dtos.request.CreateEmailAccountRequest;
import data.models.EmailAccount;
import dtos.request.LoginUser;
import utilities.Mapper;

public class EmailAccountServiceImplementation implements EmailAccountServices {
   EmailRepository emailRepository = new EmailRepositoryImplementation();

    @Override
    public EmailAccount composeMail(ComposeMailRequest createMessageRequest) {
        EmailAccount emailAccount = new EmailAccount();
        Mapper.mapMessage(createMessageRequest,emailAccount);
        return emailRepository.save(emailAccount);
    }

    @Override
    public EmailAccount inbox(String title ) {
        return (EmailAccount) emailRepository.findAll();
    }


    @Override
    public EmailAccount trash(String title) {
        return null;
    }

    @Override
    public EmailAccount draft(String title) {
        return null;
    }





}
