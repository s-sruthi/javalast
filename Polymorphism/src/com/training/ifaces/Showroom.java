package com.training.ifaces;

import com.training.domains.MarutiCar;
import com.training.domains.ToyotaCar;
import com.training.ifaces.Automobile;

public class Showroom {

	public Automobile getModel(int key)
	{
		switch (key){
		case 1:
			return new MarutiCar();
		case 2:
			return new ToyotaCar();
		case 3:
			return new Bike();
		default:
			return null;
				
		}
	}
	/**
	 * 
	 * @param polyAuto
	 */
	public void printQuote(Automobile polyAuto)
	{
		System.out.println(Automobile.SHOWROOM_NAME);
		
		System.out.println(polyAuto.getModel());
		System.out.println(polyAuto.getColor());
		System.out.println(polyAuto.getPrice());
	}
	
}
