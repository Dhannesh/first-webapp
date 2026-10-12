package com.xtranity.springboot.webapp.login;

import org.springframework.stereotype.Service;

@Service 
public class AuthService {
    boolean authentication(String uname, String pass) {
        boolean isValidUname = uname.equalsIgnoreCase("dhanesh");
        boolean isValidPass = pass.equalsIgnoreCase("dummy");
        return isValidUname && isValidPass;
    }
}
