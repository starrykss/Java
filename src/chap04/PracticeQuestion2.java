package chap04;

import java.util.Scanner;

public class PracticeQuestion2 {

	private String name;
	private String tel;
	public PracticeQuestion2(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {return name;}
	public String getTel() {return tel;}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸��� ��ȭ��ȣ �Է�>>");
		PracticeQuestion2 phone1 = new PracticeQuestion2(scanner.next(), scanner.next());
		System.out.print("�̸��� ��ȭ��ȣ �Է�>>");
		PracticeQuestion2 phone2 = new PracticeQuestion2(scanner.next(),scanner.next());
		System.out.println(phone1.getName() + "�� ��ȣ " + phone1.getTel());
		System.out.println(phone2.getName() + "�� ��ȣ " + phone2.getTel());
		scanner.close();	
	}
}
