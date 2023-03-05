package com.mingtai.mingtai_backend.services.interfaces;

import com.mingtai.mingtai_backend.pojos.Inventory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InventoryService {
    List<Inventory> selectAllInventories();

    boolean insertInventory(Inventory inventory);

    boolean updateInventory(int id, Inventory inventory);

    boolean deleteInventory(int id);
    }