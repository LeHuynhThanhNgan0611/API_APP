package com.codingwithn.shopapp.models;

public class Brand {
    private String id;
    private String image;
    private String name;
    private int productsCount;
    private boolean featured;

    public Brand() {
        // Constructor mặc định (cần cho Spring Boot khi sử dụng các model trong controller)
    }

    public Brand(String id, String image, String name, int productsCount, boolean featured) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.productsCount = productsCount;
        this.featured = featured;
    }

    // Getter và setter cho các thuộc tính
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
