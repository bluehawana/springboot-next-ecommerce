// ShoppingCartController.java
package org.campusmolndal.grupp2ecoeatsab.controllers;

import org.campusmolndal.grupp2ecoeatsab.models.Product;
import org.campusmolndal.grupp2ecoeatsab.models.ShoppingCart;
import org.campusmolndal.grupp2ecoeatsab.services.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shopping-cart")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    @Autowired
    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    // Metod för att lägga till en produkt i varukorgen
    @PostMapping("/add")
    public ResponseEntity<String> addToCart(@RequestBody ShoppingCart shoppingCart, @RequestBody Product product) {
        shoppingCartService.addToCart(shoppingCart, product);
        return ResponseEntity.ok("Produkten har lagts till i varukorgen.");
    }

    // Metod för att ta bort en produkt från varukorgen
    @DeleteMapping("/remove")
    public ResponseEntity<String> removeFromCart(@RequestBody ShoppingCart shoppingCart, @RequestBody Product product) {
        shoppingCartService.removeFromCart(shoppingCart, product);
        return ResponseEntity.ok("Produkten har tagits bort från varukorgen.");
    }

    // Metod för att uppdatera en produkts kvantitet i varukorgen
    @PutMapping("/update")
    public ResponseEntity<String> updateProductQuantity(@RequestBody ShoppingCart shoppingCart, @RequestBody Product product, @RequestParam int quantity) {
        shoppingCartService.updateProductQuantity(shoppingCart, product, quantity);
        return ResponseEntity.ok("Produktens kvantitet i varukorgen har uppdaterats.");
    }

    // Metod för att rensa varukorgen
    @DeleteMapping("/clear")
    public ResponseEntity<String> clearCart(@RequestBody ShoppingCart shoppingCart) {
        shoppingCartService.clearCart(shoppingCart);
        return ResponseEntity.ok("Varukorgen har rensats.");
    }
}
