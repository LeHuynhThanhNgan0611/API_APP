package com.codingwithn.shopapp.controller;

import com.codingwithn.shopapp.models.BrandCategory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BrandCategoryController {
    @GetMapping("/brandCategories")
    public List<BrandCategory> getAllBrandCategory() {
        // Tạo danh sách chứa các cặp thương hiệu và danh mục
        List<BrandCategory> brandCategories = new ArrayList<>();

        // Thêm các cặp thương hiệu và danh mục vào danh sách
        brandCategories.add(new BrandCategory(1L, 1L));
        brandCategories.add(new BrandCategory(1L, 8L));
        brandCategories.add(new BrandCategory(1L, 9L));
        brandCategories.add(new BrandCategory(1L, 10L));
        brandCategories.add(new BrandCategory(2L, 1L));
        brandCategories.add(new BrandCategory(2L, 8L));
        brandCategories.add(new BrandCategory(2L, 9L));
        brandCategories.add(new BrandCategory(2L, 10L));
        brandCategories.add(new BrandCategory(3L, 1L));
        brandCategories.add(new BrandCategory(3L, 8L));
        brandCategories.add(new BrandCategory(3L, 9L));
        brandCategories.add(new BrandCategory(3L, 10L));
        brandCategories.add(new BrandCategory(4L, 1L));
        brandCategories.add(new BrandCategory(4L, 8L));
        brandCategories.add(new BrandCategory(4L, 9L));
        brandCategories.add(new BrandCategory(4L, 10L));
        brandCategories.add(new BrandCategory(5L, 15L));
        brandCategories.add(new BrandCategory(5L, 2L));
        brandCategories.add(new BrandCategory(10L, 2L));
        brandCategories.add(new BrandCategory(10L, 14L));
        brandCategories.add(new BrandCategory(6L, 3L));
        brandCategories.add(new BrandCategory(6L, 16L));
        brandCategories.add(new BrandCategory(7L, 2L));
        brandCategories.add(new BrandCategory(8L, 5L));
        brandCategories.add(new BrandCategory(8L, 11L));
        brandCategories.add(new BrandCategory(8L, 12L));
        brandCategories.add(new BrandCategory(8L, 13L));
        brandCategories.add(new BrandCategory(9L, 5L));
        brandCategories.add(new BrandCategory(9L, 11L));
        brandCategories.add(new BrandCategory(9L, 12L));
        brandCategories.add(new BrandCategory(9L, 13L));

        // Trả về danh sách các cặp thương hiệu và danh mục
        return brandCategories;
    }
}
