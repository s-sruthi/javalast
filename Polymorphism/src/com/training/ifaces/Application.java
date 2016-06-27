package com.training.ifaces;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch ="Y";
		
		
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Enter 1 for Maruti 2 for Toyota 3 for Bike");
		int key = sc.nextInt();
		
		Showroom obj = new NewShowRoom();
		Automobile polyAuto = obj.getModel(key);
		if(polyAuto==null)
		{
			System.out.println("invalid choice");
		}
		else
		{
			obj.printQuote(polyAuto);
		}
		System.out.println("Y to continue N to Exit");
		ch = sc.next();
		}
		while(ch.equalsIgnoreCase("Y"));
		//obj.printQuote(polyAuto);
		//obj.getModel(key);
		//obj.printQuote(obj.getModel(key));
		sc.close();
	}

}
