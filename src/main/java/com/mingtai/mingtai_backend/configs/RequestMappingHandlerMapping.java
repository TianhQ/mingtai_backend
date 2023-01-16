package com.mingtai.mingtai_backend.configs;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RequestMappingHandlerMapping implements WebMvcRegistrations {
    @Override
    public org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping getRequestMappingHandlerMapping(){
        return new ApiRequestMappingHandlerMapping();
    }
}