package com.example.primarykeycustomgenerator.entity;

import com.example.primarykeycustomgenerator.customgenerator.CustomProductIdGenerator;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "product")
@Setter
@Getter
public class Product {
    @Id
    @Column(name = "product_id", unique = true, updatable = false, nullable = false)
    @GeneratedValue(generator = "custom_uuid")
    @GenericGenerator(name = "custom_uuid", type = CustomProductIdGenerator.class)
    private String productId;
    @Column(name = "product_name", nullable = false)
    private String productName;
    @Column(name = "product_description", nullable = false)
    private String productDescription;
}
