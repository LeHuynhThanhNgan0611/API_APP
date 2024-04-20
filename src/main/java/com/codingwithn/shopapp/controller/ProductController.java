package com.codingwithn.shopapp.controller;

import com.codingwithn.shopapp.models.Brand;
import com.codingwithn.shopapp.models.Product;
import com.codingwithn.shopapp.models.ProductAttribute;
import com.codingwithn.shopapp.models.ProductVariation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();

        products.add(new Product(
                1L,
                15,
                "ABR4568",
                135.0,
                "Green Nike sports shoe",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/nike_shoes.png",
                30.0,
                true,
                new Brand(
                        1L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "Green Nike sports shoe",
                1L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/nike_shoes.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/NikeWildhorse.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/NikeAirMax.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/NikeAirJordonwhiteMagenta.png"
                ),
                "ProductType.variable",
                List.of(
                        new ProductAttribute("Color", List.of("Green", "Black", "Red")),
                        new ProductAttribute("Size", List.of("EU 30", "EU 32", "EU 34"))
                ),
                List.of(
                        new ProductVariation(1L, 34, 134, 122.6, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/nike_shoes.png", "This is a Product description for Green Nike sports shoe.", Map.of("Color", "Green", "Size", "EU 34")),
                        new ProductVariation(2L, 15, 132, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/NikeWildhorse.png", null, Map.of("Color", "Black", "Size", "EU 32")),
                        new ProductVariation(3L, 0, 234, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/NikeWildhorse.png", null, Map.of("Color", "Black", "Size", "EU 34")),
                        new ProductVariation(4L, 222, 232, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/nike_shoes.png", null, Map.of("Color", "Green", "Size", "EU 32")),
                        new ProductVariation(5L, 0, 334, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/NikeAirMax.png", null, Map.of("Color", "Red", "Size", "EU 34")),
                        new ProductVariation(6L, 11, 332, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/NikeAirMax.png", null, Map.of("Color", "Red", "Size", "EU 32"))
                )
        ));
        products.add(new Product(
                2L,
                15,
                "ABR4568",
                35.0,
                "Blue T-shirt for all ages",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_blue_without_collar_front.png",
                30.0,
                true,
                new Brand(
                        6L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/zara.png",
                        "Zara",
                        265,
                        true
                ),
                "This is a Product description for Blue Nike Sleeve less vest. There are more things that can be added but i am just practicing and nothing else.",
                1L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_blue_without_collar_back.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_blue_without_collar_front.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/product-shirt.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                3L,
                15,
                "ABR4568",
                38000,
                "Leather brown Jacket",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/leather_jacket_1.png",
                30.0,
                true,
                new Brand(
                        6L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/zara.png",
                        "Zara",
                        265,
                        true
                ),
                "This is a Product description for Leather brown Jacket. There are more things that can be added but i am just practicing and nothing else.",
                16L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/leather_jacket_1.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/leather_jacket_2.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/leather_jacket_3.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/leather_jacket_4.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                4L,
                15,
                "ABR4568",
                135.0,
                "4 Color collar t-shirt dry fit",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_red_collar.png",
                30.0,
                true,
                new Brand(
                        6L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/zara.png",
                        "Zara",
                        265,
                        true
                ),
                "This is a Product description for 4 Color collar t-shirt dry fit. There are more things that can be added but its just a demo and nothing else.",
                1L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_red_collar.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_yellow_collar.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_green_collar.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_blue_collar.png"
                ),
                "ProductType.variable",
                List.of(
                        new ProductAttribute("Color", List.of("Red", "Yellow", "Green", "Blue")),
                        new ProductAttribute("Size", List.of("EU 30", "EU 32", "EU 34"))
                ),
                List.of(
                        new ProductVariation(1L, 34, 134, 122.6, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_red_collar.png", "This is a Product description for 4 Color collar t-shirt dry fit", Map.of("Color", "Red", "Size", "EU 34")),
                        new ProductVariation(2L, 15, 132, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_red_collar.png", null, Map.of("Color", "Red", "Size", "EU 32")),
                        new ProductVariation(3L, 0, 234, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_yellow_collar.png", null, Map.of("Color", "Yellow", "Size", "EU 34")),
                        new ProductVariation(4L, 222, 232, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_yellow_collar.png", null, Map.of("Color", "Yellow", "Size", "EU 32")),
                        new ProductVariation(5L, 0, 334, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_green_collar.png", null, Map.of("Color", "Green", "Size", "EU 34")),
                        new ProductVariation(6L, 11, 332, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_green_collar.png", null, Map.of("Color", "Green", "Size", "EU 30")),
                        new ProductVariation(7L, 0, 334, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_blue_collar.png", null, Map.of("Color", "Blue", "Size", "EU 30")),
                        new ProductVariation(8L, 11, 332, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284947/product/tshirt_blue_collar.png", null, Map.of("Color", "Blue", "Size", "EU 34"))
                )
        ));
        products.add(new Product(
                5L,
                15,
                "ABR4568",
                35.0,
                "Nike Air Jordon Shoes",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284944/product/NikeAirOrdonWhiteRed.png",
                0.0,
                true,
                new Brand(
                        1L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "This is a Product description for 4 Color collar t-shirt dry fit. There are more things that can be added but its just a demo and nothing else.",
                1L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirOrdonBlackRed.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirOrdonOrange.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonwhiteMagenta.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirOrdonWhiteRed.png"
                ),
                "ProductType.variable",
                List.of(
                        new ProductAttribute("Color", List.of("Orange", "Black", "Brown")),
                        new ProductAttribute("Size", List.of("EU 30", "EU 32", "EU 34"))
                ),
                List.of(
                        new ProductVariation(1L, 16, 36, 12.6, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirOrdonOrange.png", "Flutter is Google’s mobile UI open source framework to build high-quality native (super fast) interfaces for iOS and Android apps with the unified codebase.", Map.of("Color", "Orange", "Size", "EU 34")),
                        new ProductVariation(2L, 15, 35, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirOrdonBlackRed.png", null, Map.of("Color", "Black", "Size", "EU 32")),
                        new ProductVariation(3L, 14, 34, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonwhiteMagenta.png", null, Map.of("Color", "Brown", "Size", "EU 34")),
                        new ProductVariation(4L, 13, 33, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirOrdonBlackRed.png", null, Map.of("Color", "Black", "Size", "EU 34")),
                        new ProductVariation(5L, 12, 32, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonwhiteMagenta.png", null, Map.of("Color", "Brown", "Size", "EU 32")),
                        new ProductVariation(6L, 11, 31, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirOrdonOrange.png", null, Map.of("Color", "Orange", "Size", "EU 32"))
                )
        ));
        products.add(new Product(
                6L,
                15,
                "ABR4568",
                750,
                "SAMSUNG Galaxy S9 (Pink, 64 GB) (4 GB RAM)",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/samsung_s9_mobile.png",
                650.0,
                false,
                new Brand(
                        7L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/apple.png",
                        "Samsung",
                        265,
                        true
                ),
                "SAMSUNG Galaxy S9 (Pink, 64 GB)  (4 GB RAM), Long Battery timing",
                2L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/samsung_s9_mobile.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/samsung_s9_mobile_withback.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/samsung_s9_mobile_back.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/samsung_s9_mobile_withback.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                7L,
                15,
                "ABR4568",
                20,
                "TOMI Dog food",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tomi_dogfood.png",
                10.0,
                false,
                new Brand(
                        7L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/apple.png",
                        "Tomi",
                        265,
                        true
                ),
                "This is a Product description for TOMI Dog food. There are more things that can be added but i am just practicing and nothing else.",
                4L,
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                9L,
                15,
                "ABR4568",
                400,
                "Nike Air Jordon 19 Blue",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleBlue.png",
                200.0,
                false,
                new Brand(
                        1L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "This is a Product description for Nike Air Jordon. There are more things that can be added but i am just practicing and nothing else.",
                8L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleBlue.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleOrange.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirMax.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeBasketballShoeGreenBlack.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                10L,
                15,
                "ABR4568",
                400,
                "Nike Air Jordon 6 Orange",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleBlue.png",
                0.0,
                false,
                new Brand(
                        1L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "This is a Product description for Nike Air Jordon. There are more things that can be added but i am just practicing and nothing else.",
                8L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleOrange.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeWildhorse.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirMax.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeBasketballShoeGreenBlack.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                11L,
                15,
                "ABR4568",
                600,
                "Nike Air Jordon 6 Orange",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleBlue.png",
                400.0,
                true,
                new Brand(
                        1L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "This is a Product description for Nike Air Jordon. There are more things that can be added but i am just practicing and nothing else.",
                8L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirMax.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleOrange.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleBlue.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeBasketballShoeGreenBlack.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                12L,
                15,
                "ABR4568",
                600,
                "Nike Basketball shoes Black & Green",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeBasketballShoeGreenBlack.png",
                400.0,
                false,
                new Brand(
                        1L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "This is a Product description for Nike Basketball shoes. There are more things that can be added but i am just practicing and nothing else.",
                8L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeBasketballShoeGreenBlack.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleOrange.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirMax.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeWildhorse.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                13L,
                15,
                "ABR4568",
                600,
                "Nike wild horse shoes",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeWildhorse.png",
                400.0,
                false,
                new Brand(
                        1L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "This is a Product description for Nike wild horse shoes. There are more things that can be added but i am just practicing and nothing else.",
                8L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeWildhorse.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirJordonSingleOrange.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeAirMax.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/NikeBasketballShoeGreenBlack.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                14L,
                15,
                "ABR4568",
                500,
                "Nike Track suit red",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_red.png",
                0.0,
                true,
                new Brand(
                        1L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "This is a Product description for Nike Track suit red. There are more things that can be added but i am just practicing and nothing else.",
                9L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_red.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_black.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_blue.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/trcksuit_parrotgreen.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                15L,
                15,
                "ABR4568",
                200,
                "Nike Track suit Black",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_red.png",
                0.0,
                true,
                new Brand(
                        1L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "This is a Product description for Nike Track suit Black. There are more things that can be added but i am just practicing and nothing else.",
                9L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_black.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_red.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_blue.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/trcksuit_parrotgreen.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                16L,
                15,
                "ABR4568",
                100,
                "Nike Track suit Blue",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_red.png",
                0.0,
                true,
                new Brand(
                        1L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "This is a Product description for Nike Track suit Blue. There are more things that can be added but i am just practicing and nothing else.",
                9L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_blue.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_red.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_black.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/trcksuit_parrotgreen.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                17L,
                15,
                "ABR4568",
                350,
                "Nike Track suit Parrot Green",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/trcksuit_parrotgreen.png",
                0.0,
                true,
                new Brand(
                        1L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/nike.png",
                        "Nike",
                        265,
                        true
                ),
                "This is a Product description for Nike Track suit Parrot Green. There are more things that can be added but i am just practicing and nothing else.",
                9L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/trcksuit_parrotgreen.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_red.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_black.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/tracksuit_blue.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                18L,
                15,
                "ABR4568",
                40,
                "Adidas Football",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/Adidas_Football.png",
                0.0,
                true,
                new Brand(
                        2L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/adidas.png",
                        "Adidas",
                        265,
                        true
                ),
                "This is a Product description for Football. There are more things that can be added but i am just practicing and nothing else.",
                10L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/Adidas_Football.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/baseball_bat.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/cricket_bat.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                19L,
                15,
                "ABR4568",
                30,
                "Baseball Bat",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/baseball_bat.png",
                0.0,
                true,
                new Brand(
                        2L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/adidas.png",
                        "Adidas",
                        265,
                        true
                ),
                "This is a Product description for Cricket Bat. There are more things that can be added but i am just practicing and nothing else.",
                10L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/baseball_bat.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/Adidas_Football.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/cricket_bat.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                20L,
                15,
                "ABR4568",
                25,
                "Cricket Bat",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/baseball_bat.png",
                0.0,
                true,
                new Brand(
                        2L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/adidas.png",
                        "Adidas",
                        265,
                        true
                ),
                "This is a Product description for Baseball Bat. There are more things that can be added but i am just practicing and nothing else.",
                10L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/cricket_bat.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/Adidas_Football.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/baseball_bat.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                21L,
                15,
                "ABR4568",
                54,
                "Tennis Racket",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/baseball_bat.png",
                0.0,
                true,
                new Brand(
                        2L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/adidas.png",
                        "Adidas",
                        265,
                        true
                ),
                "This is a Product description for Tennis Racket. There are more things that can be added but i am just practicing and nothing else.",
                10L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/Adidas_Football.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/baseball_bat.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/cricket_bat.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                22L,
                15,
                "ABR4568",
                950,
                "Pure Wooden Bed",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284944/product/bedroom_bed.png",
                600.0,
                true,
                new Brand(
                        8L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/kenwood.png",
                        "Kenwood",
                        265,
                        true
                ),
                "Flutter is Google’s mobile UI open source framework to build high-quality native (super fast) interfaces for iOS and Android apps with the unified codebase.",
                11L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed_black.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed_grey.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed_simple_brown.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed_with_comforter.png"
                ),
                "ProductType.variable",
                List.of(
                        new ProductAttribute("Color", List.of("Black", "Grey", "Brown")),
                        new ProductAttribute("Size", List.of("EU 30", "EU 32", "EU 34"))
                ),
                List.of(
                        new ProductVariation(1L, 16, 36, 12.6, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed.png", "Flutter is Google’s mobile UI open source framework to build high-quality native (super fast) interfaces for iOS and Android apps with the unified codebase.", Map.of("Color", "Brown", "Size", "EU 34")),
                        new ProductVariation(2L, 15, 35, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed_simple_brown.png", null, Map.of("Color", "Brown", "Size", "EU 34")),
                        new ProductVariation(3L, 14, 34, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed_with_comforter.png", null, Map.of("Color", "Brown", "Size", "EU 30")),
                        new ProductVariation(4L, 13, 33, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed_black.png", null, Map.of("Color", "Black", "Size", "EU 32")),
                        new ProductVariation(5L, 12, 32, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed_black.png", null, Map.of("Color", "Black", "Size", "EU 32")),
                        new ProductVariation(6L, 11, 31, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed_grey.png", null, Map.of("Color", "Grey", "Size", "EU 32"))
                )
        ));
        products.add(new Product(
                23L,
                15,
                "ABR4568",
                25,
                "Side Table Lamp",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_lamp.png",
                0.0,
                false,
                new Brand(
                        8L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/kenwood.png",
                        "Kenwood",
                        265,
                        true
                ),
                "This is a Product description for Side Table Lamp. There are more things that can be added but i am just practicing and nothing else.",
                11L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_bed.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/Adidas_Football.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/baseball_bat.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/cricket_bat.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                24L,
                15,
                "ABR4568",
                25,
                "Bedroom Sofa",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_sofa.png",
                0.0,
                false,
                new Brand(
                        8L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/kenwood.png",
                        "Kenwood",
                        265,
                        true
                ),
                "This is a Product description for Bedroom Sofa. There are more things that can be added but i am just practicing and nothing else.",
                11L,
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                25L,
                15,
                "ABR4568",
                56,
                "Wardrobe for Bedroom",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_wardrobe.png",
                0.0,
                false,
                new Brand(
                        8L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/kenwood.png",
                        "Kenwood",
                        265,
                        true
                ),
                "This is a Product description for Bedroom Wardrobe. There are more things that can be added but i am just practicing and nothing else.",
                11L,
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                26L,
                15,
                "ABR4568",
                1012,
                "Kitchen Counter",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/bedroom_wardrobe.png",
                0.0,
                false,
                new Brand(
                        2L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/adidas.png",
                        "Adidas",
                        265,
                        true
                ),
                "This is a Product description for Kitchen Counter. There are more things that can be added but i am just practicing and nothing else.",
                12L,
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                27L,
                15,
                "ABR4568",
                1012,
                "Dinning Table",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/kitchen_dining_table.png",
                0.0,
                false,
                new Brand(
                        2L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/adidas.png",
                        "Adidas",
                        265,
                        true
                ),
                "This is a Product description for Dinning Table. There are more things that can be added but i am just practicing and nothing else.",
                12L,
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                28L,
                15,
                "ABR4568",
                987,
                "Refrigerator",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/kitchen_refrigerator.png",
                0.0,
                false,
                new Brand(
                        2L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/adidas.png",
                        "Adidas",
                        265,
                        true
                ),
                "This is a Product description for Dinning Table. There are more things that can be added but i am just practicing and nothing else.",
                12L,
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                29L,
                15,
                "ABR4568",
                150,
                "Office Chair Red",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/office_chair_1.png",
                0.0,
                false,
                new Brand(
                        9L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/ikea.png",
                        "Ikea",
                        265,
                        true
                ),
                "This is a Product description for Office Chair. There are more things that can be added but i am just practicing and nothing else.",
                13L,
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                30L,
                15,
                "ABR4568",
                140,
                "Office Chair White",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/office_chair_2.png",
                0.0,
                false,
                new Brand(
                        9L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/ikea.png",
                        "Ikea",
                        265,
                        true
                ),
                "This is a Product description for Office Chair. There are more things that can be added but i am just practicing and nothing else.",
                13L,
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                31L,
                15,
                "ABR4568",
                360,
                "Office Desk Red",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/office_desk_1.png",
                0.0,
                false,
                new Brand(
                        9L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/ikea.png",
                        "Ikea",
                        265,
                        true
                ),
                "This is a Product description for Office Desk. There are more things that can be added but i am just practicing and nothing else.",
                13L,
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                32L,
                15,
                "ABR4568",
                400,
                "Office Desk brown",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/office_desk_2.png",
                0.0,
                false,
                new Brand(
                        9L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/ikea.png",
                        "Ikea",
                        265,
                        true
                ),
                "This is a Product description for Office Desk. There are more things that can be added but i am just practicing and nothing else.",
                13L,
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                33L,
                15,
                "ABR4568",
                950,
                "Acer Laptop RAM 8gb to 16gb 512gb to 2tb",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284944/product/acer_laptop_var_1.png",
                800.0,
                true,
                new Brand(
                        10L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/acer.png",
                        "Acer",
                        265,
                        true
                ),
                "This is a Product description for Acer Laptop. There are more things that can be added but i am just practicing and nothing else.",
                14L,
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
                        new ProductVariation(1L, 16, 400, 350.0, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_var_1.png", "This is a Product description for Acer Laptop. There are more things that can be added but i am just practicing and nothing else.", Map.of("Ram", "6", "hard", "512")),
                        new ProductVariation(2L, 15, 450, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_1.png", null, Map.of("Ram", "8", "hard", "512")),
                        new ProductVariation(3L, 14, 470, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_var_4.png", null, Map.of("Ram", "8", "hard", "1 tb")),
                        new ProductVariation(4L, 13, 500, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_var_3.png", null, Map.of("Ram", "16", "hard", "512")),
                        new ProductVariation(5L, 12, 650, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_var_2.png", null, Map.of("Ram", "16", "hard", "1 tb")),
                        new ProductVariation(6L, 11, 800, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_var_4.png", null, Map.of("Ram", "16", "hard", "2 tb"))
                )
        ));
        products.add(new Product(
                34L,
                15,
                "ABR4568",
                400,
                "Acer Laptop 6gb 1tb",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_2.png",
                0.0,
                false,
                new Brand(
                        10L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/acer.png",
                        "Acer",
                        265,
                        true
                ),
                "This is a Product description for Acer Laptop. There are more things that can be added but i am just practicing and nothing else.",
                14L,
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                35L,
                15,
                "ABR4568",
                400,
                "Acer Laptop 6gb 500Gb",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_3.png",
                0.0,
                false,
                new Brand(
                        10L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/acer.png",
                        "Acer",
                        265,
                        true
                ),
                "This is a Product description for Acer Laptop. There are more things that can be added but i am just practicing and nothing else.",
                14L,
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                36L,
                15,
                "ABR4568",
                400,
                "Acer Laptop 4gb 500Gb",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/acer_laptop_4.png",
                0.0,
                false,
                new Brand(
                        10L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/acer.png",
                        "Acer",
                        265,
                        true
                ),
                "This is a Product description for Acer Laptop. There are more things that can be added but i am just practicing and nothing else.",
                14L,
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                37L,
                15,
                "ABR4568",
                999,
                "Iphone 13 pro 512gb",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_13_pro.png",
                0.0,
                false,
                new Brand(
                        5L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/apple.png",
                        "Apple",
                        265,
                        true
                ),
                "This is a Product description for Iphone. There are more things that can be added but i am just practicing and nothing else.",
                15L,
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                38L,
                15,
                "ABR4568",
                999,
                "Iphone 14 pro 512gb",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_14_pro.png",
                0.0,
                false,
                new Brand(
                        5L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/apple.png",
                        "Apple",
                        265,
                        true
                ),
                "This is a Product description for Iphone. There are more things that can be added but i am just practicing and nothing else.",
                15L,
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                39L,
                15,
                "ABR4568",
                999,
                "Iphone 14 pro 512gb",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_14_white.png",
                0.0,
                false,
                new Brand(
                        5L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/apple.png",
                        "Apple",
                        265,
                        true
                ),
                "This is a Product description for Iphone. There are more things that can be added but i am just practicing and nothing else.",
                15L,
                new ArrayList<>(),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Size", List.of("EU 34", "EU 32")),
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue"))
                ),
                new ArrayList<>()
        ));
        products.add(new Product(
                40L,
                15,
                "ABR4568",
                950,
                "Iphone 12, 4 Colors 128gb and 256gb",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284944/product/iphone_12_red.png",
                800.0,
                true,
                new Brand(
                        5L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/apple.png",
                        "Apple",
                        265,
                        true
                ),
                "This is a Product description for Iphone 12. There are more things that can be added but i am just practicing and nothing else.",
                15L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_red.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_blue.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_green.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_black.png"
                ),
                "ProductType.variable",
                List.of(
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue", "Black")),
                        new ProductAttribute("Storage", List.of("128 gb", "256 gb"))
                ),
                List.of(
                        new ProductVariation(1L, 16, 400, 350.0, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_red.png", "This is a Product description for Iphone 12. There are more things that can be added but i am just practicing and nothing else.", Map.of("Color", "Red", "Storage", "128 gb")),
                        new ProductVariation(2L, 15, 450, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_red.png", null, Map.of("Color", "Red", "Storage", "256 gb")),
                        new ProductVariation(3L, 14, 470, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_blue.png", null, Map.of("Color", "Blue", "Storage", "128 gb")),
                        new ProductVariation(4L, 13, 500, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_blue.png", null, Map.of("Color", "Blue", "Storage", "256 gb")),
                        new ProductVariation(5L, 12, 650, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_green.png", null, Map.of("Color", "Green", "Storage", "128 gb")),
                        new ProductVariation(5L, 12, 650, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_green.png", null, Map.of("Color", "Green", "Storage", "256 gb")),
                        new ProductVariation(6L, 11, 800, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_black.png", null, Map.of("Color", "Black", "Storage", "128 gb")),
                        new ProductVariation(6L, 11, 800, null, "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone_12_black.png", null, Map.of("Color", "Black", "Storage", "256 gb"))
                )
        ));
        products.add(new Product(
                8L,
                15,
                "ABR4568",
                480,
                "APPLE iPhone 8 (Black, 64 GB)",
                "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284944/product/iphone8_mobile.png",
                380.0,
                true,
                new Brand(
                        5L,
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713274378/brand/apple.png",
                        "Apple",
                        265,
                        true
                ),
                "This is a Product description for iphone 8. There are more things that can be added but i am just practicing and nothing else.",
                4L,
                List.of(
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone8_mobile_back.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone8_mobile_dual_side.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone8_mobile_front.png",
                        "https://res.cloudinary.com/ddbvpbkql/image/upload/v1713284942/product/iphone8_mobile.png"
                ),
                "ProductType.single",
                List.of(
                        new ProductAttribute("Color", List.of("Green", "Red", "Blue", "Black")),
                        new ProductAttribute("Storage", List.of("128 gb", "256 gb"))
                ),
                new ArrayList<>()
        ));
        return products;
    }
}