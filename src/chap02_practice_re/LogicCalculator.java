package chap02_practice_re;

import java.util.Scanner;

public class LogicCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("논리 연산을 입력하세요>>");
		
		boolean first = scanner.nextBoolean(); 
		String op = scanner.next(); 
		boolean second = scanner.nextBoolean(); 

		boolean result=false; // 초기화.
		
		switch(op) { 
			case "AND": 
				result = first && second; 
				break;
			case "OR" : 
				result = first || second; 
				break;
			default: 
				System.out.println("잘못된 논리 연산자입니다");
		}
		System.out.println(result);
		
		scanner.close();
	}

}
