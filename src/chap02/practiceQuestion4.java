package chap02;

import java.util.Scanner;
public class practiceQuestion4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요" + ">> ");
		int money = scanner.nextInt();

		int omanwon = money/50000; 
		money = money%50000;
		int manwon = money/10000;
		money = money%10000;	
		int cheonwon = money/1000; 
		money = money%1000;		
		int obaekwon = money/500; 
		money = money%500;		
		int baekwon = money/100;
		money = money%100; 		
		int sipwon = money/10; 
		money = money%10; 		

		System.out.print("오만원"+omanwon+"개,");
		System.out.print("만원"+manwon+"개,");
		System.out.print("천원"+cheonwon+"개,");
		System.out.print("500원"+obaekwon+"개,");
		System.out.print("100원"+baekwon+"개,");		
		System.out.print("10원"+sipwon+"개,");		
		System.out.println("1원"+money+"개");		
		scanner.close();
	}

}
