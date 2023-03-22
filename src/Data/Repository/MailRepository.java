package data.repository;

import data.models.Messages;

import java.util.List;

public interface MailRepository {
    Messages save(Messages messages);

    Messages findById(int id);

    long count();

    List<Messages> findAll();

    void delete(Messages messages);

    void delete(int id);

    void deleteAll();

}
