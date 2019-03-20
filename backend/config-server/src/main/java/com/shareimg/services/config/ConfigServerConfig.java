package com.shareimg.services.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ConfigServerConfig extends WebSecurityConfigurerAdapter {
  
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    log.info("Initializing authentication provider...");
    auth.inMemoryAuthentication().withUser("config-user").password("{noop}config-password").roles("USER");
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    log.info("Configuring http security...");
    // @formatter:off
    http
      .authorizeRequests()
        .anyRequest().authenticated()
      .and().httpBasic()
      .and().csrf().disable();
    // @formatter:on
  }

}
