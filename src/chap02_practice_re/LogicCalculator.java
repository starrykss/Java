package chap02_practice_re;

import java.util.Scanner;

public class LogicCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ������ �Է��ϼ���>>");
		
		boolean first = scanner.nextBoolean(); 
		String op = scanner.next(); 
		boolean second = scanner.nextBoolean(); 

		boolean result=false; // �ʱ�ȭ.
		
		switch(op) { 
			case "AND": 
				result = first && second; 
				break;
			case "OR" : 
				result = first || second; 
				break;
			default: 
				System.out.println("�߸��� �� �������Դϴ�");
		}
		System.out.println(result);
		
		scanner.close();
	}

}
