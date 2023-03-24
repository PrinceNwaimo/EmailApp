package services;

import data.repository.UserRepository;
import data.repository.UserRepositoryImplementation;
import dtos.request.CreateEmailAccountRequest;
import dtos.request.LoginUser;
import data.models.User;
import dtos.responses.FindUserResponse;
import dtos.responses.RegisterUserResponse;
import utilities.Mapper;

import java.util.Optional;

public class UserServicesImplementation implements UserServices{
    UserRepository userRepository = new UserRepositoryImplementation();
    @Override
    public User register(CreateEmailAccountRequest registerRequest) {
        if(userExists(registerRequest.getEmailAddress())) throw new IllegalArgumentException("User already exists");
        return userRepository.save(Mapper.map(registerRequest));
    }
    private boolean userExists(String emailAddress){
        User found = userRepository.findByEmailAddress(emailAddress);
        return found != null;
    }

    @Override
    public LoginUser login(String emailAddress, String password) {
      Optional <User> foundUser = Optional.ofNullable(userRepository.findByEmailAddress(emailAddress));
       if (foundUser.isEmpty())throw new NullPointerException("Email does not exist");
       LoginUser response = new LoginUser();
       Mapper.mapAccount(foundUser.get(),response);
           return response;
        }


    @Override
    public User sendEmail(String title, String body) {
        return null;
    }

    @Override
    public User moveToTrash(String title) {
        return null;
    }


    @Override
    public User register(String firstName, String lastName, String userName, String password) {
        return null;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public User login(LoginUser request) {
        return null;
    }
    public FindUserResponse findUser(String firstName, String lastName){
        User user = userRepository.findByFirstAndLastName(firstName, lastName);
        FindUserResponse response = new FindUserResponse();
        response.setFullName(user.getFirstName()+ user.getLastName());
        response.setEmailAddress(user.getEmailAddress());

        return response;
    }
}
