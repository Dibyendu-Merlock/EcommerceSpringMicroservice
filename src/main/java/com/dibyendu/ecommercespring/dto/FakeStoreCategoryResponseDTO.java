package com.dibyendu.ecommercespring.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FakeStoreCategoryResponseDTO
{
    private String status;
    private String name;
    private List<String> categories;
}
