package chap02_practice;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요>>");
		int money = scanner.nextInt();

		int n50000 = money/50000; // 오만원권 개수
		money = money%50000; // 나머지
		int n10000 = money/10000; // 만원권 개수
		money = money%10000; // 나머지		
		int n1000 = money/1000; // 천원권 개수
		money = money%1000; // 나머지		
		int n500 = money/500; // 오백원 동전 개수
		money = money%500; // 나머지		
		int n100 = money/100; // 백원 동전 개수
		money = money%100; // 나머지		
		int n10 = money/10; // 십원 동전 개수
		money = money%10; // 나머지, 1원 동전 개수		

		System.out.print("오만원"+n50000+"개,");
		System.out.print("만원"+n10000+"개,");
		System.out.print("천원"+n1000+"개,");
		System.out.print("500원"+n500+"개,");
		System.out.print("100원"+n100+"개,");		
		System.out.print("10원"+n10+"개,");		
		System.out.println("1원"+money+"개");		
		scanner.close();
	}

}
