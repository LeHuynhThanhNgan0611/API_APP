package com.codingwithn.shopapp.controller;

import com.codingwithn.shopapp.models.SortFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SortFilterController {
    @GetMapping("/sortFilters")
    public List<SortFilter> getAllSortFilter() {
        // Tạo danh sách chứa các đối tượng SortFilter
        List<SortFilter> sortFilters = new ArrayList<>();

        // Thêm các đối tượng SortFilter vào danh sách
        sortFilters.add(new SortFilter("1", "Name"));
        sortFilters.add(new SortFilter("2", "Lowest Price"));
        sortFilters.add(new SortFilter("3", "Most Popular"));
        sortFilters.add(new SortFilter("4", "Highest Price"));
        sortFilters.add(new SortFilter("5", "Newest"));
        sortFilters.add(new SortFilter("5", "Most Suitable"));


        // Trả về danh sách các đối tượng SortFilter
        return sortFilters;
    }
}
