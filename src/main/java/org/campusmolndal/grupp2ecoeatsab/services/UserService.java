package org.campusmolndal.grupp2ecoeatsab.services;

import org.campusmolndal.grupp2ecoeatsab.models.User;
import org.campusmolndal.grupp2ecoeatsab.repositories.UserRepository;
public class UserService {
    private UserRepository userRepository;

    // Konstruktor för att skapa en ny UserService-instans
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Metod för att validera användaruppgifter
    public boolean validateUser(String username, String password) {
        // Hitta användaren baserat på användarnamn i databasen
        User user = userRepository.findUserByUsername(username);
        // Om användaren inte hittades eller lösenordet är felaktigt, returnera false
        return user != null && user.getPassword().equals(password);
    }

    // Metod för att skapa en ny användarprofil
    public void createUser(String username, String password, String email) {
        // Skapa en ny användarinstans
        User newUser = new User(username, password, email);
        // Spara den nya användaren i databasen
        userRepository.saveUser(newUser);
    }
}
