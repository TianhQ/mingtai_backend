package com.mingtai.mingtai_backend.services.interfaces;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface JwtService {
    String extractUserName(String jwt);
    public String generateToken(
            Map<String, Object> extraClaims,
            UserDetails userDetails
    );
    public String generateToken(
            UserDetails userDetails
    );

    public boolean isTokenValid(String token, UserDetails userDetails);
//    Claims extractAllClaims(String jwt);

}
