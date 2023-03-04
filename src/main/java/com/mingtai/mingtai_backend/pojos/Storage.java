package com.mingtai.mingtai_backend.pojos;

import lombok.Data;

@Data
public class Storage {
    private int id;
    private int user_id;
    private int storage_status_id;
    private int location_from;
    private int location_to;
    private java.sql.Date create_time;
    private java.sql.Date modified_time;
}
