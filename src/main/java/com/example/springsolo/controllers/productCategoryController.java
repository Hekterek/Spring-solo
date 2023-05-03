package com.example.springsolo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.springsolo.services.CategoryService;

@Controller
public class productCategoryController {

    CategoryService categoryService = new CategoryService();

    @GetMapping("/categories")
    public String showCategories(Model model) {
        model.addAttribute("db", categoryService.allCategories());
        return "category/categories";
    }

}
