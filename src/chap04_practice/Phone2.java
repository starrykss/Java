package chap04_practice;

import java.util.Scanner;

public class Phone2 {
	private String name, tel;
	public Phone2(String name, String tel) { this.name = name; this.tel = tel; }
	public String getName() { return name; }
	public String getTel() { return tel; }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
		String name = scanner.next();
		String tel = scanner.next();
		Phone2 a = new Phone2(name, tel);
		
		System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
		name = scanner.next();
		tel = scanner.next();
		Phone2 b = new Phone2(name, tel);
		
		System.out.println(a.getName() + "�� ��ȣ " + a.getTel());		
		System.out.println(b.getName() + "�� ��ȣ " + b.getTel());
		
		scanner.close();
	}

}
