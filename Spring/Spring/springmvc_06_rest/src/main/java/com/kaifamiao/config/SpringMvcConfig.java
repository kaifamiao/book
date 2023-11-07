package com.kaifamiao.config;

import jdk.jfr.events.CertificateId;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.kaifamiao.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
