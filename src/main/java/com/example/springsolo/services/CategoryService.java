package com.example.springsolo.services;

import com.example.springsolo.models.productCategory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CategoryService {

    List<productCategory> database = new ArrayList<>();

    public CategoryService() {
        var c1 = new productCategory(1, "Laptopy", "Super fajne lapki");
        var c2 = new productCategory(2, "Komorki", "Super fajne komorki");
        var c3 = new productCategory(3, "Sluchawki", "Super fajne sluchawki");

        database.addAll(List.of(c1, c2, c3));
    }

    public List<productCategory> allCategories() {
        return database;
    }
    public void addCategory(productCategory category) {
        var nextId = 1;
        if(database.size() > 0) {
            var lastIndex = database.size() - 1;
            nextId = database.get(lastIndex).getId() + 1;
        }
        category.setId(nextId);
        database.add(category);
    }

    public void removeCategory(Integer categoryId) {
        database.removeIf(category -> category.getId().equals(categoryId));
    }
}
