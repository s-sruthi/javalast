package com.training;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class ExampleForJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Starting");
		
		Thread info = new ReadInfo();
		info.start();
		info.interrupt();
		System.out.println("is interrupted :"+info.isInterrupted());
		 try{
			 
			 
			 info.join();
			
		 } catch (InterruptedException e){
			 
			 e.printStackTrace();
		 }
		System.out.println("is alive? :"+info.isAlive());
		
		//info.start();      // coz it is dead.cant make it alive
	
		System.out.println("Main finished");
	}

}
