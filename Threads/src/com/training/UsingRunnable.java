package com.training;

public class UsingRunnable {
	public static void main(String[] args) {
		
		Runnable runnable = new SecondThread();
		
		Thread thread1 = new Thread(runnable,"Suresh");
		//Thread t1 = new MyThread("Ramesh");
		
		Thread thread2 = new Thread(runnable,"Magesh");
		
		Thread thread3 = new Thread(runnable,"Saket");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
				
	}

}
