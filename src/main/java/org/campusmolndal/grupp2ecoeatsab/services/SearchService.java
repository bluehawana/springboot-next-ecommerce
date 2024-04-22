package org.campusmolndal.grupp2ecoeatsab.services;

import org.campusmolndal.grupp2ecoeatsab.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {

    // Metod för att söka efter produkter baserat på en sökterm
    public List<Product> searchProducts(String searchTerm) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Produkt 1", 10.0, "Beskrivning av produkt 1"));
        productList.add(new Product("Produkt 2", 20.0, "Beskrivning av produkt 2"));
        productList.add(new Product("Produkt 3", 30.0, "Beskrivning av produkt 3"));

        return productList;
    }
}
// Her kan vi implementera logiken för att söka efter produkter baserat på söktermen
// Till exempel kan denna metod anropa en ProductRepository för att hämta produkter från en databas
