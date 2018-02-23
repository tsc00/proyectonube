package com.iesemilidarder.proyectonube.restapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

/**
 * proyectonube
 * com.iesemilidarder.proyectonube.restapi.controller
 * Created by Tomás in 22/2/2018
 * Description:
 **/


@Configuration
public class StartConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**");
            }
            @Bean
            public FreeMarkerViewResolver freemarkerViewResolver() {
                FreeMarkerViewResolver resuelve = new FreeMarkerViewResolver();
                resuelve.setCache(true);
                resuelve.setPrefix("");
                resuelve.setSuffix(".ftl");
                return resuelve;
            }
        };
    }
    }
/*
Tomás Sastre Cámara
2n ASIX
*/