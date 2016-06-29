package com.training;

public class Application {

	public static void main(String[] args) {
		TaxWhiz amount = new TaxWhiz(1000,0.1,0.05);
		amount.getPurchaseRate();
		amount.getCurrentRate();
		amount.getSurcharge();
		amount.calcTax();
	}
}
