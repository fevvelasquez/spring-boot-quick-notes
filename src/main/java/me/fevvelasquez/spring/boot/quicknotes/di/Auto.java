package me.fevvelasquez.spring.boot.quicknotes.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Demo class.
 * 
 * @version 0.0.3 Using @Component, @Value, @Autowired in the
 *          constructor/setters.
 * @author fevvelasquez@gmail.com
 *
 */
@Component
public class Auto {
	private Integer id;
	private String name;
	private Motor motor;

	@Autowired
	public Auto(@Value("2022") Integer id, @Value("Constructor Auto") String name, Motor motor) {
		super();
		this.id = id;
		this.name = name;
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Auto [id=" + id + ", name=" + name + ", motor=" + motor + "]";
	}

}