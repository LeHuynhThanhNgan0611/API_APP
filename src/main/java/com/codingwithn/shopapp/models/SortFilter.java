package com.codingwithn.shopapp.models;

public class SortFilter {
    private String id;
    private String name;

    public SortFilter() {
        // Constructor mặc định (cần cho Spring Boot khi sử dụng các model trong controller)
    }

    public SortFilter(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter và setter cho các thuộc tính
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
