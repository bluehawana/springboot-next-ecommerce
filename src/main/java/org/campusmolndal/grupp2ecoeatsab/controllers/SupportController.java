package org.campusmolndal.grupp2ecoeatsab.controllers;

import org.campusmolndal.grupp2ecoeatsab.services.SupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/support")
public class SupportController {

    private final SupportService supportService;

    @Autowired
    public SupportController(SupportService supportService) {
        this.supportService = supportService;
    }

    // Metod för att hantera förfrågningar relaterade till kundsupport och FAQ
    @PostMapping("/query")
    public ResponseEntity<String> getSupportResponse(@RequestBody String query) {
        // Skicka förfrågan till supporttjänsten för hantering och få svar
        String response = supportService.getSupportResponse(query);
        // Returnera svar till klienten
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
