package org.campusmolndal.grupp2ecoeatsab.repositories;

import org.campusmolndal.grupp2ecoeatsab.models.History;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HistoryRepository {
    private Map<String, List<History>> historyDatabase; // Ændret typen til Map

    // Konstruktor för att skapa en ny HistoryRepository-instans
    public HistoryRepository() {
        this.historyDatabase = new HashMap<>();
    }

    // Metod för att spara en ny historik i databasen
    public void saveHistory(History history) {
        String username = history.getUser().getUsername(); // Antagelse: hver bruger har en unik brugernavn
        List<History> userHistory = historyDatabase.getOrDefault(username, new ArrayList<>());
        userHistory.add(history);
        historyDatabase.put(username, userHistory);
        System.out.println("Historik sparad i databasen för användare: " + username);
    }

    // Metod för att hitta historik for en bestemt bruger
    public List<History> findHistoryByUser(String username) {
        return historyDatabase.getOrDefault(username, new ArrayList<>());
    }
}
