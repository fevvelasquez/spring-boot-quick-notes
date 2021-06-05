package me.fevvelasquez.spring.boot.quicknotes.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
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
@Primary
public class Airplane implements Flyable {

	private static final Logger log = LoggerFactory.getLogger(Airplane.class);

	@Override
	public void fly() {
		log.info("Airplane flying..");
	}

}
