package com.mingtai.mingtai_backend.pojos;

import lombok.Data;

import java.util.List;

@Data
public class Category {
    private int id;
    private int parent_id;
    private String category_name;
    private java.sql.Date create_time;
    private java.sql.Date modified_time;
    private int hierarchy_id;
    private List<Category> children;
}