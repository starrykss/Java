package chap02_practice_re;

import java.util.Scanner;

public class ScoreSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>>");
		
		String score = scanner.next();
		
		switch(score) {
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

