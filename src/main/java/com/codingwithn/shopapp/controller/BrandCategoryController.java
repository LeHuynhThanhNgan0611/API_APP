package com.codingwithn.shopapp.controller;

import com.codingwithn.shopapp.models.BrandCategory;
import com.codingwithn.shopapp.models.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BrandCategoryController {
    @GetMapping("/brandCategories")
    public List<BrandCategory> getAllBrandCategory() {
        List<BrandCategory> brandCategories = new ArrayList<>();
        brandCategories.add(new BrandCategory("1", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png", "Nike", 265, true,
                List.of(
                        new Category("1", "Thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", null, true),
                        new Category("8", "Trang sức", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/trangsuc.png", null, true),
                        new Category("9", "Giày thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", "1", false),
                        new Category("10", "Quần áo thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", "1", false)
                )
        ));
        brandCategories.add(new BrandCategory("2", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/adidas.png", "Adidas", 95, true,
                List.of(
                        new Category("1", "Thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", null, true),
                        new Category("8", "Trang sức", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/trangsuc.png", null, true),
                        new Category("9", "Giày thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", "1", false),
                        new Category("10", "Quần áo thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", "1", false)
                )
        ));
        brandCategories.add(new BrandCategory("3", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/jordan.png", "Jordan", 36, true,
                List.of(
                        new Category("1", "Thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", null, true),
                        new Category("8", "Trang sức", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/trangsuc.png", null, true),
                        new Category("9", "Giày thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", "1", false),
                        new Category("10", "Quần áo thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", "1", false)
                )
        ));
        brandCategories.add(new BrandCategory("4", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/puma.png", "Puma", 65, true,
                List.of(
                        new Category("1", "Thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", null, true),
                        new Category("8", "Trang sức", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/trangsuc.png", null, true),
                        new Category("9", "Giày thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", "1", false),
                        new Category("10", "Quần áo thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", "1", false)
                )
        ));
        brandCategories.add(new BrandCategory("5", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/apple.png", "Apple", 16, true,
                List.of(
                        new Category("15", "Laptop", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thietbidientu.png", "2", false),
                        new Category("2", "Điện tử", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thietbidientu.png", null, true)
                )
        ));
        brandCategories.add(new BrandCategory("10", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/acer.png", "Acer", 36, false,
                List.of(
                        new Category("2", "Điện tử", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thietbidientu.png", null, true),
                        new Category("14", "Nội thất văn phòng", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/noithat.png", "3", false)
                        )
        ));
        brandCategories.add(new BrandCategory("6", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/zara.png", "Zara", 36, true,
                List.of(
                        new Category("3", "Nội thất", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/noithat.png", null, true),
                        new Category("16", "Điện thoại", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thietbidientu.png", "2", false)
                )
        ));
        brandCategories.add(new BrandCategory("7", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713280512/brand/samsung.png", "Samsung", 36, false,
                List.of(
                        new Category("2", "Điện tử", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thietbidientu.png", null, true)
                )
        ));
        brandCategories.add(new BrandCategory("8", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/kenwood.png", "Kenwood", 36, false,
                List.of(
                        new Category("5", "Thú cưng", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thucung.png", null, true),
                        new Category("11", "Dụng cụ thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", "1", false),
                        new Category("12", "Nội thất phòng ngủ", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/noithat.png", "3", false),
                        new Category("13", "Nội thất nhà bếp", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/noithat.png", "3", false)
                )
        ));
        brandCategories.add(new BrandCategory("9", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/ikea.png", "IKEA", 36, false,
                List.of(
                        new Category("5", "Thú cưng", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thucung.png", null, true),
                        new Category("11", "Dụng cụ thể thao", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/thethao.png", "1", false),
                        new Category("12", "Nội thất phòng ngủ", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/noithat.png", "3", false),
                        new Category("13", "Nội thất nhà bếp", "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713259334/category/noithat.png", "3", false)
                )
        ));
        return brandCategories;
    }
}
