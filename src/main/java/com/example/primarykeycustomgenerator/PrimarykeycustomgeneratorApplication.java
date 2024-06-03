package com.example.primarykeycustomgenerator;

import com.example.primarykeycustomgenerator.entity.Product;
import com.example.primarykeycustomgenerator.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class PrimarykeycustomgeneratorApplication implements CommandLineRunner {

	Logger logger = Logger.getLogger(getClass().getName());

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
		Product product1 = new Product();
		product1.setProductName("Google Pixel 8");
		product1.setProductDescription("A Pixel Mobile from Google");
		productRepository.save(product);
		productRepository.save(product1);
		logger.info("Product ID:- " + product.getProductId() + " " +
				"Product Name:- " + product.getProductName() + " " +
				"Product Description:- " + product.getProductDescription() + " " +
				"From Class:- " + product.getClass());
		logger.info("Product ID:- " + product1.getProductId() + " " +
				"Product Name:- " + product1.getProductName() + " " +
				"Product Description:- " + product1.getProductDescription() + " " +
				"From Class:- " + product1.getClass());
	}
}
