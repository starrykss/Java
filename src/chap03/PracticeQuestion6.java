package chap03;

import java.util.Scanner;

public class PracticeQuestion6 {
	public static void main(String[] args) {
		String eng[] = { "student", "love", "java", "happy", "future" };
		String kor[] = { "�л�", "���", "�ڹ�", "�ູ��", "�̷�" };
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("���� �ܾ �Է��ϼ���" + ">>");			
			String s = scanner.nextLine(); 
			if(s.equals("exit")) 
				break; 

			int i;
			for(i=0; i<eng.length; i++) {
				if(eng[i].equals(s)) {
					System.out.println(kor[i]);
					break;
				}
			}
			if(i==eng.length) 
				System.out.println("�׷� ���� �ܾ �����ϴ�.");
		}
		scanner.close();
	}
}
