package chap02_practice;

import java.util.Scanner;

public class GradeSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>>");
		String grade = scanner.next();
		
		switch(grade) {
			case "A": 
			case "B":
				System.out.println("Excellent");
				break;
			case "C": 
			case "D":
				System.out.println("Good");
				break;
			case "F": 
				System.out.println("Bye");
				break;
			default:
				System.out.println("�߸��� �Է�");					
		}

		scanner.close();
	}

}
