package com.cyclone.dineflow.service;

import com.cyclone.dineflow.dto.requestdto.MenuItemRequestDto;
import com.cyclone.dineflow.dto.responsedto.MenuItemResponseDto;

import java.util.List;

/**
 * [Detailed description of the class's responsibility]
 * * @author 2480010
 *
 * @version 1.0
 * @since 06-05-2026
 */
public interface MenuItemService {
    MenuItemResponseDto createMenuItem(MenuItemRequestDto menuItemRequestDto, String categoryId);

    List<MenuItemResponseDto> getMenuItemsOfBranch(String branchId);

    List<MenuItemResponseDto> getMenuItemsOfCategory(String categoryId);

    MenuItemResponseDto getParticularMenuItem(String menuItemId);

    String updateParticularMenuItem(MenuItemRequestDto menuItemRequestDto, String menuItemId);

    String deleteMenuItem(String menuItemId);

    String toggleMenuItemAvailability(String id, String availability);
}
