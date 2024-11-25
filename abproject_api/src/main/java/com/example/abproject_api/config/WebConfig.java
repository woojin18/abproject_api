package com.example.abproject_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // 모든 경로에 대해 CORS 허용
                        .allowedOrigins("http://localhost:3000") // React 앱 주소
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 허용 HTTP 메서드
                        .allowedHeaders("*") // 모든 헤더 허용
                        .allowCredentials(true); // 인증 정보를 포함한 요청 허용
            }
        };
    }
}
