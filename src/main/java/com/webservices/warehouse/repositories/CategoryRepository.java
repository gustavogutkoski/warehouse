package com.webservices.warehouse.repositories;

import com.webservices.warehouse.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
