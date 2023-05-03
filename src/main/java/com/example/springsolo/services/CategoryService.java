package com.example.springsolo.services;

import com.example.springsolo.models.productCategory;

import java.util.ArrayList;
import java.util.List;

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

}
