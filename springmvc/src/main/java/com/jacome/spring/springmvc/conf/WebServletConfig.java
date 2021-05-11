package com.jacome.spring.springmvc.conf;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConfig implements WebApplicationInitializer {

	// Método executado ao subir container
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(SpringConf.class);
		
		// Configura o DispatcherServlet e substitui web.xml
		// Criar o servlet com o nome de dispatcher
		// Informa que o dispatcher deve ser iniciado assim que o container subir
		// Mapeia a url do dispatcher
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(webContext));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}

}
