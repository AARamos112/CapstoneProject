package com.Angel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		String[] staticResources  =  {
		        "/css/**",
		        "/images/**",
		        "/fonts/**",
		        "/scripts/**",
		    };
		
		http
			.authorizeRequests()
			    .antMatchers(staticResources).permitAll()
				.antMatchers("/", "/signin", "/locations", "/cabinets", "/countertops", "/appliances", "/faq", "/floors", "/index", "/lighting", "/products", "/services", "/sinks", "/test", "/whatWeDo", "/aboutUs").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/signin")
				.permitAll()
				.and()
			.logout()
				.permitAll();
	}

	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		UserDetails user =
			 User.withUsername("user")
				.password("{bcrypt}$2a$10$VYBlEC25cfzpK/ugoPrNl.rEFbe4lc57VXAgWiGs9/4W01kjet2pi")
				.roles("USER")
				.build();

		return new InMemoryUserDetailsManager(user);
	}
}
