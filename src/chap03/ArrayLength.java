package chap03;

import java.util.Scanner;
public class ArrayLength {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("5���� ������ �Է��ϼ���.");
		int intArray[] = new int[5];	// �迭�� ����� ����
		double sum = 0.0;
		for(int i=0; i<intArray.length; i++) 
			intArray[i] = scanner.nextInt(); // Ű���忡�� �Է¹��� ���� ����
		
		for(int i=0; i<intArray.length; i++)
			sum += intArray[i]; // �迭�� ����� ���� ���� ���ϱ�
		
		System.out.print("����� " + sum/intArray.length);
		
		scanner.close();
	}
}