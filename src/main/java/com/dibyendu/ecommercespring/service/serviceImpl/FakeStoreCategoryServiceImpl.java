package com.dibyendu.ecommercespring.service.serviceImpl;

import com.dibyendu.ecommercespring.dto.CategoryDTO;
import com.dibyendu.ecommercespring.gateway.CategoryGateway;
import com.dibyendu.ecommercespring.service.CategoryService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreCategoryServiceImpl implements CategoryService
{
    private final CategoryGateway categoryGateway;

    public FakeStoreCategoryServiceImpl(CategoryGateway categoryGateway)
    {
        this.categoryGateway = categoryGateway;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException
    {
        return this.categoryGateway.getAllCategories();
    }
}
