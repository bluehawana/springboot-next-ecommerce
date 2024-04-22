package org.campusmolndal.grupp2ecoeatsab.controllers;

import org.campusmolndal.grupp2ecoeatsab.models.Product;
import org.campusmolndal.grupp2ecoeatsab.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


// Kontrollerklass för att hantera HTTP-förfrågningar relaterade till produkter
@RestController
@RequestMapping("/api/produkter")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    // Hämta produktinformation baserat på produktens ID
    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable Long productId) {
        Product product = productService.getProductById(productId);
        if (product != null) {
            return ResponseEntity.ok().body(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Metod för att lägga till en produkt i varukorgen
    @PostMapping("/läggTillIVarukorgen")
    public ResponseEntity<String> läggTillIVarukorgen(@RequestBody Product produkt) {

        // Returnera ett lämpligt svar beroende på om tillägget lyckades
        return ResponseEntity.status(HttpStatus.OK).body("Produkten har lagts till i varukorgen");
    }
}
