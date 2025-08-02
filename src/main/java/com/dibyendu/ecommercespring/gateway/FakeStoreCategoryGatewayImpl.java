package com.dibyendu.ecommercespring.gateway;

import com.dibyendu.ecommercespring.dto.CategoryDTO;
import com.dibyendu.ecommercespring.dto.FakeStoreCategoryResponseDTO;
import com.dibyendu.ecommercespring.gateway.api.FakeStoreCategoryAPI;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


@Service
public class FakeStoreCategoryGatewayImpl implements CategoryGateway
{
    private final FakeStoreCategoryAPI fakeStoreCategoryAPI;

    public FakeStoreCategoryGatewayImpl(FakeStoreCategoryAPI fakeStoreCategoryAPI)
    {
        this.fakeStoreCategoryAPI = fakeStoreCategoryAPI;
    }


    @Override
    public List<CategoryDTO> getAllCategories() throws IOException
    {
        FakeStoreCategoryResponseDTO response = fakeStoreCategoryAPI.getAllCategories().execute().body();
        if (response == null)
        {
            throw new IOException("Failed to fetch categories from FakeStore API");
        }
        return response.getCategories().stream()
                .map(category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                .toList();
    }
}
