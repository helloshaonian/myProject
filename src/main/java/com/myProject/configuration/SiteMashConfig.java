/*package com.myProject.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class SiteMashConfig extends WebMvcConfigurerAdapter {
	
	@Autowired
	WebSiteMeshFilter siteMeshFilter;
	
	@Bean
	@Order(Integer.MIN_VALUE)
	public FilterRegistrationBean siteMeshFilter() {
		FilterRegistrationBean fitler = new FilterRegistrationBean();
		fitler.setFilter(siteMeshFilter);
		return fitler;
	}
}
*/