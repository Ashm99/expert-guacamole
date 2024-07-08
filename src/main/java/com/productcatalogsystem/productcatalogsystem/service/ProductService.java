package com.productcatalogsystem.productcatalogsystem.service;

import com.productcatalogsystem.productcatalogsystem.entity.Product;
import com.productcatalogsystem.productcatalogsystem.dto.ProductDTO;
import com.productcatalogsystem.productcatalogsystem.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return (List<Product>) productRepository.findAll();
    }

    public Product addProduct(ProductDTO productDTO) {
        Instant currentInstant = Instant.now();

        Product prod = Product.builder()
                .name(productDTO.getName())
                .price(productDTO.getPrice())
                .category(productDTO.getCategory())
                .createdAt(currentInstant)
                .updatedAt(currentInstant)
                .build();

        return productRepository.save(prod);
    }
}
