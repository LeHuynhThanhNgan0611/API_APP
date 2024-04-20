package com.codingwithn.shopapp.models;

import java.util.List;

public class Product {
    private String id;
    private int stock;
    private String sku;
    private double price;
    private String title;
    private String thumbnail;
    private double salePrice;
    private boolean isFeatured;
    private Brand brand;
    private String description;
    private String categoryId;
    private List<String> images;
    private String productType;
    private List<ProductAttribute> productAttributes;
    private List<ProductVariation> productVariations;

    public Product(String id, int stock, String sku, double price, String title, String thumbnail, Double salePrice, boolean isFeatured, Brand brand, String description, String categoryId, List<String> images, String productType, List<ProductAttribute> productAttributes, List<ProductVariation> productVariations) {
        this.id = id;
        this.stock = stock;
        this.sku = sku;
        this.price = price;
        this.title = title;
        this.thumbnail = thumbnail;
        this.salePrice = salePrice;
        this.isFeatured = isFeatured;
        this.brand = brand;
        this.description = description;
        this.categoryId = categoryId;
        this.images = images;
        this.productType = productType;
        this.productAttributes = productAttributes;
        this.productVariations = productVariations;
    }

    // Getter và setter cho các thuộc tính

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public boolean isFeatured() {
        return isFeatured;
    }

    public void setFeatured(boolean featured) {
        isFeatured = featured;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public List<ProductAttribute> getProductAttributes() {
        return productAttributes;
    }

    public void setProductAttributes(List<ProductAttribute> productAttributes) {
        this.productAttributes = productAttributes;
    }

    public List<ProductVariation> getProductVariations() {
        return productVariations;
    }

    public void setProductVariations(List<ProductVariation> productVariations) {
        this.productVariations = productVariations;
    }
}
