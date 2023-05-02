package com.webservices.warehouse.repositories;

import com.webservices.warehouse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
