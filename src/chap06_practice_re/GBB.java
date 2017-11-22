package chap06_practice_re;

import java.util.Scanner;

public class GBB {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		final String s[] = {"����", "����", "��"};
		int uChoice;
		int cChoice;
		while (true) {
			System.out.print("����(1), ����(2), ��(3), ������(4)>>");
			uChoice = scanner.nextInt();
			if (uChoice == 4) break; 
			cChoice = (int) Math.round(Math.random() * 2 + 1); 
			if (uChoice < 1 || uChoice > 3) { 
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			} 
			else {
				System.out.print("����� " + s[uChoice-1] + " : ");				
				System.out.println("��ǻ�� " + s[cChoice-1]);

				int dif = uChoice - cChoice; 
				switch (dif) {
				case 0: 
					System.out.println("�����ϴ�.");
					break;
				case -1: 
				case 2:	
					System.out.println("����ڰ� �����ϴ�.");
					break;
				case 1: 
				case -2: 
					System.out.println("����ڰ� �̰���ϴ�.");
				}
			}
		}
		scanner.close();
	}
}
