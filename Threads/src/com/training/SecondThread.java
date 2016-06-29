package com.training;

public class SecondThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<=10;i++)
		{
			System.out.println(i+" From current thread :="+ Thread.currentThread().getName());
			
		}
	}

}
