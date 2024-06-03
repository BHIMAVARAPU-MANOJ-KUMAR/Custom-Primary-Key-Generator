package com.example.primarykeycustomgenerator.service;

import com.example.primarykeycustomgenerator.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProductsList();
    Product saveProduct(Product product);
}
