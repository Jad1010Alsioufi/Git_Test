package com.example.MyFirstProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.List;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain configure(HttpSecurity chainBuilder) throws Exception {

        chainBuilder.authorizeHttpRequests(
                configurer -> configurer.requestMatchers("/hello", "/welcome", "/login", "/bad").permitAll()
                        .anyRequest().authenticated()
        ).oauth2Login(Customizer.withDefaults());

        return chainBuilder.build();
    }

//    @Bean
//    public SecurityFilterChain configure(HttpSecurity chainBuilder) throws Exception {
//
//        chainBuilder.authorizeHttpRequests(
//                configurer -> configurer.requestMatchers("/hello", "/welcome", "/login", "/bad").permitAll()
//                        .anyRequest().authenticated()
//        ).formLogin(customizer -> customizer
//                .loginPage("/login")
//                .loginProcessingUrl("/process")
//                .defaultSuccessUrl("/welcome", true)
//                .usernameParameter("username")
//                .passwordParameter("password")
//                .failureUrl("/bad"));
//
//        return chainBuilder.build();
//    }

    // Don't need it by using GitHub ...
    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(new User("a", "{noop}b", List.of()));
        return manager;
    }

}