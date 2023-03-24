package controller;

import dtos.request.CreateEmailAccountRequest;
import dtos.request.LoginUser;
import dtos.responses.FindUserResponse;
import services.UserServices;
import services.UserServicesImplementation;

public class UserController {
//
    private UserServices userServices = new UserServicesImplementation();

public Object register(CreateEmailAccountRequest request) {
    try{
        return userServices.register(request);
    }catch (IllegalArgumentException ex){
        return ex.getMessage();
    }
}
public Object login(LoginUser request){
    try{
        return userServices.login(request);

    }catch(IllegalArgumentException ex){
        return ex.getMessage();
    }
}
public Object findUser(String firstName, String lastName){
    try{
        return userServices.findUser(firstName, lastName);
    }
    catch (IllegalArgumentException ex){
        return ex.getMessage();
    }

}

}
