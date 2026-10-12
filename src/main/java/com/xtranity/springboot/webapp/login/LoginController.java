package com.xtranity.springboot.webapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private AuthService authService;

    public LoginController(AuthService authService) {
        this.authService = authService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLoginPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String uname, @RequestParam String pass, ModelMap model) {
        if (authService.authentication(uname, pass)) {
            model.put("uname", uname);
            return "welcome";
        }
        model.put("errorMessage", "invalid username/password");
        return "login";
    }

}
