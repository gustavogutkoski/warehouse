package com.webservices.warehouse.repositories;

import com.webservices.warehouse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
