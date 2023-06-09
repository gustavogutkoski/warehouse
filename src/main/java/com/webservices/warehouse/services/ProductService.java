package com.webservices.warehouse.services;

import com.webservices.warehouse.entities.Product;
import com.webservices.warehouse.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> order = productRepository.findById(id);
        return order.get();
    }
}
