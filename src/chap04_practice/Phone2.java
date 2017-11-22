package chap04_practice;

import java.util.Scanner;

public class Phone2 {
	private String name, tel;
	public Phone2(String name, String tel) { this.name = name; this.tel = tel; }
	public String getName() { return name; }
	public String getTel() { return tel; }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름과 전화번호 입력 >>");
		String name = scanner.next();
		String tel = scanner.next();
		Phone2 a = new Phone2(name, tel);
		
		System.out.print("이름과 전화번호 입력 >>");
		name = scanner.next();
		tel = scanner.next();
		Phone2 b = new Phone2(name, tel);
		
		System.out.println(a.getName() + "의 번호 " + a.getTel());		
		System.out.println(b.getName() + "의 번호 " + b.getTel());
		
		scanner.close();
	}

}
