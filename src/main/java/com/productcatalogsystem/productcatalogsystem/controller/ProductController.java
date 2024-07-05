package com.productcatalogsystem.productcatalogsystem.controller;

import com.productcatalogsystem.productcatalogsystem.entity.Product;
import com.productcatalogsystem.productcatalogsystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping(value = "/getAll")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @PostMapping(value = "/add")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
}
