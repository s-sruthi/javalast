package com.training;

public class Periodicals extends MediaType {

	private int volume;

	public Periodicals() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Periodicals(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public Periodicals(int volume) {
		super();
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
