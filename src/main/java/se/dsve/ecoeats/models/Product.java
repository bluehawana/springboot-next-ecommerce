package se.dsve.ecoeats.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private double price;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderProduct> orderItems = new ArrayList<>();
    public Product() {
    }

    public Product(Long id, String name, String description, double price, List<OrderProduct> orderItems) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.orderItems = orderItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<OrderProduct> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderProduct> orderItems) {
        this.orderItems = orderItems;
    }
}