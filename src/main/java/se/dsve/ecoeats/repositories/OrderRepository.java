package se.dsve.ecoeats.repositories;

import se.dsve.ecoeats.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}