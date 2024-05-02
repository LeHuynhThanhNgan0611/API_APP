package com.codingwithn.shopapp.models;

import java.util.List;

public class ProductBrand {
    private String brandId;
    private String brandImage;
    private String brandName;
    private int productsCount;
    private boolean featured;
    private List<Product> products;

    public ProductBrand(String brandId, String brandImage, String brandName, int productsCount, boolean featured, List<Product> products) {
        this.brandId = brandId;
        this.brandImage = brandImage;
        this.brandName = brandName;
        this.productsCount = productsCount;
        this.featured = featured;
        this.products = products;
    }

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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "ProductBrand{" +
                "brandId='" + brandId + '\'' +
                ", brandImage='" + brandImage + '\'' +
                ", brandName='" + brandName + '\'' +
                ", productsCount=" + productsCount +
                ", featured=" + featured +
                ", products=" + products +
                '}';
    }
}
