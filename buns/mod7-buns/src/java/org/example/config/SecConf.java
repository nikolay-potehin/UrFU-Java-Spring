package org.example.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;


import javax.sql.DataSource;

@EnableWebSecurity
public class SecConf extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource ds;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(ds);


    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").hasAnyRole("MANAGER", "HR", "EMPLOYEE")
                .antMatchers("/hr_info/**").hasRole("HR")
                .antMatchers("/manager_info/**").hasRole("MANAGER")
                .and()
                .formLogin()
                .permitAll();
    }
}
