package data.repository;


import data.models.EmailAccount;

import java.util.ArrayList;
import java.util.List;

public class EmailRepositoryImplementation implements EmailRepository{

    private List<EmailAccount>emails =new ArrayList<>();

    private int count;
    @Override
    public EmailAccount save(EmailAccount email) {
        boolean emailHasNotBeenSaved = email.getId() == 0;
        if (emailHasNotBeenSaved) saveNew(email);
        email.setId(generateEmailId());
        emails.add(email);
        count++;

        return email;
    }
    private void saveNew(EmailAccount email){
        email.setId(generateEmailId());
        emails.add(email);
    }

    private int generateEmailId() {return count +1;
    }

    @Override
    public EmailAccount findById(int id) {
        return null;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public List<EmailAccount> findAll() {
        return null;
    }

    @Override
    public void delete(EmailAccount email) {
        for (EmailAccount email1 : emails) {
            emails.remove(email);
            count --;
            break;

        }

    }
    @Override
    public void delete(int id) {

    }

    @Override
    public void deleteAll() {

    }
}
