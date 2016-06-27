package com.training.domains;

import com.training.ifaces.Automobile;

public class MarutiCar implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 7000000.00D;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "SILKY SILVER";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "SWIFT DESIRE";
	}

}
