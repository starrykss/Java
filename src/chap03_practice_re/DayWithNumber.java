package chap03_practice_re;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DayWithNumber {
	public static void main(String[] args) {
		char [] days = {'일', '월', '화', '수', '목', '금', '토'};
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수를 입력하세요>>");
			int num;
			
			try {
				num = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("경고! 수를 입력하지 않았습니다.");
				scanner.next();
				continue;
			}
			
			// finally 생략.
			if(num < 0) {
				System.out.println("프로그램 종료합니다...");
				break;
			}
			int index = num%days.length;
			System.out.println(days[index]);
		}
		scanner.close();
	}
}
