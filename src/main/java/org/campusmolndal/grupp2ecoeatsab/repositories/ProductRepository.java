package org.campusmolndal.grupp2ecoeatsab.repositories;

import org.campusmolndal.grupp2ecoeatsab.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository för att interagera med databasen och hantera Product-entiteter
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Spring Data JPA kommer automatiskt att generera denna metod
}
