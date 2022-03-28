package com.codejava.cm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.codejava.cm")
public class WebMvcConfig {

	@Bean 
	  public ViewResolver getViewResolver(){
		  
		  InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		  resolver.setPrefix("/WEB-INF/views/"); 
		  resolver.setSuffix(".jsp"); 
		  return resolver;
	  }
	 

}
