package com.Angel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() 
	{
		return "index";
	}

	@RequestMapping("/test")
	public String test() 
	{
		return "test";
	}
	
	@RequestMapping("/locations")
	public String locations() 
	{
		return "locations";
	}

	@RequestMapping("/services")
	public String services() 
	{
		return "services";
	}
	
	@RequestMapping("/products")
	public String products() 
	{
		return "products";
	}
	
	
	@RequestMapping("/appliances")
	public String appliances() 
	{
		return "appliances";
	}
	
}
