package com.mingtai.mingtai_backend.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class RegisterRequest {
    private String firstname;
    private String lastname;
    private String username;
    private String password;
}
