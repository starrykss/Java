package chap02;

import java.util.Scanner;
public class practiceQuestion2 {
	public static void main(String args[]) {
		
		System.out.print("�� (x, y)�� ��ǥ�� �Է��ϼ���" + ">> " );
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if (((a >= 50) && (a <= 100)) && ((b >= 50) && (b <= 100)))
				System.out.println("��(" + a + "," + b +")" + "��" +"(50, 50)�� (100, 100)�� �簢�� ���� �ֽ��ϴ�.");
		else
				System.out.println("��(" + a + "," + b +")" + "��" +"(50, 50)�� (100, 100)�� �簢�� ���� �����ϴ�.");		
		
		scan.close();
	}
}
