package com.example.springsolo.controllers;

import com.example.springsolo.models.Product;
import com.example.springsolo.models.productCategory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.springsolo.services.CategoryService;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductCategoryController {

    CategoryService categoryService = new CategoryService();

    @GetMapping("/categories")
    public String showCategories(Model model) {
        model.addAttribute("db", categoryService.allCategories());
        return "category/categories";
    }

    @PostMapping("/addCategory")
    public String addCategory(productCategory category) {
        categoryService.addCategory(category);
        return "redirect:/categories";
    }
}
