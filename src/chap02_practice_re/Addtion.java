package chap02_practice_re;

import java.util.Scanner;

public class Addtion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ������ �Է��ϼ���>>");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int sum = num1 + num2;
		
		System.out.println(num1 + "+" + num2 + "�� " + sum);
		
		scanner.close(); 		// ��ĳ�� ����
	}

}

