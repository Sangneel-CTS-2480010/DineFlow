package com.cyclone.dineflow.dtomapper;

import com.cyclone.dineflow.dto.responsedto.MenuItemResponseDto;
import com.cyclone.dineflow.entity.MenuItem;

/**
 * [Detailed description of the class's responsibility]
 * * @author 2480010
 *
 * @version 1.0
 * @since 06-05-2026
 */
public class MenuItemResponseDtoMapper {
    public static MenuItemResponseDto toDto(MenuItem menuItem, String message) {
        return new MenuItemResponseDto(
                menuItem.getName(),
                menuItem.getCategory().getName(),
                menuItem.getDescription(),
                menuItem.getBasePrice(),
                menuItem.getMenuCategory(),
                menuItem.getPreparationTimeInMinutes(),
                message
        );
    }
}
