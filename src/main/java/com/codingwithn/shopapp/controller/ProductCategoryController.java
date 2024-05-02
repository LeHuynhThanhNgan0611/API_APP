package com.codingwithn.shopapp.controller;

import com.codingwithn.shopapp.models.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class ProductCategoryController {

    @GetMapping("/productCategories")
    public List<ProductCategory> getAllProductCategory() {
            // Initialize list of product categories
            List<ProductCategory> productCategories = new ArrayList<>();

            // Initialize list of products (Assuming this method is implemented)
            List<Product> products = initializeProducts();

            // Group products by categoryId
            Map<String, List<Product>> productsByCategory = products.stream()
                    .collect(Collectors.groupingBy(Product::getCategoryId));

            // Iterate through each categoryId and corresponding list of products
            for (Map.Entry<String, List<Product>> entry : productsByCategory.entrySet()) {
                String categoryId = entry.getKey();
                List<Product> productList = entry.getValue();

                // Create ProductCategory object and add to the list
                ProductCategory productCategory = new ProductCategory(categoryId, productList);
                productCategories.add(productCategory);
            }

            return productCategories;
    }

    // Hàm khởi tạo dữ liệu cho danh sách sản phẩm (giả định)
    private List<Product> initializeProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(
                "001",
                15,
                "ABR4568",
                135.0,
                "Giày thể thao Nike màu xanh",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/nike_shoes.png",
                30.0,
                true,
                new Brand(
                        "1",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "Giày thể thao Nike xanh",
                "1",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/nike_shoes.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/NikeWildhorse.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/NikeAirMax.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/NikeAirJordonwhiteMagenta.png"
                ),
                "ProductType.variable",
                List.of(
                        new ProductAttribute("Màu sắc", List.of("Xanh", "Đen", "Đỏ")),
                        new ProductAttribute("Kích cỡ", List.of("EU 30", "EU 32", "EU 34"))
                ),
                List.of(
                        new ProductVariation("1", 34, 134, 122.6, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/nike_shoes.png", "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm của giày thể thao Nike màu xanh lá cây.", Map.of("Màu sắc", "Xanh", "Kích cỡ", "EU 34")),
                        new ProductVariation("2", 15, 132, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/NikeWildhorse.png", null, Map.of("Màu sắc", "Đen", "Kích cỡ", "EU 32")),
                        new ProductVariation("3", 0, 234, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/NikeWildhorse.png", null, Map.of("Màu sắc", "Đen", "Kích cỡ", "EU 34")),
                        new ProductVariation("4", 222, 232, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/nike_shoes.png", null, Map.of("Màu sắc", "Xanh", "Kích cỡ", "EU 32")),
                        new ProductVariation("5", 0, 334, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/NikeAirMax.png", null, Map.of("Màu sắc", "Đỏ", "Kích cỡ", "EU 34")),
                        new ProductVariation("6", 11, 332, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/NikeAirMax.png", null, Map.of("Màu sắc", "Đỏ", "Kích cỡ", "EU 32"))
                )
        ));
        products.add(new Product(
                "002",
                15,
                "ABR4568",
                35.0,
                "Blue T-shirt dành cho mọi lứa tuổi",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_blue_without_collar_front.png",
                30.0,
                true,
                new Brand(
                        "6",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/zara.png",
                        "Zara",
                        265,
                        true
                ),
                "Mô tả này cho một chiếc áo vest không tay màu xanh của Nike",
                "1",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_blue_without_collar_back.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_blue_without_collar_front.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/product-shirt.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu sắc", List.of("Xanh", "Đỏ", "Xanh dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "003",
                15,
                "ABR4568",
                38000,
                "Áo khoác da màu nâu",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/leather_jacket_1.png",
                30.0,
                true,
                new Brand(
                        "6",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/zara.png",
                        "Zara",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm Áo khoác da màu nâu.",
                "16",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/leather_jacket_1.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/leather_jacket_2.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/leather_jacket_3.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/leather_jacket_4.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu sắc", List.of("Xanh", "Đỏ", "Xanh dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "004",
                15,
                "ABR4568",
                135.0,
                "Áo thun có cổ 4 màu",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_red_collar.png",
                30.0,
                true,
                new Brand(
                        "6",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/zara.png",
                        "Zara",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho áo thun có cổ 4 màu",
                "1",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_red_collar.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_yellow_collar.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_green_collar.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_blue_collar.png"
                ),
                "ProductType.variable",
                List.of(
                        new ProductAttribute("Màu sắc", List.of("Đỏ", "Vàng", "Xanh lá cây", "Xanh dương")),
                        new ProductAttribute("Kích cỡ", List.of("EU 30", "EU 32", "EU 34"))
                ),
                List.of(
                        new ProductVariation("1", 34, 134, 122.6, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_red_collar.png", "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho áo thun có cổ 4 màu", Map.of("Màu sắc", "Đỏ", "Kích cỡ", "EU 34")),
                        new ProductVariation("2", 15, 132, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_red_collar.png", null, Map.of("Màu sắc", "Đỏ", "Kích cỡ", "EU 32")),
                        new ProductVariation("3", 0, 234, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_yellow_collar.png", null, Map.of("Màu sắc", "Vàng", "Kích cỡ", "EU 34")),
                        new ProductVariation("4", 222, 232, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_yellow_collar.png", null, Map.of("Màu sắc", "Vàng", "Kích cỡ", "EU 32")),
                        new ProductVariation("5", 0, 334, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_green_collar.png", null, Map.of("Màu sắc", "Xanh lá cây", "Kích cỡ", "EU 34")),
                        new ProductVariation("6", 11, 332, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_green_collar.png", null, Map.of("Màu sắc", "Xanh lá cây", "Kích cỡ", "EU 30")),
                        new ProductVariation("7", 0, 334, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_blue_collar.png", null, Map.of("Màu sắc", "Xanh dương", "Kích cỡ", "EU 30")),
                        new ProductVariation("8", 11, 332, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_blue_collar.png", null, Map.of("Màu sắc", "Xanh dương", "Kích cỡ", "EU 34"))
                )
        ));
        products.add(new Product(
                "005",
                15,
                "ABR4568",
                35.0,
                "Giày thể thao Nike Air Jordon",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284944/product/NikeAirOrdonWhiteRed.png",
                0.0,
                true,
                new Brand(
                        "1",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho giày thể thao Nike Air Jordon màu trắng đỏ.",
                "1",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirOrdonBlackRed.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirOrdonOrange.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonwhiteMagenta.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirOrdonWhiteRed.png"
                ),
                "ProductType.variable",
                List.of(
                        new ProductAttribute("Màu sắc", List.of("Cam", "Đen", "Nâu")),
                        new ProductAttribute("Kích cỡ", List.of("EU 30", "EU 32", "EU 34"))
                ),
                List.of(
                        new ProductVariation("1", 16, 36, 12.6, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirOrdonOrange.png", "Flutter là một framework mã nguồn mở của Google dùng để xây dựng giao diện người dùng cho ứng dụng di động iOS và Android với cùng một codebase.", Map.of("Màu sắc", "Cam", "Kích cỡ", "EU 34")),
                        new ProductVariation("2", 15, 35, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirOrdonBlackRed.png", null, Map.of("Màu sắc", "Đen", "Kích cỡ", "EU 32")),
                        new ProductVariation("3", 14, 34, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonwhiteMagenta.png", null, Map.of("Màu sắc", "Nâu", "Kích cỡ", "EU 34")),
                        new ProductVariation("4", 13, 33, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirOrdonBlackRed.png", null, Map.of("Màu sắc", "Đen", "Kích cỡ", "EU 34")),
                        new ProductVariation("5", 12, 32, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonwhiteMagenta.png", null, Map.of("Màu sắc", "Nâu", "Kích cỡ", "EU 32")),
                        new ProductVariation("6", 11, 31, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirOrdonOrange.png", null, Map.of("Màu sắc", "Cam", "Kích cỡ", "EU 32"))
                )
        ));
        products.add(new Product(
                "006",
                15,
                "ABR4568",
                750,
                "SAMSUNG Galaxy S9 (Màu Hồng, 64 GB) (4 GB RAM)",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/samsung_s9_mobile.png",
                650.0,
                false,
                new Brand(
                        "7",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/apple.png",
                        "Samsung",
                        265,
                        true
                ),
                "SAMSUNG Galaxy S9 (Màu Hồng, 64 GB) (4 GB RAM), Thời gian sử dụng pin lâu dài",
                "2",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/samsung_s9_mobile.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/samsung_s9_mobile_withback.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/samsung_s9_mobile_back.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/samsung_s9_mobile_withback.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu sắc", List.of("Xanh lá cây", "Đỏ", "Xanh dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "007",
                15,
                "ABR4568",
                20,
                "Thức Ăn Cho Chó TOMI",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tomi_dogfood.png",
                10.0,
                false,
                new Brand(
                        "7",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/apple.png",
                        "Tomi",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho thức ăn cho chó TOMI.",
                "4",
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích Cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu Sắc", List.of("Xanh Lá Cây", "Đỏ", "Xanh Dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "009",
                15,
                "ABR4568",
                400,
                "Giày Nike Air Jordan 19 Màu Xanh",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleBlue.png",
                200.0,
                false,
                new Brand(
                        "1",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho Nike Air Jordan.",
                "8",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleBlue.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleOrange.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirMax.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeBasketballShoeGreenBlack.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích Cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu Sắc", List.of("Xanh Lá Cây", "Đỏ", "Xanh Dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "010",
                15,
                "ABR4568",
                400,
                "Giày Nike Air Jordan 6 Màu Cam",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleBlue.png",
                0.0,
                false,
                new Brand(
                        "1",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho Nike Air Jordan.",
                "8",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleOrange.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeWildhorse.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirMax.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeBasketballShoeGreenBlack.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích Cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu Sắc", List.of("Xanh Lá Cây", "Đỏ", "Xanh Dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "011",
                15,
                "ABR4568",
                600,
                "Giày Nike Air Jordan 6 Màu Cam",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleBlue.png",
                400.0,
                true,
                new Brand(
                        "1",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho Nike Air Jordan.",
                "8",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirMax.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleOrange.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleBlue.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeBasketballShoeGreenBlack.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích Cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu Sắc", List.of("Xanh Lá Cây", "Đỏ", "Xanh Dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "012",
                15,
                "ABR4568",
                600,
                "Giày Bóng Rổ Nike Màu Đen & Xanh",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeBasketballShoeGreenBlack.png",
                400.0,
                false,
                new Brand(
                        "1",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho giày bóng rổ Nike.",
                "8",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeBasketballShoeGreenBlack.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleOrange.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirMax.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeWildhorse.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích Cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu Sắc", List.of("Xanh Lá Cây", "Đỏ", "Xanh Dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "013",
                15,
                "ABR4568",
                600,
                "Giày Nike Wild Horse",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeWildhorse.png",
                400.0,
                false,
                new Brand(
                        "1",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho giày Nike Wild Horse.",
                "8",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeWildhorse.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleOrange.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirMax.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeBasketballShoeGreenBlack.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích Cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu Sắc", List.of("Xanh Lá Cây", "Đỏ", "Xanh Dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "014",
                15,
                "ABR4568",
                500,
                "Đồ Thể Thao Nike Màu Đỏ",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_red.png",
                0.0,
                true,
                new Brand(
                        "1",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho Bộ Đồ Thể Thao Nike Màu Đỏ.",
                "9",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_red.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_black.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_blue.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/trcksuit_parrotgreen.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích Cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu Sắc", List.of("Xanh Lá Cây", "Đỏ", "Xanh Dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "015",
                15,
                "ABR4568",
                200,
                "Đồ Thể Thao Nike Màu Đen",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_red.png",
                0.0,
                true,
                new Brand(
                        "1",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho Bộ Đồ Thể Thao Nike Màu Đen.",
                "9",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_black.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_red.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_blue.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/trcksuit_parrotgreen.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích Cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu Sắc", List.of("Xanh Lá Cây", "Đỏ", "Xanh Dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "016",
                15,
                "ABR4568",
                100,
                "Đồ Thể Thao Nike Màu Xanh",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_red.png",
                0.0,
                true,
                new Brand(
                        "1",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho Bộ Đồ Thể Thao Nike Màu Xanh.",
                "9",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_blue.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_red.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_black.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/trcksuit_parrotgreen.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích Cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu Sắc", List.of("Xanh Lá Cây", "Đỏ", "Xanh Dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "017",
                15,
                "ABR4568",
                350,
                "Đồ Thể Thao Nike Màu Xanh Vịt",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/trcksuit_parrotgreen.png",
                0.0,
                true,
                new Brand(
                        "1",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho Bộ Đồ Thể Thao Nike Màu Xanh Vịt.",
                "9",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/trcksuit_parrotgreen.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_red.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_black.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_blue.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích Cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu Sắc", List.of("Xanh Lá Cây", "Đỏ", "Xanh Dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "018",
                15,
                "ABR4568",
                40,
                "Quả bóng Adidas",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/Adidas_Football.png",
                0.0,
                true,
                new Brand(
                        "2",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/adidas.png",
                        "Adidas",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho quả bóng Adidas.",
                "10",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/Adidas_Football.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/baseball_bat.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/cricket_bat.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích Cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu Sắc", List.of("Xanh Lá Cây", "Đỏ", "Xanh Dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "019",
                15,
                "ABR4568",
                30,
                "Gậy Bóng Chày",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/baseball_bat.png",
                0.0,
                true,
                new Brand(
                        "2",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/adidas.png",
                        "Adidas",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho Gậy Bóng Chày.",
                "10",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/baseball_bat.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/Adidas_Football.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/cricket_bat.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích Cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu Sắc", List.of("Xanh Lá Cây", "Đỏ", "Xanh Dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "020",
                15,
                "ABR4568",
                25,
                "Gậy Đánh Bóng",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/baseball_bat.png",
                0.0,
                true,
                new Brand(
                        "2",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/adidas.png",
                        "Adidas",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho Gậy Đánh Bóng.",
                "10",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/cricket_bat.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/Adidas_Football.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/baseball_bat.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích Cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu Sắc", List.of("Xanh Lá Cây", "Đỏ", "Xanh Dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "021",
                15,
                "ABR4568",
                54,
                "Vợt Tennis",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/baseball_bat.png",
                0.0,
                true,
                new Brand(
                        "2",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/adidas.png",
                        "Adidas",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho Vợt Tennis.",
                "10",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/Adidas_Football.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/baseball_bat.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/cricket_bat.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích Cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu Sắc", List.of("Xanh Lá Cây", "Đỏ", "Xanh Dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "022",
                15,
                "ABR4568",
                950,
                "Giường Gỗ Thật",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284944/product/bedroom_bed.png",
                600.0,
                true,
                new Brand(
                        "8",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/kenwood.png",
                        "Kenwood",
                        265,
                        true
                ),
                "Flutter là một framework mã nguồn mở của Google dùng để xây dựng giao diện di động chất lượng cao (vô cùng nhanh chóng) cho ứng dụng iOS và Android với cùng một codebase.",
                "11",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed_black.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed_grey.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed_simple_brown.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed_with_comforter.png"
                ),
                "ProductType.variable",
                List.of(
                        new ProductAttribute("Màu sắc", List.of("Đen", "Xám", "Nâu")),
                        new ProductAttribute("Kích cỡ", List.of("EU 30", "EU 32", "EU 34"))
                ),
                List.of(
                        new ProductVariation("1", 16, 36, 12.6, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed.png", "Flutter is Google’s mobile UI open source framework to build high-quality native (super fast) interfaces for iOS and Android apps with the unified codebase.", Map.of("Màu sắc", "Brown", "Kích cỡ", "EU 34")),
                        new ProductVariation("2", 15, 35, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed_simple_brown.png", null, Map.of("Màu sắc", "Brown", "Kích cỡ", "EU 34")),
                        new ProductVariation("3", 14, 34, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed_with_comforter.png", null, Map.of("Màu sắc", "Brown", "Kích cỡ", "EU 30")),
                        new ProductVariation("4", 13, 33, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed_black.png", null, Map.of("Màu sắc", "Đen", "Kích cỡ", "EU 32")),
                        new ProductVariation("5", 12, 32, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed_black.png", null, Map.of("Màu sắc", "Đen", "Kích cỡ", "EU 32")),
                        new ProductVariation("6", 11, 31, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed_grey.png", null, Map.of("Màu sắc", "Grey", "Kích cỡ", "EU 32"))
                )
        ));
        products.add(new Product(
                "023",
                15,
                "ABR4568",
                25,
                "Đèn Bàn",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_lamp.png",
                0.0,
                false,
                new Brand(
                        "8",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/kenwood.png",
                        "Kenwood",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho Đèn Bàn.",
                "11",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/Adidas_Football.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/baseball_bat.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/cricket_bat.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích Cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu Sắc", List.of("Xanh Lá Cây", "Đỏ", "Xanh Dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "024",
                15,
                "ABR4568",
                25,
                "Ghế Sofa Phòng Ngủ",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_sofa.png",
                0.0,
                false,
                new Brand(
                        "8",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/kenwood.png",
                        "Kenwood",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất sản phẩm cho Ghế Sofa Phòng Ngủ.",
                "11",
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích Cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu Sắc", List.of("Xanh Lá Cây", "Đỏ", "Xanh Dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "025",
                15,
                "ABR4568",
                56,
                "Tủ quần áo",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_wardrobe.png",
                0.0,
                false,
                new Brand(
                        "8",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/kenwood.png",
                        "Kenwood",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm Tủ quần áo phòng ngủ.",
                "11",
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích Cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu Sắc", List.of("Xanh Lá Cây", "Đỏ", "Xanh Dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "026",
                15,
                "ABR4568",
                1012,
                "Kệ nhà bếp",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_wardrobe.png",
                0.0,
                false,
                new Brand(
                        "2",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/adidas.png",
                        "Adidas",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm Kệ nhà bếp.",
                "12",
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu sắc", List.of("Xanh lá cây", "Đỏ", "Xanh dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "027",
                15,
                "ABR4568",
                1012,
                "Bàn ăn",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/kitchen_dining_table.png",
                0.0,
                false,
                new Brand(
                        "2",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/adidas.png",
                        "Adidas",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm Bàn ăn.",
                "12",
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu sắc", List.of("Xanh lá cây", "Đỏ", "Xanh dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "028",
                15,
                "ABR4568",
                987,
                "Tủ lạnh",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/kitchen_refrigerator.png",
                0.0,
                false,
                new Brand(
                        "2",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/adidas.png",
                        "Adidas",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm Tủ lạnh.",
                "12",
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu sắc", List.of("Xanh lá cây", "Đỏ", "Xanh dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "029",
                15,
                "ABR4568",
                150,
                "Ghế văn phòng màu đỏ",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/office_chair_1.png",
                0.0,
                false,
                new Brand(
                        "9",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/ikea.png",
                        "Ikea",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm Ghế văn phòng màu đỏ.",
                "13",
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu sắc", List.of("Xanh lá cây", "Đỏ", "Xanh dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "030",
                15,
                "ABR4568",
                140,
                "Ghế văn phòng màu trắng",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/office_chair_2.png",
                0.0,
                false,
                new Brand(
                        "9",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/ikea.png",
                        "Ikea",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm Ghế văn phòng màu trắng.",
                "13",
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu sắc", List.of("Xanh lá cây", "Đỏ", "Xanh dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "031",
                15,
                "ABR4568",
                360,
                "Bàn văn phòng màu đỏ",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/office_desk_1.png",
                0.0,
                false,
                new Brand(
                        "9",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/ikea.png",
                        "Ikea",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm Bàn văn phòng màu đỏ.",
                "13",
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu sắc", List.of("Xanh lá cây", "Đỏ", "Xanh dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "032",
                15,
                "ABR4568",
                400,
                "Bàn văn phòng màu nâu",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/office_desk_2.png",
                0.0,
                false,
                new Brand(
                        "9",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/ikea.png",
                        "Ikea",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm Bàn văn phòng màu nâu.",
                "13",
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu sắc", List.of("Xanh lá cây", "Đỏ", "Xanh dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "033",
                15,
                "ABR4568",
                950,
                "Acer Laptop RAM 8gb to 16gb 512gb to 2tb",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284944/product/acer_laptop_var_1.png",
                800.0,
                true,
                new Brand(
                        "10",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/acer.png",
                        "Acer",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm Acer Laptop RAM 8gb to 16gb 512gb to 2tb.",
                "14",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_var_1.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_1.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_var_2.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_var_3.png"
                ),
                "ProductType.variable",
                List.of(
                        new ProductAttribute("Ram", List.of("6", "8", "16")),
                        new ProductAttribute("SSD", List.of("512", "1 tb", "2 tb"))
                ),
                List.of(
                        new ProductVariation("1", 16, 400, 350.0, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_var_1.png", "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm Acer Laptop.", Map.of("Ram", "6", "hard", "512")),
                        new ProductVariation("2", 15, 450, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_1.png", null, Map.of("Ram", "8", "hard", "512")),
                        new ProductVariation("3", 14, 470, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_var_4.png", null, Map.of("Ram", "8", "hard", "1 tb")),
                        new ProductVariation("4", 13, 500, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_var_3.png", null, Map.of("Ram", "16", "hard", "512")),
                        new ProductVariation("5", 12, 650, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_var_2.png", null, Map.of("Ram", "16", "hard", "1 tb")),
                        new ProductVariation("6", 11, 800, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_var_4.png", null, Map.of("Ram", "16", "hard", "2 tb"))
                )
        ));
        products.add(new Product(
                "034",
                15,
                "ABR4568",
                400,
                "Acer Laptop 6gb 1tb",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_2.png",
                0.0,
                false,
                new Brand(
                        "10",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/acer.png",
                        "Acer",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm Acer Laptop 6gb 1tb.",
                "14",
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu sắc", List.of("Xanh lá cây", "Đỏ", "Xanh dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "035",
                15,
                "ABR4568",
                400,
                "Acer Laptop 6gb 500Gb",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_3.png",
                0.0,
                false,
                new Brand(
                        "10",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/acer.png",
                        "Acer",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm Acer Laptop 6gb 500Gb.",
                "14",
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu sắc", List.of("Xanh lá cây", "Đỏ", "Xanh dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "036",
                15,
                "ABR4568",
                400,
                "Acer Laptop 4gb 500Gb",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_4.png",
                0.0,
                false,
                new Brand(
                        "10",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/acer.png",
                        "Acer",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm Acer Laptop 4gb 500Gb.",
                "14",
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu sắc", List.of("Xanh lá cây", "Đỏ", "Xanh dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "037",
                15,
                "ABR4568",
                999,
                "Iphone 13 pro 512gb",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_13_pro.png",
                0.0,
                false,
                new Brand(
                        "5",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/apple.png",
                        "Apple",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm Iphone 13 pro 512gb.",
                "15",
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu sắc", List.of("Xanh lá cây", "Đỏ", "Xanh dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "038",
                15,
                "ABR4568",
                999,
                "Iphone 14 pro 512gb",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_14_pro.png",
                0.0,
                false,
                new Brand(
                        "5",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/apple.png",
                        "Apple",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm Iphone 14 pro 512gb.",
                "15",
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu sắc", List.of("Xanh lá cây", "Đỏ", "Xanh dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "039",
                15,
                "ABR4568",
                999,
                "Iphone 14 pro 512gb",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_14_white.png",
                0.0,
                false,
                new Brand(
                        "5",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/apple.png",
                        "Apple",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm Iphone 14 pro 512gb.",
                "15",
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Kích cỡ", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Màu sắc", List.of("Xanh lá cây", "Đỏ", "Xanh dương"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                "040",
                15,
                "ABR4568",
                950,
                "Iphone 12, 4 Màu sắcs 128gb and 256gb",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284944/product/iphone_12_red.png",
                800.0,
                true,
                new Brand(
                        "5",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/apple.png",
                        "Apple",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm Iphone 12.",
                "15",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_red.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_blue.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_green.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_black.png"
                ),
                "ProductType.variable",
                List.of(
                        new ProductAttribute("Màu sắc", List.of("Xanh lá cây", "Đỏ", "Xanh dương", "Đen")),
                        new ProductAttribute("Storage", List.of("128 gb", "256 gb"))
                ),
                List.of(
                        new ProductVariation("1", 16, 400, 350.0, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_red.png", "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm Iphone 12. There are more things that can be added but I am just practicing and nothing else.", Map.of("Màu sắc", "Đỏ", "Storage", "128 gb")),
                        new ProductVariation("2", 15, 450, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_red.png", null, Map.of("Màu sắc", "Đỏ", "Storage", "256 gb")),
                        new ProductVariation("3", 14, 470, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_blue.png", null, Map.of("Màu sắc", "Xanh dương", "Storage", "128 gb")),
                        new ProductVariation("4", 13, 500, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_blue.png", null, Map.of("Màu sắc", "Xanh dương", "Storage", "256 gb")),
                        new ProductVariation("5", 12, 650, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_green.png", null, Map.of("Màu sắc", "Xanh lá cây", "Storage", "128 gb")),
                        new ProductVariation("5", 12, 650, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_green.png", null, Map.of("Màu sắc", "Xanh lá cây", "Storage", "256 gb")),
                        new ProductVariation("6", 11, 800, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_black.png", null, Map.of("Màu sắc", "Đen", "Storage", "128 gb")),
                        new ProductVariation("6", 11, 800, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_black.png", null, Map.of("Màu sắc", "Đen", "Storage", "256 gb"))
                )
        ));
        products.add(new Product(
                "008",
                15,
                "ABR4568",
                480,
                "APPLE iPhone 8 (Đen, 64 GB)",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284944/product/iphone8_mobile.png",
                380.0,
                true,
                new Brand(
                        "5",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/apple.png",
                        "Apple",
                        265,
                        true
                ),
                "Đây là mô tả chi tiết được cung cấp từ nhà sản xuất cho sản phẩm iphone 8.",
                "4",
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone8_mobile_back.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone8_mobile_dual_side.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone8_mobile_front.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone8_mobile.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Màu sắc", List.of("Xanh lá cây", "Đỏ", "Xanh dương", "Đen")),
                        new ProductAttribute("Storage", List.of("128 gb", "256 gb"))
                ),
                new ArrayList<>()
        ));
        return products;
    }
}
