package data.repository;

import data.models.Messages;

import java.util.ArrayList;
import java.util.List;

public class MailRepositoryImplementation implements MailRepository{

    private int count;
    private int id;

    private List<Messages> messages = new ArrayList<>();
    @Override
    public Messages save(Messages messages) {
        boolean mailHasNotBeenSaved = messages.getId() == 0;
        if (mailHasNotBeenSaved) saveNew(messages);
        messages.setId(generateMailID());
        this.messages.add(messages);
        count++;
        return messages;
    }

    private void saveNew(Messages messages) {
        this.messages.add(messages);
        messages.setId(generateMailID());
    }

    private int generateMailID() {
        return count +1;
    }

    @Override
    public Messages findById(int id) {
        return null;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public List<Messages> findAll() {
        return null;
    }

    @Override
    public void delete(Messages messages) {
        for (Messages Messages : this.messages) {
            if (messages.getId() == id) {
                this.messages.remove(messages);
                count--;
                break;
            }
            }
            }

    @Override
    public void delete(int id) {
        for (Messages messages : this.messages) {
            if (messages.getId() == id) {
                this.messages.remove(messages);
                count--;
                break;

            }
        }
    }
    @Override
    public void deleteAll() {
        messages.clear();
        count = 0;

    }
}
