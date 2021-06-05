package me.fevvelasquez.spring.boot.quicknotes.profiles;

/**
 * Demo interface.
 * 
 * @version 0.0.5. Profiles: @Profile, 
 * 					application.properties or 
 * 					VM argument as "-Dspring.profiles.active=dev" or 
 * 					"default". 
 * 					VM has max priority.
 * @author fevvelasquez@gmail.com
 *
 */
public interface EnvironmentService {

	public String getEnvironment();

}
