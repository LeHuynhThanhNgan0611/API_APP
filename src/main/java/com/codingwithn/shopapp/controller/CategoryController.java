package com.codingwithn.shopapp.controller;

import com.codingwithn.shopapp.models.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class CategoryController {
    @GetMapping("/categories")
    public List<Category> getAllCategory() {
        // Tạo danh sách chứa các danh mục
        List<Category> categories = new ArrayList<>();

        // Thêm các danh mục vào danh sách
        categories.add(new Category("1", "Thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", null, true));
        categories.add(new Category("2", "Điện tử", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thietbidientu.png", null, true));
        categories.add(new Category("3", "Nội thất", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/noithat.png", null, true));
        categories.add(new Category("4", "Thời trang", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/quanao.png", null, true));
        categories.add(new Category("5", "Thú cưng", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thucung.png", null, true));
        categories.add(new Category("6", "Giày dép", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/giaydep.png", null, true));
        categories.add(new Category("7", "Làm đẹp", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/lamdep.png", null, true));
        categories.add(new Category("8", "Trang sức", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/trangsuc.png", null, true));
        categories.add(new Category("9", "Giày thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", "1", false));
        categories.add(new Category("10", "Quần áo thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", "1", false));
        categories.add(new Category("11", "Dụng cụ thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", "1", false));
        categories.add(new Category("12", "Nội thất phòng ngủ", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/noithat.png", "5", false));
        categories.add(new Category("13", "Nội thất nhà bếp", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/noithat.png", "5", false));
        categories.add(new Category("14", "Nội thất văn phòng", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/noithat.png", "5", false));
        categories.add(new Category("15", "Laptop", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thietbidientu.png", "2", false));
        categories.add(new Category("16", "Điện thoại", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thietbidientu.png", "2", false));
        categories.add(new Category("17", "Áo thun", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/quanao.png", "3", false));
        // Trả về danh sách các danh mục
        return categories;
    }
}
