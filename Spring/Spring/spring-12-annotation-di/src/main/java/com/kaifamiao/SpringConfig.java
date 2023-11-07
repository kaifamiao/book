package com.kaifamiao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.kaifamiao")
@PropertySource("jdbc.properties")
public class SpringConfig {
}