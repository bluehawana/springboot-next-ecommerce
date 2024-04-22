package org.campusmolndal.grupp2ecoeatsab.controllers;// LoginController.java

import org.campusmolndal.grupp2ecoeatsab.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    // Metod för att hantera loginförfrågningar
    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticateUser(@RequestBody String username, @RequestBody String password) {
        boolean isAuthenticated = loginService.loginUser(username, password);
        if (isAuthenticated) {
            return ResponseEntity.ok("Användaren är inloggad.");
        } else {
            return ResponseEntity.badRequest().body("Felaktiga inloggningsuppgifter.");
        }
    }
}