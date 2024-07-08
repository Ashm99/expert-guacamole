package com.productcatalogsystem.productcatalogsystem.controller;

import com.productcatalogsystem.productcatalogsystem.dto.ProductDTO;
import com.productcatalogsystem.productcatalogsystem.entity.Product;
import com.productcatalogsystem.productcatalogsystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping(value = "/getAll")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @PostMapping(value = "/add")
    public Product addProduct(@RequestBody ProductDTO productDTO){
        return productService.addProduct(productDTO);
    }
}
