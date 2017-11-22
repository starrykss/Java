package chap04;

import java.util.Scanner;
class Phone {
	String name;
	String tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {return name;}
	public String getTel() {return tel;}
}

public class PracticeQuestion4 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.print("�ο��� >> ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Phone[] phone = new Phone[n];

		for (int i = 0; i < n; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�) >> ");
			phone[i] = new Phone(scanner.next(), scanner.next());
		}

		System.out.println("����Ǿ����ϴ�");

		while (true) {
			System.out.print("�˻��� �̸� >> ");
			String string = scanner.next();
			if (string.equals("exit"))
				break; 

			for (int i = 0; i < n; i++) {
			if (string.equals(phone[i].name)) {
			System.out.println(string + "�� ��ȣ�� " + phone[i].tel + "�Դϴ�.");
			break;
			}

			if(i==n-1)
			System.out.println(string + "�� �����ϴ�. ");	
			}
		}
		scanner.close();
	}
}