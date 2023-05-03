package com.example.springsolo.services;

import com.example.springsolo.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    List<Product> database = new ArrayList<>();

    public ProductService() {
        var p1 = new Product(
                1,
                "Huawei mate 20 pro",
                "Opis telefonu",
                "https://d1eh9yux7w8iql.cloudfront.net/product_images/353523_ed0942f7-85ed-4f6a-b8e5-e548e3de1142.jpg");

        var p2 = new Product(
                2,
                "Asus Strix",
                "Opis laptopa",
                "https://dlcdnwebimgs.asus.com/gain/3E266260-8939-41ED-A42D-1CEEC7CA410D");

        database.addAll(List.of(p1, p2));
    }

    public List<Product> AllProducts() {
        return database;
    }
    public void removeProduct(Integer productId) {
        database.removeIf(product -> product.getId().equals(productId));
    }

    public void saveProduct(Product product) {

        var nextId = 1;

        if(database.size() > 0) {
            var lastIndex = database.size() - 1;
            nextId = database.get(lastIndex).getId() + 1;
        }

        product.setId(nextId);
        database.add(product);
    }

    public Product findProductById(Integer id) {
        var productInList = database.stream()
                .filter(dbProduct -> dbProduct.getId().equals(id))
                .toList();
        return productInList.get(0);
    }

    public void updateProduct(Integer productId, Product editedProduct) {
        editedProduct.setId(productId);
        database = database.stream()
                .filter(product -> !product.getId().equals(productId))
                .collect(Collectors.toList());
        database.add(editedProduct);
    }


}
