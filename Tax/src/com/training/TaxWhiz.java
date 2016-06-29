package com.training;

public class TaxWhiz {
	private double purchaseRate;
	private double currentRate;
	private double surcharge;
	private double totalAmount;
	
	public TaxWhiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaxWhiz(double purchaseRate, double currentRate, double surcharge) {
		super();
		this.purchaseRate = purchaseRate;
		this.currentRate = currentRate;
		this.surcharge = surcharge;
	}
	public double getPurchaseRate() {
		System.out.println("Purchase Amount");
		System.out.println(purchaseRate);
		return purchaseRate;
	}
	public void setPurchaseRate(double purchaseRate) {
		this.purchaseRate = purchaseRate;
	}
	public double getCurrentRate() {
		System.out.println("Tax");
		System.out.println(currentRate*purchaseRate);
		return currentRate;
	}
	public void setCurrentRate(double currentRate) {
		this.currentRate = currentRate;
	}
	public double getSurcharge() {
		System.out.println("Surcharge");
		System.out.println(purchaseRate*currentRate*surcharge);
		return surcharge;
	}
	public void setSurcharge(double surcharge) {
		this.surcharge = surcharge;
	}
	
	public double calcTax(){
		totalAmount = purchaseRate+(purchaseRate*currentRate)+(purchaseRate*currentRate*surcharge);
		System.out.println("Total Amount");
		System.out.println(totalAmount);
		return totalAmount;
	}
}

