// ProfileController.java
package org.campusmolndal.grupp2ecoeatsab.controllers;

import org.campusmolndal.grupp2ecoeatsab.models.Profile;
import org.campusmolndal.grupp2ecoeatsab.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profiler")
public class ProfileController {

    private final ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    // Metod för att skapa eller uppdatera en profil
    @PostMapping("/skapa")
    public ResponseEntity<String> skapaUppdateraProfil(@RequestBody Profile profile) {
        profileService.createOrUpdateProfile(profile);
        return ResponseEntity.ok("Profilen har skapats eller uppdaterats.");
    }

}
