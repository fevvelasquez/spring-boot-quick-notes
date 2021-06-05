package me.fevvelasquez.spring.boot.quicknotes.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Demo.
 * 
 * @version 0.0.5. Profiles: @Profile, 
 * 					application.properties or 
 * 					VM argument as "-Dspring.profiles.active=dev" or 
 * 					"default". 
 * 					VM has max priority.
 * @author fevvelasquez@gmail.com
 *
 */
@Service
@Profile("qa")
public class QaEnvironment implements EnvironmentService {

	@Override
	public String getEnvironment() {
		return "Qa";
	}

}
