package com.mingtai.mingtai_backend.pojos;

import lombok.Data;

@Data
public class Orchid {
    private int id;
    private String orchid_name;
    private int category_id;
    private int parent_id;
    private String content;
    private java.sql.Date create_time;
    private java.sql.Date modified_time;

}
