package com.ramesh.java8coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
    
    private String name;
    private String category;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}

public class GroupingProductExample {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics"),
                new Product("Shirt", "Clothing"),
                new Product("Phone", "Electronics"),
                new Product("Jeans", "Clothing")
        );

        // Group products by category
        Stream<Product> stream = products.stream();
        Map<String, List<Product>> map = stream.collect(Collectors.groupingBy(Product::getCategory));
        System.out.println(map);
    }
}
