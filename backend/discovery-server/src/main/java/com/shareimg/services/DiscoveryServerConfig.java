package com.shareimg.services;

import lombok.extern.slf4j.Slf4j;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Slf4j
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class DiscoveryServerConfig extends WebSecurityConfigurerAdapter {
  
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    log.info("Initializing authentication provider...");
    auth.inMemoryAuthentication()
      .withUser("discovery")
      .password("{noop}WuzrZJp4xsvGU")
      .roles("USER");
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    log.info("Configuring http security...");
    http.authorizeRequests()
      .anyRequest().authenticated()
      .and().httpBasic()
      .and().csrf().disable();
  }

}
