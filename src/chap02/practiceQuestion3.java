package chap02;

import java.util.Scanner;
public class practiceQuestion3 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("논리 연산을 입력하세요" + ">> ");
			boolean a = scanner.nextBoolean();
			String op = scanner.next(); 
			boolean b = scanner.nextBoolean();

			boolean result=false; 
			switch(op) 
			{
				case "AND": 
					result = a && b; 
					break;
				case "OR" : 
					result = a || b; 
					break;
				default: 
					System.out.println("잘못된 논리 연산자입니다");
			}
			System.out.println(result);
			scanner.close();
		}

	}
