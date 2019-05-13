package com.example.oauth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * 创建者 bee
 * 类名称
 * 类说明
 * 创建时间 2019/4/29
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
    @Override
    @Bean
    public UserDetailsService userDetailsServiceBean() throws Exception {
        return super.userDetailsServiceBean();
    }


    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication().passwordEncoder(new MyPasswordEncoder()).
                    withUser("john.carnell")
                 .password("password1")
                 .roles("USER")
                 .and()
                .withUser("william.woodward")
                .password("password2")
                .roles("USER", "ADMIN");;

    }
}
