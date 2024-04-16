package com.codingwithn.shopapp.models;

import java.util.Map;

public class ProductVariation {
    private Long id;
    private String sku;
    private String image;
    private String description;
    private double price;
    private double salePrice;
    private int stock;
    private Map<String, String> attributeValues;

    public ProductVariation(Long id, String sku, String image, String description, double price, double salePrice, int stock, Map<String, String> attributeValues) {
        this.id = id;
        this.sku = sku;
        this.image = image;
        this.description = description;
        this.price = price;
        this.salePrice = salePrice;
        this.stock = stock;
        this.attributeValues = attributeValues;
    }

    // Constructor mặc định (cần cho Spring Boot khi sử dụng các model trong controller)
    public ProductVariation() {
        this.id = 0L;
        this.sku = "";
        this.image = "";
        this.description = "";
        this.price = 0.0;
        this.salePrice = 0.0;
        this.stock = 0;
        this.attributeValues = null;
    }

    // Getter và setter cho các thuộc tính
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Map<String, String> getAttributeValues() {
        return attributeValues;
    }

    public void setAttributeValues(Map<String, String> attributeValues) {
        this.attributeValues = attributeValues;
    }
}
