package com.training;

public class LoopTest15 {

	public static void goLoop(int a) {
		start: for (int i = 1; i < 2; i++) {
		for (int j = 1; j < 2; j++) {
		if (a < 5) {
		break;
		}
		System.out.print(i + j);
		}
		if (a > 5) {
		break start;
		}
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopTest15.goLoop(15);
	}

}
