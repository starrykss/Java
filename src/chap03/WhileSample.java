package chap03;

import java.util.Scanner;
public class WhileSample {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int count=0, n=0; // count�� �ԷµǴ� ���� ����
		double sum=0;	// sum�� ��
		
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���.");
		while((n = scanner.nextInt()) != 0) { // 0�� �ԷµǸ� while �� ���
			sum = sum + n;
			count++;
		}
		System.out.println("���� ������ " + count + "���̸� ");
		System.out.println("����� " + sum/count + "�Դϴ�.");
		scanner.close();
	}

}
