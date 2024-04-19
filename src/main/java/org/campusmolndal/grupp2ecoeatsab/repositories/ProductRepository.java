package org.campusmolndal.grupp2ecoeatsab.repositories;
import org.campusmolndal.grupp2ecoeatsab.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * En repository-gränssnitt för att hantera åtkomst till produktdata i databasen.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {



}
