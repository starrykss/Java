package chap02;

import java.util.Scanner;
public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();    // ���ڿ� ��ū �б�
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		String city = scanner.next();    // ���ڿ� ��ū �б�
		System.out.println("����� ��� ���ô� " + city + "�Դϴ�.");
		int age = scanner.nextInt(); // ���� ��ū �б�
		System.out.println("����� ���̴� " + age + "���Դϴ�.");
		double weight = scanner.nextDouble();  // �Ǽ� ��ū �б�
		System.out.println("����� ü���� " + weight + "kg�Դϴ�.");
		boolean single = scanner.nextBoolean();  // �� ��ū �б�
		System.out.println("����� ���� ���δ� " + single + "�Դϴ�.");
		
		scanner.close();  // scanner ��Ʈ�� �ݱ�
	}
}
