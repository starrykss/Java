package chap02;

import java.util.Scanner;
public class practiceQuestion1 {
	public static void main(String args[]) {
		
		System.out.print("�� ������ �Է��ϼ���" + ">> ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a + "+" + b + "�� " + (a+b));	
		scanner.close();
	}

}
