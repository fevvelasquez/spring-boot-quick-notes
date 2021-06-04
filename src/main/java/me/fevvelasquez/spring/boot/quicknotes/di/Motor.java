package me.fevvelasquez.spring.boot.quicknotes.di;

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
public class Motor {
	@Value("2022")
	private Integer id;
	@Value("Standard Motor SPB")
	private String name;

	public String toString() {
		return "Motor [id=" + id + ", name=" + name + "]";
	}

}