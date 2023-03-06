package com.mingtai.mingtai_backend.pojos;

import lombok.Data;

@Data
public class Inventory {
    private int id;
    private int orchid_id;
    private int location_id;
    private String inventory_status;
    private int quantity;
    private java.sql.Date expiration_time;
    private java.sql.Date create_time;
    private java.sql.Date modified_time;
    private int create_by;
    private int modified_by;
}
