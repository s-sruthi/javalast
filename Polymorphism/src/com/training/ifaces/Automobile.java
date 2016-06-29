package com.training.ifaces;

public interface Automobile {
	
	static final String SHOWROOM_NAME = "RAMESH CARS";
	
	//all the methods in the interface are implicitely public and abstract

	double getPrice(); //all 3 are public and abstract even if u define or not
	String getColor();
	String getModel();
	
}
