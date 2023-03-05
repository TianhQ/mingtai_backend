package com.mingtai.mingtai_backend.mappers;

import com.mingtai.mingtai_backend.pojos.Inventory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface InventoryMapper {
    List<Inventory> selectAllInventories();

    boolean insertInventory(@Param("Inventory")Inventory inventory);

    boolean updateInventory(@Param("id") int id, @Param("Inventory") Inventory inventory);

    boolean deleteInventory(@Param("id") int id);
}
