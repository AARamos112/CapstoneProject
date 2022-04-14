package com.Angel;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/hello").setViewName("hello");
		registry.addViewController("/signin").setViewName("login");
		registry.addViewController("/locations").setViewName("locations");
		registry.addViewController("/cabinets").setViewName("cabinets");
		registry.addViewController("/countertops").setViewName("countertops");
		registry.addViewController("/faq").setViewName("faq");
		registry.addViewController("/floors").setViewName("floors");
		registry.addViewController("/index").setViewName("Main");
		registry.addViewController("/lighting").setViewName("lighting");
		registry.addViewController("/products").setViewName("products");
		registry.addViewController("/services").setViewName("services");
		registry.addViewController("/sinks").setViewName("sinks");
		registry.addViewController("/test").setViewName("test");
		registry.addViewController("/whatWeDo").setViewName("whatWeDo");
		registry.addViewController("/appliances").setViewName("appliances");
	}

}