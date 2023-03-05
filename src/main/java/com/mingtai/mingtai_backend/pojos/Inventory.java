package com.mingtai.mingtai_backend.pojos;

import lombok.Data;

@Data
public class Inventory {
    private int id;
    private int orchid_id;
    private int category_id;
    private int location_id;
    private int inventory_status_id;
    private int stock_movement_id;
    private int quantity;
    private java.sql.Date expiration_time;
    private java.sql.Date create_time;
    private java.sql.Date modified_time;
    private int create_by;
    private int modified_by;
}
