package me.fevvelasquez.spring.boot.quicknotes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import me.fevvelasquez.spring.boot.quicknotes.di.Auto;

/**
 * Spring Boot Quick Notes.
 * 
 * @version 0.0.3 Using @Component, @Value, @Autowired in the
 *          constructor/setters.
 * @author fevvelasquez@gmail.com
 *
 */
@SpringBootApplication
public class SpringBootQuickNotesApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringBootQuickNotesApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootQuickNotesApplication.class, args);

		Auto auto = ctx.getBean(Auto.class);
		log.info("{}", auto);

	}

}