package chap02;

import java.util.Scanner;
public class Season {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��(1~12)�� �Է��Ͻÿ�:");
		int month = scanner.nextInt(); // ������ �� �Է�
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("���Դϴ�.");
			break;
		case 6: case 7: case 8:   // case:�� ���� �� ���� ����
			System.out.println("�����Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.println("�����Դϴ�.");
			break;
		case 12: case 1: case 2:
			System.out.println("�ܿ��Դϴ�."); break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		scanner.close();
	}
}
