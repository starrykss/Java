package chap02;

import java.util.Scanner;
public class practiceQuestion4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �׼��� �Է��ϼ���" + ">> ");
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

		System.out.print("������"+omanwon+"��,");
		System.out.print("����"+manwon+"��,");
		System.out.print("õ��"+cheonwon+"��,");
		System.out.print("500��"+obaekwon+"��,");
		System.out.print("100��"+baekwon+"��,");		
		System.out.print("10��"+sipwon+"��,");		
		System.out.println("1��"+money+"��");		
		scanner.close();
	}

}
