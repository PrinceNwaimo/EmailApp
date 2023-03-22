package data.repository;

import data.models.EmailAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EmailRepositoryImplementationTest {

    private EmailRepository emailRepository;

    private EmailAccount email;

    @BeforeEach
    public void setup() {
        emailRepository = new EmailRepositoryImplementation();
        email = new EmailAccount();
        email.setId(1);
        email.setBody("Flame");
        email.setTitle("Fire");
        email.setDateCreated(LocalDateTime.now());

    }

    @Test
    public void saveEmailTest(){
        EmailAccount email = new EmailAccount();
        emailRepository.save(email);
        assertEquals(1,emailRepository.count());

    }
    @Test
    public void deleteEmailTest(){
        EmailAccount savedEmail = emailRepository.save( email);
        assertEquals(1,emailRepository.count());
        emailRepository.delete(email);
        assertEquals(0,emailRepository.count());
    }



}