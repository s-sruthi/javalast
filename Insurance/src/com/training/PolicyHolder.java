package com.training;

public class PolicyHolder {

	private String name;
	private String nominee;
	
	
	public PolicyHolder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PolicyHolder(String name, String nominee) {
		super();
		this.name = name;
		this.nominee = nominee;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNominee() {
		return nominee;
	}
	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	
	public String payPremium(double premiumAmount)
	{
		return premiumAmount +":= paid by cash";
	}
	
}
