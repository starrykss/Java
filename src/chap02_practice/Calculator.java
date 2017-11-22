package chap02_practice;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("���� �Է��ϼ���" + ">> ");
		double num1 = scanner.nextDouble(); 
		String operator = scanner.next(); 
		double num2 = scanner.nextDouble(); 
		
		double result = 0; // result �� �ʱ�ȭ
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
					System.out.println("0���� ���� �� �����ϴ�.");		
					return; 
				}
				result = num1 / num2;
				break;
			default: System.out.println("���� ��ȣ�� �߸��Ǿ����ϴ�.");
		}
		System.out.println("���� ��� " + result); 
		
		scanner.close();
	}
}
