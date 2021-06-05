package me.fevvelasquez.spring.boot.quicknotes.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
public class Nest {

	@Autowired
	@Qualifier("bird")
	private Animal animal;

	@Override
	public String toString() {
		return "Nest [animal=" + animal + "]";
	}

}
