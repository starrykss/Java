package chap03;

import java.util.Scanner;
public class ArrayAccess {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[];		// �迭�� ���� ���۷��� ����
		intArray = new int [5]; // �迭 ����
		int max = 0;  // ���� ���� ū ��
		System.out.println("��� 5���� �Է��ϼ���.");
		for(int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt(); // �Է¹��� ������ �迭�� ����
			if(intArray[i] > max)  // �Է¹��� ���� ���� ���� ũ��
				max = intArray[i]; // max ����
		}
		System.out.print("���� ū ���� " + max + "�Դϴ�.");
		
		scanner.close();
	}
}
