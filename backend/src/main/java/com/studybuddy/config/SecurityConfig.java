package com.studybuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.studybuddy.security.JwtFilter;

@Configuration
public class SecurityConfig {

    @Autowired
    private JwtFilter jwtFilter;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable())
                .cors(cors -> {
                })
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/auth/**").permitAll()
                        .requestMatchers("/users/register").permitAll()
                        .requestMatchers("/admin/**").hasAuthority("ADMIN")
                        .requestMatchers("/student/**").hasAuthority("STUDENT")
                        .requestMatchers("/courses/**").permitAll()
                        .requestMatchers("/courses/all").permitAll()
                        .requestMatchers("/courses/create").hasAuthority("ADMIN")
                        .requestMatchers("/courses/all").permitAll()
                         .requestMatchers("/ai/explain").permitAll()
                        .requestMatchers("/courses/{id}").permitAll()
                        .requestMatchers("/courses/create").hasAuthority("ADMIN")
                        .requestMatchers("/courses/update/**").hasAuthority("ADMIN")
                        .requestMatchers("/courses/delete/**").hasAuthority("ADMIN")
                        .requestMatchers("/lessons/**").permitAll()
                        .requestMatchers("/modules/**").permitAll()
                        .anyRequest().authenticated())
                .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}