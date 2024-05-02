package com.codingwithn.shopapp.models;

import java.util.List;

public class BrandCategory {
    private String brandId;
    private String brandImage;
    private String brandName;
    private int productsCount;
    private boolean featured;
    private List<Category> categories;

    public BrandCategory() {
        // Default constructor
    }

    public BrandCategory(String brandId, String brandImage, String brandName, int productsCount, boolean featured, List<Category> categories) {
        this.brandId = brandId;
        this.brandImage = brandImage;
        this.brandName = brandName;
        this.productsCount = productsCount;
        this.featured = featured;
        this.categories = categories;
    }

    // Getters and setters
    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandImage() {
        return brandImage;
    }

    public void setBrandImage(String brandImage) {
        this.brandImage = brandImage;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getProductsCount() {
        return productsCount;
    }

    public void setProductsCount(int productsCount) {
        this.productsCount = productsCount;
    }

    public boolean isFeatured() {
        return featured;
    }

    public void setFeatured(boolean featured) {
        this.featured = featured;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
