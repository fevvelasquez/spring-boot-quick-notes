package me.fevvelasquez.spring.boot.quicknotes.di;

/**
 * Demo class.
 * 
 * @version 0.0.1 Using 'new' to instantiate objects.
 * @author fevvelasquez@gmail.com
 *
 */
public class Auto {
	private Integer id = 2021;
	private String name = "GTA Deluxe";
	private Motor motor = new Motor();

	@Override
	public String toString() {
		return "Auto [id=" + id + ", name=" + name + ", motor=" + motor + "]";
	}

}