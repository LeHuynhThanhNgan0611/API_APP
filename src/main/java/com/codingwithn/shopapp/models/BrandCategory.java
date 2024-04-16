package com.codingwithn.shopapp.models;

public class BrandCategory {
    private Long brandId;
    private Long categoryId;

    public BrandCategory() {
        // Constructor mặc định (cần cho Spring Boot khi sử dụng các model trong controller)
    }

    public BrandCategory(Long brandId, Long categoryId) {
        this.brandId = brandId;
        this.categoryId = categoryId;
    }

    // Getter và setter cho các thuộc tính
    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
