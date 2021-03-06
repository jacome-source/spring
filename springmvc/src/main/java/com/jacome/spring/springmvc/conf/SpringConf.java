package com.jacome.spring.springmvc.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @EnableWebMvc: Permite utilização de annotations de contexto web no projeto, como RequestMapping
 * @ComponentScan Varre o package adicionando os beans
 * @Configuration Identifica arquivo de configuração a ser utilizado pelo ApplicationContext
 * 
 * @author diego
 *
 */
@EnableWebMvc
@ComponentScan("com.jacome.spring.springmvc")
@Configuration
public class SpringConf implements WebMvcConfigurer{

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	/**
	 * Informa que o DispatcherServlet (DefaultServletHandler) deve tratar todas as requisições
	 */
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
