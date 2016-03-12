/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tko.backend;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.boot.context.embedded.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author tomek
 */
@Configuration
public class Initializer implements ServletContextInitializer{
    @Override
    public void onStartup(ServletContext sc) throws ServletException {
        sc.setInitParameter("primefaces.CLIENT_SIDE_VALIDATION", "true");
        sc.setInitParameter("com.sun.faces.forceLoadConfiguration", "true");
        sc.setInitParameter("javax.faces.PROJECT_STAGE", "Development");
    }
    
    
}
