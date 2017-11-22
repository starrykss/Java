package chap03_practice_re;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DayWithNumber {
	public static void main(String[] args) {
		char [] days = {'��', '��', 'ȭ', '��', '��', '��', '��'};
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("������ �Է��ϼ���>>");
			int num;
			
			try {
				num = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("���! ���� �Է����� �ʾҽ��ϴ�.");
				scanner.next();
				continue;
			}
			
			// finally ����.
			if(num < 0) {
				System.out.println("���α׷� �����մϴ�...");
				break;
			}
			int index = num%days.length;
			System.out.println(days[index]);
		}
		scanner.close();
	}
}
