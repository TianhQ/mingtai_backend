package com.mingtai.mingtai_backend.pojos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Role {
    public static final String USER = "USER";
    public static final String ADMIN = "ADMIN";
    private int id;
    private String role;
}
