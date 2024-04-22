// ShoppingCart.java
package org.campusmolndal.grupp2ecoeatsab.models;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<Product, Integer> products;

    // Konstruktor för att skapa en ny instans av ShoppingCart
    public ShoppingCart() {
        this.products = new HashMap<>();
    }

    // Metod för att lägga till en produkt i varukorgen
    public void addProduct(Product product) {
        int quantity = products.getOrDefault(product, 0);
        products.put(product, quantity + 1);
    }

    // Metod för att ta bort en produkt från varukorgen
    public void removeProduct(Product product) {
        products.remove(product);
    }

    // Metod för att uppdatera en produkts kvantitet i varukorgen
    public void updateProductQuantity(Product product, int quantity) {
        if (quantity <= 0) {
            removeProduct(product);
        } else {
            products.put(product, quantity);
        }
    }

    // Metod för att rensa varukorgen
    public void clear() {
        products.clear();
    }

    // Metod för att beräkna den totala priset för produkterna i varukorgen
    public double calculateTotal() {
        double totalPrice = 0.0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            totalPrice += product.getPrice() * quantity;
        }
        return totalPrice;
    }
}
