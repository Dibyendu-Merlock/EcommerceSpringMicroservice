package com.dibyendu.ecommercespring.controller;


import com.dibyendu.ecommercespring.dto.CategoryDTO;
import com.dibyendu.ecommercespring.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController
{

    // Injecting the CategoryService to handle category-related operations
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService)
    {
        this.categoryService = categoryService;
    }


    // API endpoint to get all categories
    @GetMapping
    public List<CategoryDTO> getAllCategories() throws IOException
    {
        return categoryService.getAllCategories();
    }

}
