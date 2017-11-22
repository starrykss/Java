package chap03_practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddAndEvenWithInputMismatchException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>>");
		int n;
		try {
			n = scanner.nextInt();
			if(n%2 == 0)
				System.out.println("¦��");
			else
				System.out.println("Ȧ��");			
		}
		catch(InputMismatchException e) {
			System.out.println("���� �Է����� �ʾ� ���α׷� �����մϴ�.");
		}
		finally {
			scanner.close();
		}
	}
}
