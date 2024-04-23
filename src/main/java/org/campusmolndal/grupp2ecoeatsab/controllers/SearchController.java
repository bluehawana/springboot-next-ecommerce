package org.campusmolndal.grupp2ecoeatsab.controllers;

import org.campusmolndal.grupp2ecoeatsab.models.Product;
import org.campusmolndal.grupp2ecoeatsab.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

    private final SearchService searchService;

    @Autowired
    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    // Endpoint för att söka efter produkter baserat på en sökterm
    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam String searchTerm) {
        List<Product> searchResults = searchService.searchProducts(searchTerm);
        return ResponseEntity.ok(searchResults);
    }
}
