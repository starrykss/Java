package chap06_practice;

import java.util.Scanner;

public class Kawibawibo {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		final String s[] = {"����", "����", "��"};
		int userChoice, computerChoice;
		
		while (true) {
			System.out.print("����(1), ����(2), ��(3), ������(4)>>");
			userChoice = scanner.nextInt();
			if (userChoice == 4) break; // ���� ������
			
			computerChoice = (int) Math.round(Math.random() * 2 + 1); // 1���� 3������ ��
			if (userChoice < 1 || userChoice > 3) { 
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			} 
			else {
				System.out.print("����� " + s[userChoice-1] + " : ");				
				System.out.println("��ǻ�� " + s[computerChoice-1]);

				int diff = userChoice - computerChoice; 
				switch (diff) {
				case 0: // ���� ���� �� ���
					System.out.println("�����ϴ�.");
					break;
				case -1: // ����ڰ� ����, ��ǻ�Ͱ� ���� �Ǵ� ����ڰ� ����, ��ǻ�Ͱ� ��
				case 2:	// ����ڰ� ��, ��ǻ�Ͱ� ����
					System.out.println("����ڰ� �����ϴ�.");
					break;
				case 1: // ����ڰ� ����, ��ǻ�Ͱ� ���� �Ǵ� ����ڰ� ��, ��ǻ�Ͱ� ����
				case -2: // ����ڰ� ����, ��ǻ�Ͱ� ��
					System.out.println("����ڰ� �̰���ϴ�.");
				}
			}
		}
		scanner.close();
	}
}
