package chap02_practice;

import java.util.Scanner;

public class LogicalOperation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ������ �Է��ϼ���>>");
		boolean a = scanner.nextBoolean(); // ù ��° �� �� �ϱ�
		String op = scanner.next(); // �� �����ڸ� ���ڿ��� �б�
		boolean b = scanner.nextBoolean(); // �� ��° �� �� �ϱ�

		boolean res=false; // �ܼ��� �ʱ�ȭ�� ����
		switch(op) { // JDK 1.7�̻�
			case "AND": res = a && b; break;
			case "OR" : res = a || b; break;
			default: 
				System.out.println("�߸��� �� �������Դϴ�");
		}
		System.out.println(res);
		scanner.close();
	}

}
