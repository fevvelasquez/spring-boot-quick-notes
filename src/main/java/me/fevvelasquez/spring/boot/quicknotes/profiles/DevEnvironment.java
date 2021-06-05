package me.fevvelasquez.spring.boot.quicknotes.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Demo class.
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
@Profile(value = { "dev", "default" }) // If application.properties neither VM arg has been specified, default is
										// selected.
public class DevEnvironment implements EnvironmentService {

	@Override
	public String getEnvironment() {
		return "Dev";
	}

}
