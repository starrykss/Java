package chap06_practice;

import java.util.*;

public class WordCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String s = scanner.nextLine();
			if(s.equals("exit")) {
				System.out.println("�����մϴ�...");	
				break;
			}
			StringTokenizer st = new StringTokenizer(s, " ");	
			System.out.println("���� ������ " + st.countTokens());
		}
	}
}
