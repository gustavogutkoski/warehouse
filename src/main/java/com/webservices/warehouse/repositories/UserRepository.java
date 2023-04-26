package com.webservices.warehouse.repositories;

import com.webservices.warehouse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
