package com.productcatalogsystem.productcatalogsystem.controller;

import com.productcatalogsystem.productcatalogsystem.dto.ProductDTO;
import com.productcatalogsystem.productcatalogsystem.entity.Product;
import com.productcatalogsystem.productcatalogsystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class WebController  {
    @Autowired
    ProductService productService;
    @GetMapping(value = "/home")
    public String home(){
        return "index";
    }
    @GetMapping(value = "/addProduct")
    public String addProduct(){
        return "addProduct";
    }

    @PostMapping(value = "/addProduct")
    public String addProduct(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "price") Long price,
            @RequestParam(value = "category") String category
    ){
        ProductDTO productDTO = ProductDTO.builder()
                .name(name)
                .price(price)
                .category(category)
                .build();
        productService.addProduct(productDTO);
        return "redirect:/home";
    }

    @GetMapping(value = "/displayProducts")
    public String displayProducts(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "displayProducts";
    }
}
