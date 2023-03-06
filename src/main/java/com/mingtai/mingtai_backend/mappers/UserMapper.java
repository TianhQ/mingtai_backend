package com.mingtai.mingtai_backend.mappers;

import com.mingtai.mingtai_backend.pojos.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.userdetails.UserDetails;

@Mapper
public interface UserMapper {
    UserDetails loadUserByUsername( @Param("username") String username);
    void saveUser(@Param("user")User user);
}
