package com.example.springsolo.controllers;

import com.example.springsolo.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    ProductService productService = new ProductService();

@GetMapping("/")
    public String showProducts(Model model) {
        model.addAttribute("db", productService.findAllProducts());
        return "./products";
    }
}
