package chap04_practice;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() { return name; }
	public String getTel() { return tel; }
}

public class PhoneManager {
	Scanner scanner;
	Phone [] p;
	PhoneManager() { 
		scanner = new Scanner(System.in);
	}
	
	void read() {
		System.out.print("�ο���>>");
		int n = scanner.nextInt();
		
		p = new Phone [n]; // n ���� ������ �迭 ����
		for(int i=0; i<p.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�)>>");			
			String name = scanner.next();
			String tel = scanner.next();
			p[i] = new Phone(name, tel);
		}
		
		System.out.println("����Ǿ����ϴ�...");		
	}
	
	String search(String name) {
		for(int i=0; i<p.length; i++) {
			if(p[i].getName().equals(name))
				return p[i].getTel();
		}
		return null;
	}
	
	void run() {
		read();
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String name = scanner.next();
			if(name.equals("exit"))
				break;
			String tel = search(name);
			if(tel == null)
				System.out.println(name + " �� �����ϴ�.");
			else
				System.out.println(name + "�� ��ȣ�� " + tel + " �Դϴ�.");				
		}	
	}
	
	public static void main(String[] args) {
		new PhoneManager().run();
	}
}
