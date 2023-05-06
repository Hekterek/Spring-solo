package com.example.springsolo.controllers;

import com.example.springsolo.models.Product;
import com.example.springsolo.models.productCategory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.springsolo.services.CategoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductCategoryController {

    CategoryService service;

    ProductCategoryController(CategoryService service) {
        this.service = service;
    }

    @GetMapping("/categories")
    public String showCategories(Model model) {
        model.addAttribute("db", service.allCategories());
        return "category/categories";
    }

    @GetMapping("/removeCategory")
    public String removeCategory(@RequestParam Integer categoryId) {
        service.removeCategory(categoryId);
        return "redirect:/categories";
    }

    @GetMapping("/editCategory")
    public String editCategory(@RequestParam Integer categoryId) {

        return "";
    }


    @PostMapping("/addCategory")
    public String addCategory(productCategory category) {
        service.addCategory(category);
        return "redirect:/categories";
    }
}
