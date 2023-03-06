package com.mingtai.mingtai_backend.controllers;

import com.mingtai.mingtai_backend.configs.ApiVersion;
import com.mingtai.mingtai_backend.pojos.AuthenticationRequest;
import com.mingtai.mingtai_backend.pojos.AuthenticationResponse;
import com.mingtai.mingtai_backend.pojos.RegisterRequest;
import com.mingtai.mingtai_backend.services.interfaces.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/{version}/auth")
@ApiVersion(1)
public class AuthController {

    @Resource
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ){
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/accounts")
    public UserDetails testacc( @RequestBody String request){
        return authService.testacc(request);
    }
    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(
            @RequestBody AuthenticationRequest request
    ){
        return ResponseEntity.ok(authService.login(request));
    }
}
