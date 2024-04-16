package com.codingwithn.shopapp.models;

public class SortFilter {
    private Long id;
    private String name;

    public SortFilter() {
        // Constructor mặc định (cần cho Spring Boot khi sử dụng các model trong controller)
    }

    public SortFilter(Long id, String name) {
        this.id = id;
        this.name = name;
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
}
