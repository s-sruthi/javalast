package com.training;

public abstract class MediaType {
	private String title;

	public MediaType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MediaType(String title) {
		super();
		this.title = title;
	}
	public void display()
	{
		System.out.println(getTitle());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}