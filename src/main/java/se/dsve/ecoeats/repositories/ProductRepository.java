package se.dsve.ecoeats.repositories;

import se.dsve.ecoeats.models.Product;
import se.dsve.ecoeats.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByEmail(String email);
}