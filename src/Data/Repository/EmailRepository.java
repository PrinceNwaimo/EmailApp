package data.repository;


import data.models.EmailAccount;

import java.util.List;

public interface EmailRepository {
    EmailAccount save(EmailAccount email);

    EmailAccount findById(int id);

    long count();

    List<EmailAccount> findAll();

    void delete(EmailAccount email);

    void delete(int id);

    void deleteAll();
}

