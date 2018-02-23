package com.iesemilidarder.proyectonube.restapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * proyectonube
 * com.iesemilidarder.proyectonube.restapi.controller
 * Created by Tomás in 22/2/2018
 * Description:
 **/
//Esta clase se utiliza para decir que url va a cada pagina

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
    }

}
/*
Tomás Sastre Cámara
2n ASIX
*/
