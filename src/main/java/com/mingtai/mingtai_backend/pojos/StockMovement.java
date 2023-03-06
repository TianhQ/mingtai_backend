package com.mingtai.mingtai_backend.pojos;

import lombok.Data;

@Data
public class StockMovement {
    private int id;
    private int user_id;
    private int orchid_id;
    private String user_firstname;
    private String user_lastname;
    private String movement_type;
    private int location_from;
    private int location_to;
    private java.sql.Date movement_time;
    private java.sql.Date modified_time;
}
