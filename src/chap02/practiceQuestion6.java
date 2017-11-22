package chap02;

import java.util.Scanner;
public class practiceQuestion6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하세요" + ">> ");
		int n = scanner.nextInt();

		int first = n/10;
		int second = n%10; 
		
		if(first == 0)
			first = 1; 

		if(second == 0)
			second = 1; 
		
		if(first%3 == 0 && second%3 == 0) { 
			System.out.println("박수짝짝");
		}
		else if((first%3 == 0 && second%3 != 0) || (first%3 != 0 && second%3 == 0)) { 
			System.out.println("박수짝");			
		}
		else 
			System.out.println("박수없음");
		
		scanner.close();
	}

}
