package chap02_practice_re;

import java.util.Scanner;

public class MoneyCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요>>");
		int money = scanner.nextInt();

		int numberof50000 = money/50000; 
		money = money%50000;  
		
		int numberof10000 = money/10000; 
		money = money%10000; 
		
		int numberof1000 = money/1000; 
		money = money%1000; 
		
		int numberof500 = money/500; 
		money = money%500; 
		
		int numberof100 = money/100; 
		money = money%100; 	
		
		int numberof10 = money/10; 
		money = money%10; 	

		System.out.print("오만원" + numberof50000 + "개,");
		System.out.print("만원" + numberof10000 + "개,");
		System.out.print("천원" + numberof1000 + "개,");
		System.out.print("500원" + numberof500 + "개,");
		System.out.print("100원" + numberof100 + "개,");		
		System.out.print("10원" + numberof10 + "개,");		
		System.out.println("1원" +money + "개");		
		scanner.close();
	}

}