/*
package chap05;

import java.util.Scanner;

abstract class Calculator {
	protected int a, b;
	protected void input() {
		Scanner scanner = new Scanner(System.in);		
		System.out.print("정수 2개를 입력하세요>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
	}

	public void run() {
		input();
		int res = calc();
		System.out.println("계산된 값은 " + res);
	}
	abstract protected int calc(); 
}

class Adder extends Calculator {
	public int calc() {
		return a + b;
	}
}

class Subtracter extends Calculator {
	public int calc() {
		return a - b;
	}
}

public class App {
	public static void main(String[] args) {
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();
		adder.run();
		sub.run();
	}
}
*/