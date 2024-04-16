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
        categories.add(new Category(1L, "Thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", null, true));
        categories.add(new Category(2L, "Điện tử", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thietbidientu.png", null, true));
        categories.add(new Category(5L, "Nội thất", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/noithat.png", null, true));
        categories.add(new Category(3L, "Thời trang", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/quanao.png", null, true));
        categories.add(new Category(4L, "Thú cưng", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thucung.png", null, true));
        categories.add(new Category(6L, "Giày dép", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/giaydep.png", null, true));
        categories.add(new Category(7L, "Làm đẹp", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/lamdep.png", null, true));
        categories.add(new Category(14L, "Trang sức", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/trangsuc.png", null, true));
        categories.add(new Category(8L, "Giày thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", 1L, false));
        categories.add(new Category(9L, "Quần áo thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", 1L, false));
        categories.add(new Category(10L, "Dụng cụ thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", 1L, false));
        categories.add(new Category(11L, "Nội thất phòng ngủ", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/noithat.png", 5L, false));
        categories.add(new Category(12L, "Nội thất nhà bếp", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/noithat.png", 5L, false));
        categories.add(new Category(13L, "Nội thất văn phòng", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/noithat.png", 5L, false));
        categories.add(new Category(14L, "Laptop", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thietbidientu.png", 2L, false));
        categories.add(new Category(15L, "Điện thoại", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thietbidientu.png", 2L, false));
        categories.add(new Category(16L, "Áo thun", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/quanao.png", 3L, false));
        // Trả về danh sách các danh mục
        return categories;
    }
}
