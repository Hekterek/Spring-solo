package com.example.springsolo.controllers;

import com.example.springsolo.models.Product;
import com.example.springsolo.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    ProductService productService = new ProductService();

    @GetMapping("/")
    public String showProducts(Model model) {
        model.addAttribute("db", productService.AllProducts());
        return "product/products";
    }

    @GetMapping("/removeProduct")
    public String removeProduct(@RequestParam Integer productId) {
        productService.removeProduct(productId);
        return "redirect:/";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(Product product) {
        productService.saveProduct(product);
        return "redirect:/";
    }

    @GetMapping ("/editProduct")
    public String editProduct(@RequestParam Integer productId, Model model) {
        model.addAttribute("product", productService.findProductById(productId));
        return "product/edit-product";
    }

    @PostMapping("/editedProduct")
    public String editedProduct(Product editedProduct, @RequestParam Integer productId) {
        productService.updateProduct(productId, editedProduct);
        return "redirect:/";
    }
}

