// 어려워서 정답을 참고하였습니다.

package chap04_practice_re;

import java.util.Scanner;

class Phone { // Phone 클래스
	private String name, number;
	public Phone(String name, String number) {
		this.name = name;
		this.number = number;
	}
	public String getName() { return name; }
	public String getNumber() { return number; }
}

public class PhoneDict { // PhoneDict 클래스
	Scanner scanner;
	Phone [] person;
	PhoneDict() { 
		scanner = new Scanner(System.in);
	}
	
	void read() { // read() 매개 함수
		System.out.print("인원수>>");
		int num = scanner.nextInt();
		
		person = new Phone [num];
		for(int i=0; i<person.length; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");			
			String name = scanner.next();
			String number = scanner.next();
			person[i] = new Phone(name, number);
		}
		System.out.println("저장되었습니다...");		
	}
	
	String search(String name) { // search() 매개 함수
		for(int i=0; i<person.length; i++) {
			if(person[i].getName().equals(name))
				return person[i].getNumber();
		}
		return null;
	}
	
	void run() { // run() 매개 함수
		read();
		while(true) {
			System.out.print("검색할 이름>>");
			String name = scanner.next();
			if(name.equals("exit"))
				break;
			String number = search(name);
			if(number == null)
				System.out.println(name + " 이 없습니다.");
			else
				System.out.println(name + "의 번호는 " + number + " 입니다.");				
		}	
	}
	
	public static void main(String[] args) {
		new PhoneDict().run();
	}
}