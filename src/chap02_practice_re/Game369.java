package chap02_practice_re;

import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하세요>>");
		int num = scanner.nextInt();

		int first = num/10; // 10으로 나눈 몫 : 십의 자리 수를 구하기 위함
		int second = num%10; // 10으로 나눈 나머지 : 일의 자리 수를 구하기 위함.
		
		if(first == 0) 
			first = 1; // 3의 배수가 아닌 임의의 수로 변경

		if(second == 0) 
			second = 1; // 3의 배수가 아닌 임의의 수로 변경
		
		if(first%3 == 0 && second%3 == 0) { // 십의 자리 수와 일의 자리 수가 모두 3의 배수일 경우
			System.out.println("박수짝짝");
		}
		else if((first%3 == 0 && second%3 != 0) || (first%3 != 0 && second%3 == 0)) { // 십의 자리 수와 일의 자리 수 중 하나가 3의 배수일 경우
			System.out.println("박수짝");			
		}
		else 
			System.out.println("박수없음");
		
		scanner.close(); // 스캐너 종료
	}

}