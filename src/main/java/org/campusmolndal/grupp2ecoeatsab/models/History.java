package org.campusmolndal.grupp2ecoeatsab.models;

public class History {
    private String products;
    private String deliveryAddress;
    private User user; // Referens till användaren

    // Konstruktor för att skapa en ny instans av History med produkter och leveransadress
    public History(String products, String deliveryAddress, User user) {
        this.products = products;
        this.deliveryAddress = deliveryAddress;
        this.user = user; // Lägg till användaren i konstruktorn
    }

    // Getter-metod för produkter
    public String getProducts() {
        return products;
    }

    // Setter-metod för produkter
    public void setProducts(String products) {
        this.products = products;
    }

    // Getter-metod för leveransadress
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    // Setter-metod för leveransadress
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    // Getter-metod för användaren
    public User getUser() {
        return user;
    }

    // Setter-metod för användaren
    public void setUser(User user) {
        this.user = user;
    }
}
