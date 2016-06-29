package com.training;

public class UsingThreadclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new MyThread("Ramesh");

		Thread t2 = new MyThread("Rajesh");
		
		Thread t3 = new MyThread("Rakesh");
		
		//making it runnable
		t1.start();
		t2.start();
		t3.start();
		
		//t1.run();
		//t2.run();
		//t3.run();
		
		
	}

}
