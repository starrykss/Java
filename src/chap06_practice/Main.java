package chap06_practice;

import chap06_practice.Adder; 		// util -> chap06_practice·Î º¯°æ.

public class Main {
	public static void main(String[] args) {
		Adder adder = new Adder(2, 5);
		System.out.println(adder.add());
	}
}
