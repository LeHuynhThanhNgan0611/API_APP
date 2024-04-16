package com.codingwithn.shopapp.models;

import java.util.HashMap;
import java.util.Map;

public class Banner {
    private String imageUrl;
    private String targetRoute;

    public Banner() {
        // Constructor mặc định (cần cho Spring Boot khi sử dụng các model trong controller)
    }

    public Banner(String imageUrl, String targetRoute) {
        this.imageUrl = imageUrl;
        this.targetRoute = targetRoute;
    }

    // Getter và setter cho các thuộc tính
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTargetRoute() {
        return targetRoute;
    }

    public void setTargetRoute(String targetRoute) {
        this.targetRoute = targetRoute;
    }
}

