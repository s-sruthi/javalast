package com.training;

public class DVDs extends MediaType {
	private String author;
	private double runningTime;
	public DVDs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DVDs(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	public DVDs(String author, double runningTime) {
		super();
		this.author = author;
		this.runningTime = runningTime;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(double runningTime) {
		this.runningTime = runningTime;
	}
	
}
