package com.scb.loanapi.userapi.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.scb.loanapi.userapi.service.LoanUserService;

@Configuration
@EnableWebSecurity
public class UserApiWebSecurity extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private Environment env;
	
	@Autowired
	private LoanUserService loanUserService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
		
	
}
