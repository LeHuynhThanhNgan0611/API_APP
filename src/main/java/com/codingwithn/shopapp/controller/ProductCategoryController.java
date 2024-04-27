package com.codingwithn.shopapp.controller;

import com.codingwithn.shopapp.models.Banner;
import com.codingwithn.shopapp.models.ProductCategory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class ProductCategoryController {
    @GetMapping("/productCategories")
    public List<ProductCategory> getAllProductCategory() {
        List<ProductCategory> productCategories = new ArrayList<>();
        productCategories.add(new ProductCategory("001", "1"));
        productCategories.add(new ProductCategory("001", "8"));
        productCategories.add(new ProductCategory("004", "3"));
        productCategories.add(new ProductCategory("002", "3"));
        productCategories.add(new ProductCategory("002", "16"));
        productCategories.add(new ProductCategory("003", "3"));
        productCategories.add(new ProductCategory("005", "1"));
        productCategories.add(new ProductCategory("005", "8"));
        productCategories.add(new ProductCategory("040", "2"));
        productCategories.add(new ProductCategory("040", "15"));
        productCategories.add(new ProductCategory("006", "2"));
        productCategories.add(new ProductCategory("007", "4"));
        productCategories.add(new ProductCategory("009", "1"));
        productCategories.add(new ProductCategory("009", "8"));
        productCategories.add(new ProductCategory("010", "1"));
        productCategories.add(new ProductCategory("010", "8"));
        productCategories.add(new ProductCategory("011", "1"));
        productCategories.add(new ProductCategory("011", "8"));
        productCategories.add(new ProductCategory("012", "1"));
        productCategories.add(new ProductCategory("012", "8"));
        productCategories.add(new ProductCategory("013", "1"));
        productCategories.add(new ProductCategory("013", "8"));
        productCategories.add(new ProductCategory("014", "1"));
        productCategories.add(new ProductCategory("014", "9"));
        productCategories.add(new ProductCategory("015", "1"));
        productCategories.add(new ProductCategory("015", "9"));
        productCategories.add(new ProductCategory("016", "1"));
        productCategories.add(new ProductCategory("016", "9"));
        productCategories.add(new ProductCategory("017", "1"));
        productCategories.add(new ProductCategory("017", "9"));
        productCategories.add(new ProductCategory("018", "1"));
        productCategories.add(new ProductCategory("018", "10"));
        productCategories.add(new ProductCategory("019", "1"));
        productCategories.add(new ProductCategory("019", "10"));
        productCategories.add(new ProductCategory("020", "1"));
        productCategories.add(new ProductCategory("020", "10"));
        productCategories.add(new ProductCategory("021", "1"));
        productCategories.add(new ProductCategory("021", "10"));
        productCategories.add(new ProductCategory("022", "5"));
        productCategories.add(new ProductCategory("022", "11"));
        productCategories.add(new ProductCategory("023", "5"));
        productCategories.add(new ProductCategory("023", "11"));
        productCategories.add(new ProductCategory("024", "5"));
        productCategories.add(new ProductCategory("024", "11"));
        productCategories.add(new ProductCategory("025", "5"));
        productCategories.add(new ProductCategory("025", "11"));
        productCategories.add(new ProductCategory("026", "5"));
        productCategories.add(new ProductCategory("026", "12"));
        productCategories.add(new ProductCategory("027", "5"));
        productCategories.add(new ProductCategory("027", "12"));
        productCategories.add(new ProductCategory("028", "5"));
        productCategories.add(new ProductCategory("028", "12"));
        productCategories.add(new ProductCategory("029", "5"));
        productCategories.add(new ProductCategory("029", "13"));
        productCategories.add(new ProductCategory("030", "5"));
        productCategories.add(new ProductCategory("030", "13"));
        productCategories.add(new ProductCategory("031", "5"));
        productCategories.add(new ProductCategory("031", "13"));
        productCategories.add(new ProductCategory("032", "5"));
        productCategories.add(new ProductCategory("032", "13"));
        productCategories.add(new ProductCategory("033", "2"));
        productCategories.add(new ProductCategory("033", "14"));
        productCategories.add(new ProductCategory("034", "2"));
        productCategories.add(new ProductCategory("034", "14"));
        productCategories.add(new ProductCategory("035", "2"));
        productCategories.add(new ProductCategory("035", "14"));
        productCategories.add(new ProductCategory("036", "2"));
        productCategories.add(new ProductCategory("036", "14"));
        productCategories.add(new ProductCategory("037", "2"));
        productCategories.add(new ProductCategory("037", "15"));
        productCategories.add(new ProductCategory("038", "2"));
        productCategories.add(new ProductCategory("038", "15"));
        productCategories.add(new ProductCategory("039", "2"));
        productCategories.add(new ProductCategory("039", "15"));
        productCategories.add(new ProductCategory("008", "2"));
        return productCategories;
    }
}