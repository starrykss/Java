package chap06_practice;

import java.util.Scanner;

public class Kawibawibo {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		final String s[] = {"가위", "바위", "보"};
		int userChoice, computerChoice;
		
		while (true) {
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>>");
			userChoice = scanner.nextInt();
			if (userChoice == 4) break; // 게임 끝내기
			
			computerChoice = (int) Math.round(Math.random() * 2 + 1); // 1부터 3까지의 수
			if (userChoice < 1 || userChoice > 3) { 
				System.out.println("잘못 입력하셨습니다.");
			} 
			else {
				System.out.print("사용자 " + s[userChoice-1] + " : ");				
				System.out.println("컴퓨터 " + s[computerChoice-1]);

				int diff = userChoice - computerChoice; 
				switch (diff) {
				case 0: // 같은 것을 낸 경우
					System.out.println("비겼습니다.");
					break;
				case -1: // 사용자가 가위, 컴퓨터가 바위 또는 사용자가 바위, 컴퓨터가 보
				case 2:	// 사용자가 보, 컴퓨터가 가위
					System.out.println("사용자가 졌습니다.");
					break;
				case 1: // 사용자가 바위, 컴퓨터가 가위 또는 사용자가 보, 컴퓨터가 바위
				case -2: // 사용자가 가위, 컴퓨터가 보
					System.out.println("사용자가 이겼습니다.");
				}
			}
		}
		scanner.close();
	}
}
