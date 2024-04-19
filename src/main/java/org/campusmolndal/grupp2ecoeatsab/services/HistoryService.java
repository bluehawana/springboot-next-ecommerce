package org.campusmolndal.grupp2ecoeatsab.services;

import org.campusmolndal.grupp2ecoeatsab.models.History;
import org.campusmolndal.grupp2ecoeatsab.repositories.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {

    private final HistoryRepository historyRepository;

    @Autowired
    public HistoryService(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

    // Lägg till en historia
    public void addHistory(History history) {
        historyRepository.save(history);
    }

    // Hämta alla historier
    public List<History> getAllHistory() {
        return historyRepository.findAll();
    }

    // Hämta historik för en specifik användare
    public List<History> getHistoryByUserId(Long userId) {
        return historyRepository.findByUserId(userId);
    }
}
