package data.repository;

import data.models.Messages;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class MessageRepositoryImplementationTest {
    private MailRepository mailRepository;

    private Messages messages;

    @BeforeEach
     public void setUp(){
        mailRepository = new MailRepositoryImplementation();
        messages = new Messages();
        messages.setMail("Compose");
        messages.setId(1);
        messages.setEmail_ID(1);
        messages.setUserID(1);

     }
     @Test
     public void saveMailTest(){
            mailRepository.save(messages);
     assertEquals(1, mailRepository.count());

 }

     @Test
     public void saveOneMail_findMailById() {
         Messages savedMessages = mailRepository.save(messages);
         assertEquals(1, savedMessages.getId());
         Messages foundMessages = mailRepository.findById(1);
         assertEquals(foundMessages, savedMessages);

     }
     @Test
     public void deleteMailsByIDTest(){
         Messages savedMessages = mailRepository.save(messages);
         assertEquals(1,mailRepository.count());
         mailRepository.delete(1);
         assertEquals(0,mailRepository.count());
     }
     @Test
     public void deleteMailTest(){
         Messages savedComment = mailRepository.save(messages);
         assertEquals(1,mailRepository.count());
         mailRepository.delete(messages);
         assertEquals(0,mailRepository.count());

     }
     @Test
     public void deleteAllMailsTest(){
         Messages savedMails = mailRepository.save(messages);
         savedMails = mailRepository.save(messages);
         assertEquals(2,mailRepository.count());
         mailRepository.deleteAll();
         assertEquals(0,mailRepository.count());
     }
     @Test
     public void findAllMailsTest(){
         Messages savedMessages = mailRepository.save(messages);
         assertEquals(1,mailRepository.count());
         mailRepository.findAll();
         assertEquals(1,mailRepository.count());
     }

}