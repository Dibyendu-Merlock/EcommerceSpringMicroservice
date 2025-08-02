package com.dibyendu.ecommercespring.gateway;

import com.dibyendu.ecommercespring.dto.CategoryDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public interface CategoryGateway
{
    List<CategoryDTO> getAllCategories() throws IOException;
}
