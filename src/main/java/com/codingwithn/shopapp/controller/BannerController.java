package com.codingwithn.shopapp.controller;
import com.codingwithn.shopapp.models.Banner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BannerController {
    @GetMapping("/banners")
    public List<Banner> getAllBanner() {
        // Tạo danh sách chứa các banner
        List<Banner> banners = new ArrayList<>();

        // Thêm các banner vào danh sách
        banners.add(new Banner("https://res.cloudinary.com/ddbvpbkql/image/upload/v1713253502/banner/banner1.jpg", "/order"));
        banners.add(new Banner("https://res.cloudinary.com/ddbvpbkql/image/upload/v1713253502/banner/banner2.jpg", "/cart"));
        banners.add(new Banner("https://res.cloudinary.com/ddbvpbkql/image/upload/v1713253502/banner/banner3.jpg", "/favourites"));
        banners.add(new Banner("https://res.cloudinary.com/ddbvpbkql/image/upload/v1713253502/banner/banner4.jpg", "/search"));
        banners.add(new Banner("https://res.cloudinary.com/ddbvpbkql/image/upload/v1713253502/banner/banner5.jpg", "/settings"));
        banners.add(new Banner("https://res.cloudinary.com/ddbvpbkql/image/upload/v1713253502/banner/banner6.jpg", "/user-address"));
        banners.add(new Banner("https://res.cloudinary.com/ddbvpbkql/image/upload/v1713253502/banner/banner7.jpg", "route7"));
        banners.add(new Banner("https://res.cloudinary.com/ddbvpbkql/image/upload/v1713253502/banner/banner8.jpg", "/checkout"));

        // Trả về danh sách các banner
        return banners;
    }
}
