package com.springboot.simplewebapp.repository;

import com.springboot.simplewebapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
