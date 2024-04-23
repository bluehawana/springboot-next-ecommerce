package org.campusmolndal.grupp2ecoeatsab.controllers;

import org.campusmolndal.grupp2ecoeatsab.models.Product;
import org.campusmolndal.grupp2ecoeatsab.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("/history")
public class HistoryController {

    private final ProductService productService;

    @Autowired
    public HistoryController(ProductService productService) {
        this.productService = productService;
    }

    // Hämtar alla produkter från historiken
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
