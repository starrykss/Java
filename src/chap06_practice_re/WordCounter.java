package chap06_practice_re;

import java.util.*;

public class WordCounter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String sentence = scanner.nextLine();
			if(sentence.equals("exit")) {
				System.out.println("�����մϴ�...");	
				break;
			}
			StringTokenizer strTok = new StringTokenizer(sentence, " ");	
			System.out.println("���� ������ " + strTok.countTokens());
		}
	}
}
