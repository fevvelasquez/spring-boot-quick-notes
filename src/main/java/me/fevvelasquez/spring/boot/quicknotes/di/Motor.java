package me.fevvelasquez.spring.boot.quicknotes.di;

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
public class Motor {
	@Value("2022")
	private Integer id;
	private String name;

	public String toString() {
		return "Motor [id=" + id + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	@Value("Setter Motor")
	public void setName(String name) {
		this.name = name;
	}

}