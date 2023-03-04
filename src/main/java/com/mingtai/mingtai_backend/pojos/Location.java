package com.mingtai.mingtai_backend.pojos;

import lombok.Data;

@Data
public class Location {

    private int id;
    private int parent_id;
    private String location_name;
    private java.sql.Date create_time;
    private java.sql.Date modified_time;

}
