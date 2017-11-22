package chap02_practice;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("식을 입력하세요" + ">> ");
		double num1 = scanner.nextDouble(); 
		String operator = scanner.next(); 
		double num2 = scanner.nextDouble(); 
		
		double result = 0; // result 값 초기화
		switch(operator) {
			case "+" : 	
				result = num1 + num2; 
				break;
			case "-" : 	
				result = num1 - num2; 
				break;
			case "*" : 	
				result = num1 * num2; 
				break;
			case "/" :
				if(num2 == 0) { 
					System.out.println("0으로 나눌 수 없습니다.");		
					return; 
				}
				result = num1 / num2;
				break;
			default: System.out.println("연산 기호가 잘못되었습니다.");
		}
		System.out.println("연산 결과 " + result); 
		
		scanner.close();
	}
}
