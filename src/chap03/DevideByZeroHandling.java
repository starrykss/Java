package chap03;

import java.util.Scanner;
public class DevideByZeroHandling {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int dividend; // ������
		int divisor;  // ������
		
		System.out.print("�������� �Է��Ͻÿ�");
		dividend = scanner.nextInt(); // ������ �Է�
		System.out.print("�������� �Է��Ͻÿ�:");
		divisor = scanner.nextInt(); // ������ �Է�
		try {
			System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");
		}
		catch(ArithmeticException e) {//ArithmeticException ���� ó�� �ڵ�
			System.out.println("0���� ���� �� �����ϴ�!");
		}
		finally {
			scanner.close(); // �������̵� ���ܰ� �߻��ϵ� ���������� scanner�� �ݴ´�.
		}
	}
}
