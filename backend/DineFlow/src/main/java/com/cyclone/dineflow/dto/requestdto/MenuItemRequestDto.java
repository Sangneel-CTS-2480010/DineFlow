package com.cyclone.dineflow.dto.requestdto;

import com.cyclone.dineflow.entity.data.MenuCategory;

/**
 * [Detailed description of the class's responsibility]
 * * @author 2480010
 *
 * @version 1.0
 * @since 06-05-2026
 */
public record MenuItemRequestDto(
        String name,
        String description,
        Integer basePrice,
        MenuCategory menuCategory,
        Integer preparationTimeInMinutes
)
{}
