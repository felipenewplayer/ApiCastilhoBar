package com.example.felipe.burguerApi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.List;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
<<<<<<< HEAD
        config.setAllowedOrigins(List.of("https://castilhos-lta49ocml-felipenewplayers-projects.vercel.app/","http://localhost:5173"));
=======
    config.setAllowedOrigins(List.of("https://castilhos-lta49ocml-felipenewplayers-projects.vercel.app", "https://castilhos-lta49ocml-felipenewplayers-projects.vercel.app/signUp"));
>>>>>>> ab87624bf59efd5cedce7d06639b904071b97efc
        config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        config.setAllowedHeaders(List.of("Authorization", "Content-Type"));
        config.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    }
}
