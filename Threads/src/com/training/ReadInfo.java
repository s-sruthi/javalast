package com.training;

import java.io.IOException;

public class ReadInfo extends Thread {

	public void run(){
		
		System.out.println("start Reading");
		
		try{
			System.out.println("is alive? :"+this.isAlive());
		    System.in.read();
		}catch (IOException e){
			e.printStackTrace();
		}
		
		System.out.println("finish reading");
	}
}
