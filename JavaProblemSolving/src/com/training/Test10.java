package com.training;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class10B b = new Class10B();
		Class10C c = new Class10C();
		b = c;
		newPrint(b);
		}
		public static void newPrint(Class10A a){
		a.printName();
		}

	}

