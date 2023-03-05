package com.mingtai.mingtai_backend.services.impl;

import com.mingtai.mingtai_backend.mappers.InventoryMapper;
import com.mingtai.mingtai_backend.pojos.Inventory;
import com.mingtai.mingtai_backend.services.interfaces.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryMapper inventoryMapper;
    @Override
    public List<Inventory> selectAllInventories() {
        return inventoryMapper.selectAllInventories();
    }

    @Override
    public boolean insertInventory(Inventory inventory) {
        return inventoryMapper.insertInventory(inventory);
    }

    @Override
    public boolean updateInventory(int id, Inventory inventory) {
        return inventoryMapper.updateInventory(id, inventory);
    }

    @Override
    public boolean deleteInventory(int id) {
        return inventoryMapper.deleteInventory(id);
    }
}
