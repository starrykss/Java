package chap03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticeQuestion3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���" + ">>");
		
		int a;
		
		try {
			a = scanner.nextInt();
			if(a%2 == 0)
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
