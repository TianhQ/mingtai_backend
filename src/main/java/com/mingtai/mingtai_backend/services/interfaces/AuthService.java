package com.mingtai.mingtai_backend.services.interfaces;

import com.mingtai.mingtai_backend.pojos.AuthenticationRequest;
import com.mingtai.mingtai_backend.pojos.AuthenticationResponse;
import com.mingtai.mingtai_backend.pojos.RegisterRequest;
import com.mingtai.mingtai_backend.pojos.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {

    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse login(AuthenticationRequest request);

    UserDetails testacc(String request);
}
