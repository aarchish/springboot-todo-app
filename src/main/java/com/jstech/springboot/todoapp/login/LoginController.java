package com.jstech.springboot.todoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value="login", method = RequestMethod.GET)
    public String goToLoginPage() {
        return "login";
    }

    @RequestMapping(value="login", method = RequestMethod.POST)
    public String goToWelcomePage(
            @RequestParam String username, @RequestParam String password,
            ModelMap model) {

        if(authenticationService.authenticate(username, password)) {
            model.put("username", username);
            model.put("password", password);
            return "welcome";
        }

        model.put("errorMessage", "Invalid Username or Password");
        return "login";
    }
}
