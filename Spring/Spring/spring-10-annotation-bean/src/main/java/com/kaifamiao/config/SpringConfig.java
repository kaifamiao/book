package com.kaifamiao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.kaifamiao")
@ComponentScan(basePackages = {"com.kaifamiao.dao", "com.kaifamiao.service"})
public class SpringConfig {
}
