package chap02_practice_re;

import java.util.Scanner;

public class MoneyCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �׼��� �Է��ϼ���>>");
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

		System.out.print("������" + numberof50000 + "��,");
		System.out.print("����" + numberof10000 + "��,");
		System.out.print("õ��" + numberof1000 + "��,");
		System.out.print("500��" + numberof500 + "��,");
		System.out.print("100��" + numberof100 + "��,");		
		System.out.print("10��" + numberof10 + "��,");		
		System.out.println("1��" +money + "��");		
		scanner.close();
	}

}