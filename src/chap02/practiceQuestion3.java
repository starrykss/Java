package chap02;

import java.util.Scanner;
public class practiceQuestion3 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("�� ������ �Է��ϼ���" + ">> ");
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
					System.out.println("�߸��� �� �������Դϴ�");
			}
			System.out.println(result);
			scanner.close();
		}

	}
