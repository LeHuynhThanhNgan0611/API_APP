package com.codingwithn.shopapp.controller;

import com.codingwithn.shopapp.models.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BrandController {
    @GetMapping("/brands")
    public List<Brand> getAllBrand() {
        // Tạo danh sách chứa các thương hiệu
        List<Brand> brands = new ArrayList<>();

        // Thêm các thương hiệu vào danh sách
        brands.add(new Brand(1L, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png", "Nike", 265, true));
        brands.add(new Brand(2L, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/adidas.png", "Adidas", 95, true));
        brands.add(new Brand(8L, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/adidas.png", "Kenwood", 36, false));
        brands.add(new Brand(9L, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/adidas.png", "IKEA", 36, false));
        brands.add(new Brand(5L, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/apple.png", "Apple", 16, true));
        brands.add(new Brand(10L, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/acer.png", "Acer", 36, false));
        brands.add(new Brand(3L, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/jordan.png", "Jordan", 36, true));
        brands.add(new Brand(4L, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/puma.png", "Puma", 65, true));
        brands.add(new Brand(6L, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/zara.png", "Zara", 36, true));
        brands.add(new Brand(7L, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713280512/brand/samsung.png", "Samsung", 36, false));


        // Trả về danh sách các thương hiệu
        return brands;
    }
}
