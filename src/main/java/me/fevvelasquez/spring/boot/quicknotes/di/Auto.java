package me.fevvelasquez.spring.boot.quicknotes.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Demo class.
 * 
 * @version 0.0.2 Using @Component, @Value, @Autowired in attributes.
 * @author fevvelasquez@gmail.com
 *
 */
@Component
public class Auto {
	@Value("2022")
	private Integer id;
	@Value("SPB Deluxe")
	private String name;
	@Autowired
	private Motor motor;

	@Override
	public String toString() {
		return "Auto [id=" + id + ", name=" + name + ", motor=" + motor + "]";
	}

}