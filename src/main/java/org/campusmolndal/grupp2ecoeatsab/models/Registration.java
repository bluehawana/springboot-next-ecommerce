package org.campusmolndal.grupp2ecoeatsab.models;

public class Registration {

    private String username;
    private String password;
    private String email;

    public Registration() {
    }

    // Getter-metod för användarnamn
    public String getUsername() {
        return username;
    }

    // Setter-metod för användarnamn
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter-metod för lösenord
    public String getPassword() {
        return password;
    }

    // Setter-metod för lösenord
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter-metod för e-post
    public String getEmail() {
        return email;
    }

    // Setter-metod för e-post
    public void setEmail(String email) {
        this.email = email;
    }
}
