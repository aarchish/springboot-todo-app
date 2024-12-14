package com.jstech.springboot.todoapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.function.Function;

@Configuration
public class SpringSecurityConfiguration {
    // use a db for user data

    // currently using In-Memory DB

    //InMemoryUserDetailsManager

    @Bean
    public InMemoryUserDetailsManager createUserDetailsManager() {

        UserDetails user1 = createNewUser("aarchish", "password", "USER", "ADMIN");
        UserDetails user2 = createNewUser("aarchishjindal", "password", "USER", "ADMIN");

        return new InMemoryUserDetailsManager(user1, user2);
    }

    private UserDetails createNewUser(String username, String password, String role, String userLevel) {

        Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);

        UserDetails userDetails = User.builder()
                .passwordEncoder(passwordEncoder)
                .username(username)
                .password(password)
                .roles(role, userLevel)
                .build();

        return userDetails;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
