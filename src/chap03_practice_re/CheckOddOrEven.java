package chap03_practice_re;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckOddOrEven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요>>");
		
		int num;
		
		try {
			num = scanner.nextInt();
			if(num%2 == 0)
				System.out.println("짝수");
			else
				System.out.println("홀수");			
		}
		catch(InputMismatchException e) {
			System.out.println("수를 입력하지 않아 프로그램 종료합니다.");
		}
		finally {
			scanner.close();
		}
	}
}
