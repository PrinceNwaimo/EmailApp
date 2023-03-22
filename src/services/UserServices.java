package services;

import dtos.request.CreateEmailAccountRequest;
import dtos.request.LoginUser;
import data.models.User;
import dtos.responses.FindUserResponse;

public interface UserServices {
    User register(CreateEmailAccountRequest registerRequest);


    LoginUser login(String username, String password);

    User sendEmail(String title,String body);

    User moveToTrash(String title);
    User register(String firstName, String lastName, String username, String password);

    void delete(User user);

    void delete(int id);


    User login(LoginUser request);

    FindUserResponse findUser(String firstName, String lastName);
}
