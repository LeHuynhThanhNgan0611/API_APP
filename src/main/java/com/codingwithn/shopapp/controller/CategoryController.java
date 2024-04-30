package com.codingwithn.shopapp.controller;

import com.codingwithn.shopapp.models.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {
    private List<Category> categories;

    public CategoryController() {
        // Khởi tạo danh sách chứa các danh mục
        this.categories = new ArrayList<>();
        // Thêm các danh mục vào danh sách
        categories.add(new Category("1", "Thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", null, true));
        categories.add(new Category("2", "Điện tử", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thietbidientu.png", null, true));
        categories.add(new Category("3", "Nội thất", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/noithat.png", null, true));
        categories.add(new Category("4", "Thời trang", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/quanao.png", null, true));
        categories.add(new Category("5", "Thú cưng", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thucung.png", null, true));
        categories.add(new Category("6", "Giày dép", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/giaydep.png", null, true));
        categories.add(new Category("7", "Làm đẹp", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/lamdep.png", null, true));
        categories.add(new Category("8", "Trang sức", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/trangsuc.png", null, true));

        // Thêm children array cho danh mục "Thể thao"
        this.addSubcategories();
    }

    private void addSubcategories() {
        for (Category category : this.categories) {
            switch (category.getId()) {
                case "1":
                    category.setChildren(getSportSubcategories());
                    break;
                case "2":
                    category.setChildren(getEletricSubcategories());
                    break;
                case "4":
                    category.setChildren(getFashionSubcategories());
                    break;
                case "3":
                    category.setChildren(getFutureSubcategories());
                    break;
                default:
                    break;
            }
        }
    }

    private List<Category> getSportSubcategories() {
        List<Category> sportSubcategories = new ArrayList<>();
        sportSubcategories.add(new Category("9", "Giày thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", "1", false));
        sportSubcategories.add(new Category("10", "Quần áo thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", "1", false));
        sportSubcategories.add(new Category("11", "Dụng cụ thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", "1", false));
        // Thêm danh sách con khác nếu cần
        return sportSubcategories;
    }

    private List<Category> getEletricSubcategories() {
        List<Category> electricSubcategories = new ArrayList<>();
        electricSubcategories.add(new Category("15", "Laptop", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thietbidientu.png", "2", false));
        electricSubcategories.add(new Category("16", "Điện thoại", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thietbidientu.png", "2", false));
        // Thêm danh sách con khác nếu cần
        return electricSubcategories;
    }

    private List<Category> getFashionSubcategories() {
        List<Category> fashionSubcategories = new ArrayList<>();
        fashionSubcategories.add(new Category("17", "Áo thun", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/quanao.png", "4", false));
        // Thêm danh sách con khác nếu cần
        return fashionSubcategories;
    }
    private List<Category> getFutureSubcategories() {
        List<Category> futureSubcategories = new ArrayList<>();
        futureSubcategories.add(new Category("12", "Nội thất phòng ngủ", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/noithat.png", "3", false));
        futureSubcategories.add(new Category("13", "Nội thất nhà bếp", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/noithat.png", "3", false));
        futureSubcategories.add(new Category("14", "Nội thất văn phòng", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/noithat.png", "3", false));
        // Thêm danh sách con khác nếu cần
        return futureSubcategories;
    }

    // Phương thức lấy category bằng id
    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categories;
    }
    @GetMapping("/category/{id}")
    public Category getCategoryById(@PathVariable String id) {
        // Duyệt danh sách để tìm category có id trùng khớp
        for (Category category : this.categories) {
            if (category.getId().equals(id)) {
                // Gọi phương thức để lấy tất cả các category con của category này
                List<Category> children = getChildren(category);
                // Gán danh sách category con vào category trả về
                category.setChildren(children);
                return category; // Trả về category nếu id trùng khớp
            }
        }
        return null; // Trả về null nếu không tìm thấy category
    }

    // Phương thức đệ quy để lấy tất cả các category con của một category
    private List<Category> getChildren(Category parent) {
        List<Category> children = new ArrayList<>();
        // Duyệt danh sách các danh mục
        for (Category category : this.categories) {
            // Nếu danh mục có parentId trùng khớp với id của parent
            if (category.getParentId() != null && category.getParentId().equals(parent.getId())) {
                // Thêm category vào danh sách children của parent
                children.add(category);
                // Gọi đệ quy để lấy tất cả các category con của category này
                List<Category> subChildren = getChildren(category);
                // Thêm tất cả các category con vào danh sách children
                children.addAll(subChildren);
            }
        }
        return children;
    }
}