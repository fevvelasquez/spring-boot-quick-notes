package me.fevvelasquez.spring.boot.quicknotes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Demo class.
 * 
 * @version 0.0.7 Loading properties: @Configuration, @PropertySource
 * @author fevvelasquez@gmail.com
 *
 */
@Configuration
@PropertySource("classpath:motor.properties")
public class MotorPropertyConfiguration {
	@Bean
	public PropertySourcesPlaceholderConfigurer loadProperties() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
