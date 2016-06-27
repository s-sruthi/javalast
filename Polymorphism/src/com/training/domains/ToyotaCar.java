package com.training.domains;

import com.training.ifaces.Automobile;

public class ToyotaCar implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1200000;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "BLACK";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "INNOVA";
	}

}
