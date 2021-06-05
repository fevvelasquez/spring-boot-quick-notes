package me.fevvelasquez.spring.boot.quicknotes.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Demo class.
 * 
 * @version 0.0.4 Using @Qualifier and @Primary for cases with multiple
 *          implementation.
 * @author fevvelasquez@gmail.com
 *
 */
@Component
public class Dog extends Animal {

	public Dog(@Value("Snoopy") String name) {
		super(name);
	}

}
