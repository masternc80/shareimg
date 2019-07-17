package com.shareimg.dishes;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

@Configuration
@EnableWebSecurity
public class DevConfig extends WebSecurityConfigurerAdapter {
	
	  @Override
	  protected void configure(HttpSecurity http) throws Exception {
	    // @formatter:off
	    http
	      .authorizeRequests()
	        .anyRequest().permitAll()
	      .and().csrf().disable();
	    // @formatter:on
	  }

	  @Bean
	  public WebMvcConfigurer corsConfigurer() {
	    return new WebMvcConfigurer() {
	      @Override
	      public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/dishes")
	          .allowedOrigins("*")
	          .allowedMethods("*");
	      }
	    };
	  }
}
