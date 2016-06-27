package com.training.ifaces;

public interface Automobile {
	
	public static final String SHOWROOM_NAME = "RAMESH CARS";
	
	//all the methods in the interface are implicitely public and abstract

	public abstract double getPrice(); //all 3 are public and abstract even if u define or not
	public String getColor();
	String getModel();
	
}
