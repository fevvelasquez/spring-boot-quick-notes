package me.fevvelasquez.spring.boot.quicknotes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import me.fevvelasquez.spring.boot.quicknotes.profiles.EnvironmentService;
import me.fevvelasquez.spring.boot.quicknotes.qualifiers.Airplane;
import me.fevvelasquez.spring.boot.quicknotes.qualifiers.Animal;
import me.fevvelasquez.spring.boot.quicknotes.qualifiers.Bird;
import me.fevvelasquez.spring.boot.quicknotes.qualifiers.Dog;
import me.fevvelasquez.spring.boot.quicknotes.qualifiers.Flyable;
import me.fevvelasquez.spring.boot.quicknotes.qualifiers.Nest;

/**
 * Spring Boot Quick Notes.
 * 
 * @version 0.0.5. Profiles: @Profile, 
 * 					application.properties or 
 * 					VM argument as "-Dspring.profiles.active=dev" or 
 * 					"default". 
 * 					VM has max priority.
 * @author fevvelasquez@gmail.com
 *
 */
@SpringBootApplication
public class SpringBootQuickNotesApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringBootQuickNotesApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootQuickNotesApplication.class, args);

		EnvironmentService es = ctx.getBean(EnvironmentService.class);
		log.info("Active environment: {}", es.getEnvironment());

	}

	@SuppressWarnings("unused")
	private static void qualifiers(ConfigurableApplicationContext ctx) {
		// Qualifiers / Primary example:
		Animal animal1 = ctx.getBean(Dog.class);
		log.info("{}", animal1);

		Animal animal2 = ctx.getBean(Bird.class);
		log.info("{}", animal2);

		Flyable flyable1 = ctx.getBean(Airplane.class);
		flyable1.fly();

		Flyable flyable2 = ctx.getBean(Bird.class);
		flyable2.fly();

		// Primary:
		Flyable flyable3 = ctx.getBean(Flyable.class);
		flyable3.fly();

		// Qualifier by getBean
		Flyable flyable4 = ctx.getBean("bird", Flyable.class);
		flyable4.fly();

		// Qualifier into Nest
		Nest nest = ctx.getBean(Nest.class);
		log.info("{}", nest);
	}

}