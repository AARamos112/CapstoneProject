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
		
	@RequestMapping("/appliances")
	public String appliances() 
	{
		return "appliances";
	}
	
	@RequestMapping("/faq")
	public String faq() 
	{
		return "faq";
	}
	
	@RequestMapping("/whatWeDo")
	public String whatWeDo() 
	{
		return "whatWeDo";
	}
	
	@RequestMapping("/floors")
	public String floors() 
	{
		return "floors";
	}
		
	@RequestMapping("/lighting")
	public String lighting() 
	{
		return "lighting";
	}
	
	@RequestMapping("/cabinets")
	public String cabinets() 
	{
		return "cabinets";
	}
	
	@RequestMapping("/sinks")
	public String sinks() 
	{
		return "sinks";
	}
	
	@RequestMapping("/signin")
	public String signin() 
	{
		return "signin";
	}
	
	@RequestMapping("/employeestart")
	public String employeestart() 
	{
		return "employeestart";
	}
	
	@RequestMapping("/aboutUs")
	public String aboutUs() 
	{
		return "aboutUs";
	}
	
	@RequestMapping("/construction")
	public String construction() 
	{
		return "construction";
	}

	 
	
}
