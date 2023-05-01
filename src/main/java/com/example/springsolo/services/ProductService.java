package com.example.springsolo.services;

import com.example.springsolo.models.Product;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> database = new ArrayList<>();

    public ProductService() {
        var p1 = new Product(
                "Huawei mate 20 pro",
                "Opis telefonu",
                "https://d1eh9yux7w8iql.cloudfront.net/product_images/353523_ed0942f7-85ed-4f6a-b8e5-e548e3de1142.jpg");

        var p2 = new Product(
                "Asus Strix",
                "Opis laptopa",
                "https://dlcdnwebimgs.asus.com/gain/3E266260-8939-41ED-A42D-1CEEC7CA410D");

        database.addAll(List.of(p1, p2));
    }

    public List<Product> findAllProducts() {
        return database;
    }



}
