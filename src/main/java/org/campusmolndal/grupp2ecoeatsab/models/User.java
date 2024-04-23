package org.campusmolndal.grupp2ecoeatsab.models;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;

    public User() {
    }
    // Konstruktor för att skapa en ny användarinstans med givna uppgifter
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Getter-metod för användarnamn
    public String getUsername() {
        return this.username;
    }

    // Setter-metod för användarnamn
    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    // Getter-metod för lösenord
    public String getPassword() {
        return this.password;
    }

    // Setter-metod för lösenord
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    // Getter-metod för e-post
    public String getEmail() {
        return this.email;
    }

    // Setter-metod för e-post
    public void setEmail(String newEmail) {
        this.email = newEmail;
    }
}
