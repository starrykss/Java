package chap02;

import java.util.Scanner;
public class practiceQuestion1 {
	public static void main(String args[]) {
		
		System.out.print("두 정수를 입력하세요" + ">> ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a + "+" + b + "은 " + (a+b));	
		scanner.close();
	}

}
