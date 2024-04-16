package com.codingwithn.shopapp.models;

import java.util.List;

public class ProductAttribute {
    private String name;
    private List<String> values;

    public ProductAttribute(String name, List<String> values) {
        this.name = name;
        this.values = values;
    }

    // Constructor mặc định (cần cho Spring Boot khi sử dụng các model trong controller)
    public ProductAttribute() {
        this.name = "";
        this.values = null;
    }

    // Getter và setter cho các thuộc tính
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }
}
