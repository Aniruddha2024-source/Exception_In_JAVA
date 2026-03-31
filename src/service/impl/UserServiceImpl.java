package service.impl;

import entity.User;
import exception.InvalidEmailException;
import exception.UserAlreadyExistsException;
import exception.WeakPasswordException;
import service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void registerUser(User user)  {
        String email = user.getEmail();
        String password = user.getPassword();
        if(email==null || !email.contains("@")) {
            throw new InvalidEmailException("Invalid Email Format");
        }

        if(password == null || password.length() < 6) {
            throw new WeakPasswordException("Password must be at least 6 characters");
        }

        if(email.equals("admin@gmail.com")) {
            throw new UserAlreadyExistsException("User already exsist");
        }
    }
}
