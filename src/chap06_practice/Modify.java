package chap06_practice;

import java.util.Scanner;
public class Modify {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");			
			String s = scanner.nextLine(); // ����ڷκ��� �� �� �б�
			StringBuffer sb = new StringBuffer(s); // StringBuffer ��ü sb ����
			if(sb.toString().equals("exit")) {
				System.out.println("�����մϴ�...");	
				break;
			}
			int index = (int)(Math.random()*s.length()); // ������ ������ ��ġ ����
			while(true) {
				int i = (int)(Math.random()*26); // ������ ���ڸ� 26�� ���ĺ� �߿��� ����
				char c = (char)('a' + i); // ���� ������ ���� ����
				if(sb.charAt(index) != c) { // StringBuffer ���� ���ڿ� �����ϴ� ���ڰ� �ٸ� ���
					// s�� index ��ġ�� �ִ� ���ڸ� ���� c�� ����
					sb.replace(index, index+1, Character.toString(c));					
					break; 
				}
			}
			System.out.println(sb);
		}
	}
}
