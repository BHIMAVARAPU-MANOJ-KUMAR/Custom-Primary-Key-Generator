package com.example.primarykeycustomgenerator.service;

import com.example.primarykeycustomgenerator.entity.Product;
import com.example.primarykeycustomgenerator.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProductsList() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
