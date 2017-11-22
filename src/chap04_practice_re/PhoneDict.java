// ������� ������ �����Ͽ����ϴ�.

package chap04_practice_re;

import java.util.Scanner;

class Phone { // Phone Ŭ����
	private String name, number;
	public Phone(String name, String number) {
		this.name = name;
		this.number = number;
	}
	public String getName() { return name; }
	public String getNumber() { return number; }
}

public class PhoneDict { // PhoneDict Ŭ����
	Scanner scanner;
	Phone [] person;
	PhoneDict() { 
		scanner = new Scanner(System.in);
	}
	
	void read() { // read() �Ű� �Լ�
		System.out.print("�ο���>>");
		int num = scanner.nextInt();
		
		person = new Phone [num];
		for(int i=0; i<person.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�)>>");			
			String name = scanner.next();
			String number = scanner.next();
			person[i] = new Phone(name, number);
		}
		System.out.println("����Ǿ����ϴ�...");		
	}
	
	String search(String name) { // search() �Ű� �Լ�
		for(int i=0; i<person.length; i++) {
			if(person[i].getName().equals(name))
				return person[i].getNumber();
		}
		return null;
	}
	
	void run() { // run() �Ű� �Լ�
		read();
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String name = scanner.next();
			if(name.equals("exit"))
				break;
			String number = search(name);
			if(number == null)
				System.out.println(name + " �� �����ϴ�.");
			else
				System.out.println(name + "�� ��ȣ�� " + number + " �Դϴ�.");				
		}	
	}
	
	public static void main(String[] args) {
		new PhoneDict().run();
	}
}