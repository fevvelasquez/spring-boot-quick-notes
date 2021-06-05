package me.fevvelasquez.spring.boot.quicknotes.qualifiers;

/**
 * Demo class.
 * 
 * @version 0.0.4 Using @Qualifier and @Primary for cases with multiple
 *          implementation.
 * @author fevvelasquez@gmail.com
 *
 */
public abstract class Animal {
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [name=" + name + "]";
	}

}
