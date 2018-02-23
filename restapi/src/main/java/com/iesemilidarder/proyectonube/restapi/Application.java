package com.iesemilidarder.proyectonube.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * proyectonube
 * com.iesemilidarder.proyectonube.restapi
 * Created by Tomás in 22/2/2018
 * Description:
 **/

//Esta clase sirve para poder arrancar la aplicacion

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
/*
Tomás Sastre Cámara
2n ASIX
*/
