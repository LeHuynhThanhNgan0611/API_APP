package com.codingwithn.shopapp.models;

public class Category {
    private Long id;
    private String name;
    private String image;
    private Long parentId;
    private boolean featured;

    public Category() {
        // Constructor mặc định (cần cho Spring Boot khi sử dụng các model trong controller)
    }

    public Category(Long id, String name, String image, Long parentId, boolean featured) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.parentId = parentId;
        this.featured = featured;
    }

    // Getter và setter cho các thuộc tính
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public boolean isFeatured() {
        return featured;
    }

    public void setFeatured(boolean featured) {
        this.featured = featured;
    }
}

