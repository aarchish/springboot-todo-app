package com.jstech.springboot.todoapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {

        boolean isValidUserName = username.equalsIgnoreCase("aarchish");
        boolean isValidPassword = password.equalsIgnoreCase("password");
        if (isValidUserName && isValidPassword) return true;
        return false;
    }
}
