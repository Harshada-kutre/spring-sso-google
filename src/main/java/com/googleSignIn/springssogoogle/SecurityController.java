package com.googleSignIn.springssogoogle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class SecurityController {
    @GetMapping("/")
    public String welcome(){
        return "welcome to google";
    }

    @GetMapping("/user")
    public Principal user(Principal principal){
        System.out.println("username : "+ principal.getName());
        return principal;
    }
}
