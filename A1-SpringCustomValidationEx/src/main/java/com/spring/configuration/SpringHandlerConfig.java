package com.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.spring"})
@PropertySource(value="classpath:application.properties")
public class SpringHandlerConfig {

	@Bean
	public InternalResourceViewResolver viewRFesolver()
	{
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	@Bean
	public ResourceBundleMessageSource resourceBundle()
	{
		ResourceBundleMessageSource resourceBundle=new ResourceBundleMessageSource();
		resourceBundle.setBasename("classpath:application.properties");
		return resourceBundle;
	}
}
