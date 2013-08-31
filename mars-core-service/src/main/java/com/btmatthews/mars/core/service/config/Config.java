package com.btmatthews.mars.core.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * Created by bmatthews68 on 11/06/2013.
 */
@Configuration
@ComponentScan(basePackages = "com.btmatthews.mars.core.service.impl")
public class Config {

    @Bean
    public LocalValidatorFactoryBean validator() {
        return new LocalValidatorFactoryBean();
    }
}
