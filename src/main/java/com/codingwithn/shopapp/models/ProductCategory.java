package com.codingwithn.shopapp.models;

public class ProductCategory {
    private String productId;
    private String categoryId;

    public ProductCategory() {

    }

    public ProductCategory(String productId, String categoryId) {
        this.productId = productId;
        this.categoryId = categoryId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}