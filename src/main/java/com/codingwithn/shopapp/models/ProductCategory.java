package com.codingwithn.shopapp.models;

import java.util.List;

public class ProductCategory {
    private String categoryId;
    private List<Product> products;

    public ProductCategory(String categoryId, List<Product> productList) {
        this.categoryId = categoryId;
        this.products = productList;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
