package chap06_practice_re;

import java.util.Scanner;

public class GBB {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		final String s[] = {"가위", "바위", "보"};
		int uChoice;
		int cChoice;
		while (true) {
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>>");
			uChoice = scanner.nextInt();
			if (uChoice == 4) break; 
			cChoice = (int) Math.round(Math.random() * 2 + 1); 
			if (uChoice < 1 || uChoice > 3) { 
				System.out.println("잘못 입력하셨습니다.");
			} 
			else {
				System.out.print("사용자 " + s[uChoice-1] + " : ");				
				System.out.println("컴퓨터 " + s[cChoice-1]);

				int dif = uChoice - cChoice; 
				switch (dif) {
				case 0: 
					System.out.println("비겼습니다.");
					break;
				case -1: 
				case 2:	
					System.out.println("사용자가 졌습니다.");
					break;
				case 1: 
				case -2: 
					System.out.println("사용자가 이겼습니다.");
				}
			}
		}
		scanner.close();
	}
}
