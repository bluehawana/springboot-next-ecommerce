package org.campusmolndal.grupp2ecoeatsab.repositories;

import org.campusmolndal.grupp2ecoeatsab.models.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UserRepository {
    private HashMap<String, User> userDatabase; //

    // Konstruktor för att skapa en ny UserRepository-instans
    public UserRepository() {
        this.userDatabase = new HashMap<>();
    }

    // Metod för att spara en ny användare i databasen
    public void saveUser(User user) {
        this.userDatabase.put(user.getUsername(), user);
        System.out.println("Användare sparad i databasen: " + user.getUsername());
    }

    // Metod för att hitta en användare baserad på användarnamn i databasen
    public User findUserByUsername(String username) {
        return this.userDatabase.get(username);
    }

}