package com.mingtai.mingtai_backend.controllers;


import com.mingtai.mingtai_backend.configs.ApiVersion;
import com.mingtai.mingtai_backend.pojos.Inventory;
import com.mingtai.mingtai_backend.services.interfaces.InventoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.persistence.Version;
import java.util.List;

@RestController
@RequestMapping("/api/{version}/")
@ApiVersion(1)
public class InventoryController {
    @Resource
    private InventoryService inventoryService;

    @GetMapping("/inventories")
    public List<Inventory> selectAllInventories(){
        return inventoryService.selectAllInventories();
    }

    @PostMapping("/inventories")
    public boolean insertInventory(@RequestBody Inventory inventory){
    return inventoryService.insertInventory(inventory);
    }

    @PutMapping("/inventories")
    public boolean updateInventory(@RequestParam(value = "id") int id, @RequestBody Inventory inventory){
    return inventoryService.updateInventory(id, inventory);
    }

    @DeleteMapping("/inventories")
    public boolean deleteInventory(@RequestParam(value = "id") int id){
        return inventoryService.deleteInventory(id);
    }

}
