package org.campusmolndal.grupp2ecoeatsab.services;

import org.campusmolndal.grupp2ecoeatsab.models.Product;
import org.campusmolndal.grupp2ecoeatsab.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    // Injicera ProductRepository
    @Autowired
    private ProductRepository productRepository;

    // Metod för att hämta alla produkter
    // Returnerar en lista med alla produkter
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Metod för att hämta en specifik produkt med hjälp av dess id
    // Tar emot ett id och returnerar den matchande produkten om den finns, annars null
    public Product getProductById(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        return optionalProduct.orElse(null);
    }

    // Metod för att spara en ny produkt eller uppdatera en befintlig produkt
    // Tar emot en produkt och returnerar den sparade/uppdaterade produkten
    public Product saveOrUpdateProduct(Product product) {
        return productRepository.save(product);
    }

    // Metod för att ta bort en produkt med hjälp av dess id
    // Tar emot ett id och returnerar true om produkten har tagits bort, annars false
    public boolean deleteProductById(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
