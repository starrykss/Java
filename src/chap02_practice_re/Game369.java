package chap02_practice_re;

import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��ϼ���>>");
		int num = scanner.nextInt();

		int first = num/10; // 10���� ���� �� : ���� �ڸ� ���� ���ϱ� ����
		int second = num%10; // 10���� ���� ������ : ���� �ڸ� ���� ���ϱ� ����.
		
		if(first == 0) 
			first = 1; // 3�� ����� �ƴ� ������ ���� ����

		if(second == 0) 
			second = 1; // 3�� ����� �ƴ� ������ ���� ����
		
		if(first%3 == 0 && second%3 == 0) { // ���� �ڸ� ���� ���� �ڸ� ���� ��� 3�� ����� ���
			System.out.println("�ڼ�¦¦");
		}
		else if((first%3 == 0 && second%3 != 0) || (first%3 != 0 && second%3 == 0)) { // ���� �ڸ� ���� ���� �ڸ� �� �� �ϳ��� 3�� ����� ���
			System.out.println("�ڼ�¦");			
		}
		else 
			System.out.println("�ڼ�����");
		
		scanner.close(); // ��ĳ�� ����
	}

}