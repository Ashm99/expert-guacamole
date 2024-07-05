package com.productcatalogsystem.productcatalogsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long price;
    private String category;
    @Column(nullable = false, columnDefinition = "datetime default current_timestamp")
    private Instant createdAt;
    @Column(nullable = false, columnDefinition = "datetime default current_timestamp")
    private Instant updatedAt;
}
