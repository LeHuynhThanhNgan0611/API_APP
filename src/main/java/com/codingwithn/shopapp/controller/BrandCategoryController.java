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
        brandCategories.add(new BrandCategory("1", "1"));
        brandCategories.add(new BrandCategory("1", "8"));
        brandCategories.add(new BrandCategory("1", "9"));
        brandCategories.add(new BrandCategory("1", "10"));
        brandCategories.add(new BrandCategory("2", "1"));
        brandCategories.add(new BrandCategory("2", "8"));
        brandCategories.add(new BrandCategory("2", "9"));
        brandCategories.add(new BrandCategory("2", "10"));
        brandCategories.add(new BrandCategory("3", "1"));
        brandCategories.add(new BrandCategory("3", "8"));
        brandCategories.add(new BrandCategory("3", "9"));
        brandCategories.add(new BrandCategory("3", "10"));
        brandCategories.add(new BrandCategory("4", "1"));
        brandCategories.add(new BrandCategory("4", "8"));
        brandCategories.add(new BrandCategory("4", "9"));
        brandCategories.add(new BrandCategory("4", "10"));
        brandCategories.add(new BrandCategory("5", "15"));
        brandCategories.add(new BrandCategory("5", "2"));
        brandCategories.add(new BrandCategory("10", "2"));
        brandCategories.add(new BrandCategory("10", "14"));
        brandCategories.add(new BrandCategory("6", "3"));
        brandCategories.add(new BrandCategory("6", "16"));
        brandCategories.add(new BrandCategory("7", "2"));
        brandCategories.add(new BrandCategory("8", "5"));
        brandCategories.add(new BrandCategory("8", "11"));
        brandCategories.add(new BrandCategory("8", "12"));
        brandCategories.add(new BrandCategory("8", "13"));
        brandCategories.add(new BrandCategory("9", "5"));
        brandCategories.add(new BrandCategory("9", "11"));
        brandCategories.add(new BrandCategory("9", "12"));
        brandCategories.add(new BrandCategory("9", "13"));

        // Trả về danh sách các cặp thương hiệu và danh mục
        return brandCategories;
    }
}
