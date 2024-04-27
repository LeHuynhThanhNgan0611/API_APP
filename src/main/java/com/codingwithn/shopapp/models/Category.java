package com.codingwithn.shopapp.models;
import java.util.List;
public class Category {
    private String id;
    private String name;
    private String image;
    private String parentId;
    private boolean featured;
    private List<Category> children;

    public Category() {
        // Constructor mặc định (cần cho Spring Boot khi sử dụng các model trong controller)
    }

    public Category(String id, String name, String image, String parentId, boolean featured) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.parentId = parentId;
        this.featured = featured;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public boolean isFeatured() {
        return featured;
    }

    public void setFeatured(boolean featured) {
        this.featured = featured;
    }

    public List<Category> getChildren() {
        return children;
    }

    public void setChildren(List<Category> children) {
        this.children = children;
    }
}
