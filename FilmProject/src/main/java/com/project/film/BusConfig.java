package com.project.film;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.project.film.filter.BusFilter;

@Configuration
public class BusConfig implements WebMvcConfigurer 
{
	@Bean
	public BusFilter getFilter() {
		return new BusFilter();
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) 
	{
		registry.addInterceptor(getFilter()).addPathPatterns("/*");
	}
}
