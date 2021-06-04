package me.fevvelasquez.spring.boot.quicknotes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import me.fevvelasquez.spring.boot.quicknotes.di.Auto;

/**
 * Spring Boot Quick Notes.
 * 
 * @version 0.0.1 Using 'new' to instantiate objects.
 * @author fevvelasquez@gmail.com
 *
 */
@SpringBootApplication
public class SpringBootQuickNotesApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringBootQuickNotesApplication.class);

	public static void main(String[] args) {
		// SpringApplication.run(SpringBootQuickNotesApplication.class, args);
		Auto auto = new Auto();

		log.info("{}", auto);

	}

}