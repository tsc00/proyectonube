package com.iesemilidarder.proyectonube.restapi.security;

import com.iesemilidarder.proyectonube.restapi.config.SecurityConfig;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * proyectonube
 * com.iesemilidarder.proyectonube.restapi.security
 * Created by Tomás in 22/2/2018
 * Description:
 **/


public class CustomBasicAuthenticationEntryPoint extends BasicAuthenticationEntryPoint {

    @Override
    public void commence(final HttpServletRequest request, 
    		final HttpServletResponse response, 
    		final AuthenticationException authException) throws IOException, ServletException {
    	
    	response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
    	response.addHeader("WWW-Authenticate", "Basic realm=" + getRealmName() + "");
        
        PrintWriter writer = response.getWriter();
        writer.println("HTTP Status 401 : " + authException.getMessage());
    }
    
    @Override
    public void afterPropertiesSet() throws Exception {
        setRealmName(SecurityConfig.REALM);
        super.afterPropertiesSet();
    }
}
/*
Tomás Sastre Cámara
2n ASIX
*/