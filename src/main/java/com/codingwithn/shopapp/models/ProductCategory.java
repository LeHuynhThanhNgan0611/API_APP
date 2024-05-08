package com.codingwithn.shopapp.models;

import java.util.List;

public class ProductCategory {
    private String categoryId;
    private String name;
    private String image;
    private String parentId;
    private boolean featured;
    private List<Product> products;

    public ProductCategory() {
    }

    public ProductCategory(String categoryId, String name, String image, String parentId, boolean featured, List<Product> products) {
        this.categoryId = categoryId;
        this.name = name;
        this.image = image;
        this.parentId = parentId;
        this.featured = featured;
        this.products = products;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public boolean isFeatured() {
        return featured;
    }

    public void setFeatured(boolean featured) {
        this.featured = featured;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId='" + categoryId + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", parentId='" + parentId + '\'' +
                ", featured=" + featured +
                ", products=" + products +
                '}';
    }

    public String getId() {
        return categoryId;
    }
}
