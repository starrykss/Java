package chap02_practice_re;

import java.util.Scanner;

public class Rect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� (x,y)�� ��ǥ�� �Է��ϼ���>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		String a;
		
		if((x>=50 && y>=50) && (x<=100 && y<=100)) 
			a = "(50, 50)�� (100,100)�� �簢�� ���� �ֽ��ϴ�.";		
		else 
			a = "(50, 50)�� (100,100)�� �簢�� ���� �����ϴ�.";			

		System.out.print("��(" + x + "," + y + ")�� " + a);
		
		scanner.close();
	}

}
