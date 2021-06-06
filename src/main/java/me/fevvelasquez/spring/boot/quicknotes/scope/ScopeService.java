package me.fevvelasquez.spring.boot.quicknotes.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Demo class.
 * 
 * @version 0.0.6. Using @Scope and @Bean.
 * @author fevvelasquez@gmail.com
 *
 */
@Service
@Scope("prototype") // "singleton" by default
public class ScopeService {

}
