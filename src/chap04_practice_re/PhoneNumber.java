package chap04_practice_re;

import java.util.Scanner;

public class PhoneNumber {
	private String name;
	private String number;
	public PhoneNumber(String name, String number) { 
		this.name = name; this.number = number; }
	public String getName() { 
		return name; }
	public String getNumber() { 
		return number; }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
		String name = scanner.next();
		String number = scanner.next();
		
		PhoneNumber per1 = new PhoneNumber(name, number);
		
		System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
		name = scanner.next();
		number = scanner.next();
		PhoneNumber per2 = new PhoneNumber(name, number);
		
		System.out.println(per1.getName() + "�� ��ȣ " + per1.getNumber());		
		System.out.println(per2.getName() + "�� ��ȣ " + per2.getNumber());
		
		scanner.close();
	}

}
