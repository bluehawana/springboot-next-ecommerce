package org.campusmolndal.grupp2ecoeatsab.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "användare") // Namnet på tabellen i databasen
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Id för användaren

    private String användarnamn; // Användarens användarnamn

    private String lösenord; // Användarens lösenord

    @ManyToMany
    private Set<Role> roller; // Roller som tillhör användaren

    // Konstruktorer, getters och setters

    public User() {
    }

    public User(String användarnamn, String lösenord, Set<Role> roller) {
        this.användarnamn = användarnamn;
        this.lösenord = lösenord;
        this.roller = roller;
    }
}