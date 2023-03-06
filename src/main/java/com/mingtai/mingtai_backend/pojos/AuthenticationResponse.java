package com.mingtai.mingtai_backend.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.hql.internal.classic.Parser;

@Data
@Builder
public class AuthenticationResponse {
    private String token;
}
