// ShoppingCartService.java
package org.campusmolndal.grupp2ecoeatsab.services;

import org.campusmolndal.grupp2ecoeatsab.models.Product;
import org.campusmolndal.grupp2ecoeatsab.models.ShoppingCart;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {

    // Metod för att lägga till en produkt i varukorgen
    public void addToCart(ShoppingCart shoppingCart, Product product) {
        shoppingCart.addProduct(product);
    }

    // Metod för att ta bort en produkt från varukorgen
    public void removeFromCart(ShoppingCart shoppingCart, Product product) {
        shoppingCart.removeProduct(product);
    }

    // Metod för att uppdatera en produkts kvantitet i varukorgen
    public void updateProductQuantity(ShoppingCart shoppingCart, Product product, int quantity) {
        shoppingCart.updateProductQuantity(product, quantity);
    }

    // Metod för att rensa varukorgen
    public void clearCart(ShoppingCart shoppingCart) {
        shoppingCart.clear();
    }
}
