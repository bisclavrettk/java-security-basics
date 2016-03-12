/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tko.backend;

import com.sun.faces.config.ConfigureListener;
import javax.faces.webapp.FacesServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletListenerRegistrationBean;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author tomek
 */
@Configuration
@ComponentScan(basePackages = {"tko.backend"})
@EnableAutoConfiguration(exclude={WebMvcAutoConfiguration.class,DispatcherServletAutoConfiguration.class })
public class MainClass extends SpringBootServletInitializer {
    
    public static void main(String []args) {
        SpringApplication.run(MainClass.class, args);
    }
    
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        FacesServlet fs = new FacesServlet();
        ServletRegistrationBean srb = new ServletRegistrationBean(fs, "*.xhtml", "*.jsf");
        srb.setLoadOnStartup(1);
        return srb;
    }
    
    @Bean
    public ServletListenerRegistrationBean<ConfigureListener> jsfConfigureListener() {
        return new ServletListenerRegistrationBean<>(new ConfigureListener());
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(new Class[]{MainClass.class, Initializer.class});
    }
}
