package com.example.primarykeycustomgenerator.repository;

import com.example.primarykeycustomgenerator.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
