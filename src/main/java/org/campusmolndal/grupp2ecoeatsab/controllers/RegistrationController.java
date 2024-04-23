package org.campusmolndal.grupp2ecoeatsab.controllers;

import org.campusmolndal.grupp2ecoeatsab.models.Registration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController {

    // Metod för att skapa en ny användarregistrering
    @PostMapping("/create")
    public ResponseEntity<String> createRegistration(@RequestBody Registration registration) {
        // Validera registreringsuppgifterna
        if (!isValidRegistration(registration)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid registration data");
        }


        // Returnera ett lämpligt svar beroende på om registreringen skapades eller inte
        return ResponseEntity.status(HttpStatus.CREATED).body("Registration created successfully");
    }

    // Metod för validering av registreringsuppgifter
    private boolean isValidRegistration(Registration registration) {
        // Kontrollera om alla obligatoriska fält är ifyllda
        return registration.getUsername() != null && !registration.getUsername().isEmpty() &&
                registration.getPassword() != null && !registration.getPassword().isEmpty() &&
                registration.getEmail() != null && !registration.getEmail().isEmpty();
    }
}
