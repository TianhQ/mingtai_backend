package com.mingtai.mingtai_backend.pojos;

import lombok.Data;

@Data
public class Item {
    private int id;
    private int orchid_id;
    private int category_id;
    private int item_status_id;
    private int storage_id;
    private int quantity;
    private java.sql.Date expiration_time;
    private java.sql.Date create_time;
    private java.sql.Date modified_time;
    private int creat_by;
    private int modified_by;
}
