package com.codingwithn.shopapp.models;

public class BrandCategory {
    private String brandId;
    private String categoryId;

    public BrandCategory() {
        // Constructor mặc định (cần cho Spring Boot khi sử dụng các model trong controller)
    }

    public BrandCategory(String brandId, String categoryId) {
        this.brandId = brandId;
        this.categoryId = categoryId;
    }

    // Getter và setter cho các thuộc tính
    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
