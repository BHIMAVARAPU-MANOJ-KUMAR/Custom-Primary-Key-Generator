package com.example.primarykeycustomgenerator;

import com.example.primarykeycustomgenerator.entity.Product;
import com.example.primarykeycustomgenerator.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimarykeycustomgeneratorApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(PrimarykeycustomgeneratorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product product = new Product();
		product.setProductName("Samsung Galaxy Tab S9 Ultra");
		product.setProductDescription("Samsung Galaxy Tab S9 - FlagShip Segment");
		productRepository.save(product);
		System.out.println(product.getProductId() + " " + product.getProductName() + " " + product.getProductDescription() + " " + product.getClass());
	}
}
