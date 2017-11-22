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
		
		System.out.print("이름과 전화번호 입력 >>");
		String name = scanner.next();
		String number = scanner.next();
		
		PhoneNumber per1 = new PhoneNumber(name, number);
		
		System.out.print("이름과 전화번호 입력 >>");
		name = scanner.next();
		number = scanner.next();
		PhoneNumber per2 = new PhoneNumber(name, number);
		
		System.out.println(per1.getName() + "의 번호 " + per1.getNumber());		
		System.out.println(per2.getName() + "의 번호 " + per2.getNumber());
		
		scanner.close();
	}

}
