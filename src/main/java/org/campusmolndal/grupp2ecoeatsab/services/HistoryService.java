package org.campusmolndal.grupp2ecoeatsab.services;

import org.campusmolndal.grupp2ecoeatsab.models.History;
import org.campusmolndal.grupp2ecoeatsab.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {

    // Tom konstruktör för att skapa en ny instans av HistoryService
    public HistoryService() {
    }

    // Metod för att hämta historiken för en given användare
    public List<History> getHistoryByUser(String userId) {
        // Implementera logiken för att hämta historiken för den angivna användaren från databasen eller annan lagring
        return null; // Tillfälligt returnera null
    }

    // Metod för att validera historikinformation
    public boolean validateHistory(String products, String deliveryAddress) {
        // Enkel validering: kontrollera om produkter och leveransadress är ogiltiga
        return products != null && !products.isEmpty() && deliveryAddress != null && !deliveryAddress.isEmpty();
    }

    // Metod för att skapa en ny historik
    public void createHistory(String products, String deliveryAddress, String username, String password, String email) {
        // Skapa en ny användarinstans
        User user = new User(username, password, email);
        // Skapa en ny instans av History med produkter, leveransadress och användaren
        History newHistory = new History(products, deliveryAddress, user);

    }
}
