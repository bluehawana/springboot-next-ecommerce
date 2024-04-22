package org.campusmolndal.grupp2ecoeatsab.services;

import org.campusmolndal.grupp2ecoeatsab.models.Product;
import org.campusmolndal.grupp2ecoeatsab.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


// Serviceklass för att hantera affärslogik för produkter
@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    // Hämta en produkt baserat på dess ID
    public Product getProductById(long productId) {

        return productRepository.findById(productId).orElse(null);  // Använd findById-metoden för att hitta produkten baserat på id

    }

    // Hämta alla produkter
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Metod för validering av produktinformation
    public boolean validateProduct(String name, double price, String description) {
        // Enkel validering: kontrollera om namn och beskrivning är ogiltiga
        return name != null && !name.isEmpty() && description != null && !description.isEmpty() && price > 0;
    }

    // Metod för att skapa en ny produkt
    public void createProduct(String name, double price, String description) {
        // Skapar ett nytt produktobjekt
        Product newProduct = new Product(name, price, description);
        // Sparar den nya produkten i databasen
        productRepository.save(newProduct);
    }
    // Metod för att lägga till en produkt i varukorgen
    public void addToCart(Product product) {
        System.out.println("Produkten " + product.getName() + " har lagts till i varukorgen.");

    }
}
